package uk.co.o2.onlinehelp.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.o2.onlinehelp.constant.FTConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class UnlockYourPhoneStepDef {

    private static final String host;
    private static final String port;

    private WebDriver driver;

    @Before
    public void openBrowser() {

        driver = new HtmlUnitDriver();
//        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
    }


    static {
        if (System.getenv("host") != null) {
            host = System.getenv("host");
        } else {
            host = "localhost.ref.o2.co.uk";
        }


        if (System.getenv("port") != null) {
            port = System.getenv("port");
        } else {
            port = "8080";
        }
//        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

    }

    @Given("^The user lands on homepage for UMM$")
    public void The_user_lands_on_homepage_for_UMM() {
        driver.get("http://" + host + ":" + port + "/onlinehelp/handsetunlockingform");
        driver.manage().window().maximize();
//        driver.get("https://www.ref.o2.co.uk/apps/help/help/handsetunlockingform");
        //driver.get("http://localhost.ref.o2.co.uk:8080/onlinehelp/handsetunlockingform");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Assert.assertEquals("Unlocking an O2 mobile to use on a different network", driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h2")).getText());

        Assert.assertTrue("Your details step image", StringUtils.endsWith(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[1]/span[1]/img")).getAttribute("src"), "_asset/img/1-selected.png"));
        Assert.assertTrue("Your security details step image", StringUtils.endsWith(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[1]/span[3]/img")).getAttribute("src"), "_asset/img/2-unselected.png"));
        Assert.assertTrue("Additional information step image", StringUtils.endsWith(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[1]/span[5]/img")).getAttribute("src"), "_asset/img/3-unselected.png"));

        Assert.assertTrue("Your details", StringUtils.contains(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[2]/span[1]")).getAttribute("class"), "active"));
        Assert.assertTrue("Your security details", !StringUtils.contains(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[2]/span[2]")).getAttribute("class"), "active"));
        Assert.assertTrue("Additional information", !StringUtils.contains(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[2]/span[3]")).getAttribute("class"), "active"));
    }

    @When("^The user is (.*)$")
    public void the_user_is(String arg1) {
//        Assert.assertEquals("Tariff question text", "What kind of tariff are you on?*", driver.findElement(By.xpath("//div[@id='onlineForm']/div[1]/label")).getText());
        Map<String, String> accountTypeMap = new HashMap<>();
        accountTypeMap.put("Business", "biz");
        accountTypeMap.put("Pay Monthly", "paym");
        accountTypeMap.put("Pay As You Go", "payg");
        accountTypeMap.put("Select tariff", "");
        Select selectTariff = new Select(driver.findElement(By.id("accountType")));
        selectTariff.selectByValue(accountTypeMap.get(arg1));
    }

    @And("^user selects phone type as (.*)$")
    public void user_selects_phone_type_as(String arg1) {
        Map<String, String> phoneTypeMap = new HashMap<>();
        phoneTypeMap.put("Apple iPhone", "Apple iPhone");
        phoneTypeMap.put("Palm Pre", "Palm Pre");
        phoneTypeMap.put("Blackberry", "Blackberry");
        phoneTypeMap.put("LG", "LG");
        phoneTypeMap.put("O2", "O2");
        phoneTypeMap.put("Nokia", "Nokia");
        phoneTypeMap.put("Motorola", "Motorola");
        phoneTypeMap.put("Samsung", "Samsung");
        phoneTypeMap.put("Sony Ericsson", "Sony Ericsson");
        phoneTypeMap.put("Other", "Other");
        phoneTypeMap.put("Select phone", "");
        Select selectPhone = new Select(driver.findElement(By.id("phoneType")));
        selectPhone.selectByValue(phoneTypeMap.get(arg1));
    }

    @And("^user enters mobile number as (.*)$")
    public void user_enters_mobile_number_as(String arg1) {
        driver.findElement(By.id("mpn")).sendKeys(arg1);
    }

    @And("^user checks if alternate number is empty$")
    public void user_checks_if_alternate_number_is_empty() {
        if (driver.findElement(By.name("alternateMPN")) == null) {
            driver.findElement(By.name("alternateMPN")).getAttribute("value");
        }
    }

    @And("^user enters first name as (.*)$")
    public void user_enters_first_name_as(String arg1) {
        driver.findElement(By.name("firstName")).sendKeys(arg1);
    }

    @And("^user enters last name as (.*)$")
    public void user_enters_last_name_as(String arg1) {
        driver.findElement(By.name("lastName")).sendKeys(arg1);
    }

    @And("^user enters email address as (.*)$")
    public void user_enters_email_address_as(String arg1) {
        driver.findElement(By.name("emailAddress")).sendKeys(arg1);
    }


    @And("^confirms email address as (.*)$")
    public void confirms_email_address_as(String arg1) {
        driver.findElement(By.name("confirmEmailAddress")).sendKeys(arg1);
    }

    @And("^clicks Next button$")
    public void clicks_Next_button() throws InterruptedException {
        driver.findElement(By.id("step-1-next")).click();
    }

    @And("^user enters current airtime balance (.*)$")
    public void user_enters_current_airtime_balance(String arg1) throws InterruptedException {
        driver.findElement(By.id("billAmount")).sendKeys(arg1);
    }

    @And("^user enters Frequent number 1 (.*)$")
    public void user_enters_Frequent_number_1(String arg1) throws InterruptedException {
        driver.findElement(By.id("firstFrequentNo")).sendKeys(arg1);
    }

    @And("^user enters Frequent number 2 (.*)$")
    public void user_enters_Frequent_number_2(String arg1) throws InterruptedException {
        driver.findElement(By.id("secondFrequentNo")).sendKeys(arg1);
    }

    @And("^enters company name as (.*)$")
    public void enters_company_name_as(String arg1) throws InterruptedException {
        // Thread.sleep(1000);
        driver.findElement(By.id("companyName")).sendKeys(arg1);
    }

    @And("^enters 1st line of address as (.*)$")
    public void enters_1st_line_of_address_as(String arg1) throws InterruptedException {
        driver.findElement(By.id("address")).sendKeys(arg1);
    }

    @And("^enters postcode as (.*)$")
    public void enters_postcode_as(String arg1) throws InterruptedException {
        driver.findElement(By.id("postcode")).sendKeys(arg1);
    }

    @And("^enters security password as (.*)$")
    public void enters_security_password_as(String arg1) throws Exception {
        driver.findElement(By.id("securitypass")).sendKeys(arg1);
    }

    @And("^clicks on Next button$")
    public void clicks_on_Next_button() {
        driver.findElement(By.id("step-2-next")).click();
    }

    @And("^user enters model name of the phone as (.*)$")
    public void user_enters_model_name_of_the_phone_as(String arg1) throws Exception {
        // Thread.sleep(1000);
        driver.findElement(By.id("model")).sendKeys(arg1);
    }

    @And("^enters Valid IMEI number of the phone as (.*)$")
    public void enters_Valid_IMEI_number_of_the_phone_as(String arg1) throws Exception {
        driver.findElement(By.id("imei")).sendKeys(arg1);
    }

    @But("^user clears the invalid mobile number$")
    public void user_clears_the_invalid_mobile_number() {
        driver.findElement(By.id("mpn")).clear();
    }

    @And("^submits the query$")
    public void submits_the_query() {
        driver.findElement(By.id("step-final-submit")).click();
    }

    @Then("^Unlock phone request is submitted successfully$")
    public void Unlock_phone_request_is_submitted_successfully() throws InterruptedException {
        // Thread.sleep(1000);
        Assert.assertEquals(FTConstants.UMM_SUCCESS_MSG, driver.findElement(By.tagName("body")).getText());
    }

    @And("^enters Character 2 of password as (.*)$")
    public void enters_Character_2_of_password_as(String arg1) throws InterruptedException {
        // Thread.sleep(1000);
        driver.findElement(By.id("char2")).sendKeys(arg1);
    }

    @And("^enters Character 3 of password as (.*)$")
    public void enters_Character_3_of_password_as(String arg2) throws Exception {
        driver.findElement(By.id("char3")).sendKeys(arg2);
    }

    @And("^clicks on cancel button$")
    public void clicks_on_cancel_button() {
        driver.findElement(By.linkText("Cancel")).click();
    }

    @Then("^cancel button functions properly$")
    public void cancel_button_functions_properly() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='onlineFormFrame']")));
        //Thread.sleep(2000);
        if (driver.findElement(By.id("accountType")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("accountType")).getAttribute("value"));
        }
        if (driver.findElement(By.id("phoneType")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("phoneType")).getAttribute("value"));
        }
        if (driver.findElement(By.id("mpn")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("mpn")).getAttribute("value"));
        }
        if (driver.findElement(By.id("firstName")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("firstName")).getAttribute("value"));
        }
        if (driver.findElement(By.id("lastName")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("lastName")).getAttribute("value"));
        }
        if (driver.findElement(By.id("emailAddress")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("emailAddress")).getAttribute("value"));
        }
        if (driver.findElement(By.id("confirmEmailAddress")).isDisplayed()) {
            Assert.assertEquals("", driver.findElement(By.id("confirmEmailAddress")).getAttribute("value"));
        }
        // Thread.sleep(1000);

    }

    @And("^clicks on previous button$")
    public void clicks_on_previous_button() throws InterruptedException {
        // Thread.sleep(1000);
        driver.findElement(By.id("step-previous")).click();
    }

    @Then("^user lands on homepage$")
    public void user_lands_on_homepage() throws InterruptedException {
        // Thread.sleep(1000);
        Assert.assertNotEquals("Your security details", driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[2]/span[2]")).getText());
        Assert.assertNotEquals("Additional information", driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div[2]/span[2]")).getText());
    }


    @Then("^User lands on page (.*)$")
    public void User_lands_on_page(String arg1) throws InterruptedException {
        // Thread.sleep(1000);
        if (driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).getText());
        }
    }

    @And("^user opens a new browser$")
    public void user_opens_a_new_browser() {
        driver = new ChromeDriver();
    }

    @And("^user copies Homepage URL in new browser$")
    public void user_copies_Homepage_URL_in_new_browser() {
        driver.get("http://localhost.ref.o2.co.uk:8080/onlinehelp/unlock");
    }

    @And("^clicks on I dont know my password$")
    public void clicks_on_I_dont_know_my_password() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("forgotPassword")).click();
    }

    @And("^user is on Your security details page$")
    public void user_is_on_Your_security_details_page() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).isDisplayed());
    }

    @And("^user is on Forgotten your password page$")
    public void user_is_on_Forgotten_your_password_page() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).isDisplayed());
    }

    @And("^user is on additional information page$")
    public void user_is_on_additional_information_page() throws InterruptedException {
        // Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).isDisplayed());
    }

    @And("^user enters alternate mobile number as (.*)$")
    public void user_enters_alternate_mobile_number(String arg1) {
        driver.findElement(By.name("alternateMPN")).sendKeys(arg1);
    }


    @And("^enters amount of last bill as (.*)$")
    public void enters_amount_of_last_bill_as(String arg1) throws InterruptedException {
        // Thread.sleep(1000);
        driver.findElement(By.name("billAmount")).sendKeys(arg1);
    }

    @And("^enters date of last bill as (.*)$")
    public void enters_date_of_last_bill_as(String arg1) throws InterruptedException {
        // Thread.sleep(1000);
        driver.findElement(By.name("billDate")).sendKeys(arg1);
    }

    @And("^enters tariff name as (.*)$")
    public void enters_tariff_name_as(String arg1) throws InterruptedException {
        driver.findElement(By.name("tariffName")).sendKeys(arg1);
    }

    @When("^The user does keep account type field as (.*)$")
    public void The_user_does_keep_account_type_field_as(String arg1) {
        Map<String, String> map = new HashMap<>();
        map.put("Please Select", "");
        Select selectPhone = new Select(driver.findElement(By.id("accountType")));
        selectPhone.selectByValue(map.get(arg1));
    }

    @Then("^The Error message for account type is displayed as (.*)$")
    public void The_Error_message_for_account_type_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/div/span[2]")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/div/span[2]")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/div/span[2]")).getText());
            }
        }
    }

    @Then("^The Error message for phone type is displayed as (.*)$")
    public void The_Error_message_for_phone_type_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/div/span[2]")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/div/span[2]")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/div/span[2]")).getText());
            }
        }
    }

    @Then("^The Error message for email is displayed as (.*)$")
    public void The_Error_message_for_email_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[7]/span")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[7]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[7]/span")).getText());
            }
        }
    }

    @Then("^The Error message for confirm email is displayed as (.*)$")
    public void The_Error_message_for_confirm_email_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[8]/span")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[8]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[8]/span")).getText());
            }
        }
    }

    @Then("^The Error message for mobile number is displayed as (.*)$")
    public void The_Error_message_for_mobile_number_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
            }
        }
    }

    @Then("^The Error message for alternate mobile number is displayed as (.*)$")
    public void The_Error_message_for_alternate_mobile_number_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[4]/span")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[4]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[4]/span")).getText());
            }
        }
    }


    @Then("^The Error message is displayed as (.*)$")
    public void The_Error_message_is_displayed_as(String arg1) {

        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        }
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[5]/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[5]/span")).getText());
        }
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[6]/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[6]/span")).getText());
        }
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[7]/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[7]/span")).getText());
        }
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[8]/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[8]/span")).getText());
        }
    }

    @Then("^The Error message for Non O2 mobile number is displayed as (.*)$")
    public void The_Error_message_for_Non_O2_mobile_number_is_displayed_as(String arg1) {
        if (driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div/div/ul/span")).isDisplayed()) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/div[1]/div/div/ul/span")).getText());
        }
    }

    @Then("^Error message for Character 2 is displayed as (.*)$")
    public void Error_message_for_Character_2_is_displayed_as(String arg1) {

        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).isDisplayed()) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
            }
        }
    }

    @Then("^Error message for Character 3 is displayed as (.*)$")
    public void Error_message_for_Character_3_is_displayed_as(String arg2) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).isDisplayed()) {
            if (arg2 != null) {
                Assert.assertEquals(arg2, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            } else {
                Assert.assertEquals(arg2, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            }
        }
    }

    @Then("^Error message for 1st line of address is displayed as (.*)$")
    public void Error_message_for_1st_line_of_address_is_displayed_as(String arg2) {
        if (driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).isDisplayed()) {
            if (arg2 != null) {
                Assert.assertEquals(arg2, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            } else {
                Assert.assertEquals(arg2, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            }
        }
    }


    @Then("^Error for date of last bill is displayed as (.*)$")
    public void Error_for_date_of_last_bill_is_displayed_as(String arg1) {

        if (driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).getText().matches("Forgotten your password?")) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
            }
        }
    }

    @Then("^Error for amount of last bill is displayed as (.*)$")
    public void Error_for_amount_of_last_bill_is_displayed_as(String arg1) {

        if (driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).getText().matches("Forgotten your password?")) {
            if (arg1 != null) {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            } else {
                Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
            }
        }
    }

    @Then("^Error for current tariff is displayed as (.*)$")
    public void Error_for_current_tariff_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        }
    }

    @Then("^Error for postcode is displayed as (.*)$")
    public void Error_for_postcode_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        }
    }

    @Then("^Error for security password is displayed as (.*)$")
    public void Error_for_security_password_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[4]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[4]/span")).getText());
        }
    }

    @Then("^Error for current airtime balance is displayed as (.*)$")
    public void Error_for_current_airtime_balance_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[3]/span")).getText());
        }
    }

    @Then("^Error for Frequent number 1 is displayed as (.*)$")
    public void Error_for_Frequent_number_1_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[5]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[5]/span")).getText());
        }
    }

    @Then("^Error for Frequent number 2 is displayed as (.*)$")
    public void Error_for_Frequent_number_2_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[6]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[6]/span")).getText());
        }
    }

    @Then("^Error for model of phone is displayed as (.*)$")
    public void Error_for_model_of_phone_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[1]/span")).getText());
        }
    }

    @Then("^Error for IMEI number is displayed as (.*)$")
    public void Error_for_IMEI_number_is_displayed_as(String arg1) {
        if (arg1 != null) {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
        } else {
            Assert.assertEquals(arg1, driver.findElement(By.xpath("//form[@id='onlineForm']/div[2]/span")).getText());
        }
    }

    @And("^The user does keep phone type field as (.*)$")
    public void The_user_does_keep_phone_type_field_as(String arg1) {
        Map<String, String> map = new HashMap<>();
        map.put("Please Select", "");
        Select selectPhone = new Select(driver.findElement(By.id("phoneType")));
        selectPhone.selectByValue(map.get(arg1));
    }

    @Then("^User lands on Security details page$")
    public void User_lands_on_Security_details_page() throws InterruptedException {
        // Thread.sleep(1000);
        if (driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).isDisplayed()) {
            Assert.assertEquals("Your security details", driver.findElement(By.xpath("//div[@id='module19Box']/div/div/div/h3")).getText());
        }
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}

