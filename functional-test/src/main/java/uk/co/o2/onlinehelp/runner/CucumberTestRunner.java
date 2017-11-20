package uk.co.o2.onlinehelp.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:feature"}, glue = {"classpath:uk.co.o2.onlinehelp.stepdef"},
        plugin = {"pretty", "html:target/cucumber"})
public class CucumberTestRunner {

    /*static {
        System.setProperty("webdriver.chrome.driver", "/home/cts1/projects/Eservices_Online_help/functional-test/src/main/resources/drivers/linux/chromedriver");
    }*/

}
