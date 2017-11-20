package uk.co.o2.onlinehelp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import uk.co.o2.onlinehelp.interceptor.UniqueTransactionIdInterceptor;
import uk.co.o2.onlinehelp.interceptor.XSSFilter;
import uk.co.o2.onlinehelp.util.DynamicProperties;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@Configuration
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@ComponentScan(basePackages = {"uk.co.o2.onlinehelp.*, uk.co.o2.onlinehelp.controller.*," +
        "uk.co.o2.onlinehelp.logger.*", "uk.co.o2.onlinehelp.util.*"})
@ImportResource("classpath:config.xml")
public class AssetConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        for (Entry<String, String> entry : retriveMap(DynamicProperties.getProperty("application.asset.paths")).entrySet()) {
            registry.addResourceHandler(entry.getKey() + "**").addResourceLocations(entry.getValue());
        }
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UniqueTransactionIdInterceptor());
    }

    public Map<String, String> retriveMap(String input) {
        Map<String, String> map = new WeakHashMap<>(input.length());
        String[] rawExternalPaths = input.split(";");

        String a = "";
        for (String path : rawExternalPaths) {
            a = path.substring(path.lastIndexOf("/", (path.lastIndexOf("/") - 1)));
            map.put(a, path);
        }
        return map;
    }

    @SpringBootApplication
    @EnableAspectJAutoProxy
    @EnableCaching
    public static class OnlineHelpApplication {

        @Autowired
        private ErrorAttributes errorAttributes;

        public static void main(String[] args) {

            SpringApplication.run(OnlineHelpApplication.class, args);
        }

        @Bean
        public FilterRegistrationBean xssFilter() {
            FilterRegistrationBean registration = new FilterRegistrationBean();
            registration.setFilter(new XSSFilter());
            return registration;
        }
    }

    public static class ServletInitializer extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(OnlineHelpApplication.class);
        }

    }
}