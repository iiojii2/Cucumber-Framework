package StepDefenitions.WeborderStepDefs;

import Pages.WebOrdePages.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderLoginStepDefs {
    WebDriver driver= Driver.getDriver();
    LoginPage page=new LoginPage();
    @Given("the user navigate to web orders page")
    public void the_user_navigate_to_web_orders_page() {
        System.out.println("Navigated to order page");
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("the user provide user name")
    public void the_user_provide_user_name() {
        System.out.println("the user send Tester");
        page.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        System.out.println("The user send test");
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginButton.click();
    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        System.out.println("the user validate on page");
        String expectedTitle="Web Orders";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @When("the user provide username {string}")
    public void the_user_provide_username(String username) {
        page.username.sendKeys(username);
    }

    @When("the user provide password {string}")
    public void the_user_provide_password(String password) {
        page.password.sendKeys(password);
        page.loginButton.click();
    }

    @Then("user validate text {string}")
    public void user_validate_text(String expectedMessage) {
           String actualMessage= page.errorMessage.getText();
           Assert.assertEquals(expectedMessage,actualMessage);
    }



    @When("the user provide username {int}")
    public void the_user_provide_username(Integer username) {
        page.username.sendKeys(""+username);
    }

    @When("the user provide password {int}")
    public void the_user_provide_password(Integer password) {
        page.password.sendKeys(""+password);
        page.loginButton.click();
    }
    @When("the user provide username {string} and password {string}")
    public void the_user_provide_username_and_password(String username, String password) {
        page.username.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButton.click();
    }



}
