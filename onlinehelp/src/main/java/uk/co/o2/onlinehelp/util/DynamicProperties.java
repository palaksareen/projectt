package uk.co.o2.onlinehelp.util;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.core.io.Resource;
import uk.co.o2.onlinehelp.exception.PropertyFileException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DynamicProperties extends PropertyResourceConfigurer {

    private static PropertiesConfiguration configuration = null;

    private OnlineHelpLogger logger;

    Resource extLocation;

    public DynamicProperties() {
        super();
    }

    public static synchronized String getProperty(final String key) {
        return (String) configuration.getProperty(key);
    }

    public static synchronized Boolean getBooleanProperty(final String key) {
        return Boolean.valueOf((String) configuration.getProperty(key));
    }

    public static synchronized int getIntegerProperty(final String key) {
        return Integer.valueOf((String) configuration.getProperty(key));
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory arg0, Properties arg1) throws BeansException {

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeanInitializationException {

        try {
            File externalPropFile = getExtLocation().getFile();
            File internalPropFile = new File(this.getClass().getClassLoader().getResource("onlinehelp.properties").toURI());

            if (!externalPropFile.exists()) {
                throw new PropertyFileException("External Properties file doesn't exist at location: " + externalPropFile
                        .getAbsolutePath());
            } else {
                // Compare both files
                List<String> externalPropsList = getKeys(externalPropFile);
                List<String> internalPropsList = getKeys(internalPropFile);
                List<String> internalExtraPropsList = internalPropsList.stream().filter(s -> !externalPropsList.contains(s)).collect(Collectors.toList());

                if (internalExtraPropsList.size() > 0) {
                    throw new PropertyFileException("External property file has some missing" +
                            " properties. " + internalExtraPropsList);
                }

                if (externalPropsList.size() > internalPropsList.size()) {
                    externalPropsList.removeAll(internalPropsList);
                    logger.errorLog(new PropertyFileException("External property file has " +
                                    "some extra properties. "), "Extra Properties are: ",
                            externalPropsList.toString());
                }
                configuration = new PropertiesConfiguration(externalPropFile.getAbsolutePath());
            }
            super.postProcessBeanFactory(beanFactory);
            configuration.setReloadingStrategy(new FileChangedReloadingStrategy());
        } catch (Exception e) {
            StringBuilder msg = new StringBuilder("Reading from property file fails.");
            logger.errorLog(e, msg.toString());
            if (e instanceof PropertyFileException) {
                msg.append(e.getMessage());
            }
            throw new BeanInitializationException(msg.toString());
        }

    }


    public List<String> getKeys(File file) throws IOException {
        Function<String, String> extract = (content) -> {
            if (content != null && !content.isEmpty() && content.contains("=") && !content.contains("#"))
                return content.substring(0, content.indexOf("="));
            return "";
        };

        return FileUtils.readLines(file, "UTF-8").stream().map(extract).collect(Collectors.toList());
    }

    public static PropertiesConfiguration getConfiguration() {
        return configuration;
    }

    public static void setConfiguration(PropertiesConfiguration configuration) {
        DynamicProperties.configuration = configuration;
    }

    public Resource getExtLocation() {
        return extLocation;
    }

    public void setExtLocation(Resource extLocation) {
        this.extLocation = extLocation;
    }

    public void setLogger(OnlineHelpLogger logger) {
        this.logger = logger;
    }
}
