package StepDefenitions.EtsyStepDefs;

import Pages.EtsyPages.EtsyPAge;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EtsyPageStepDefs {
    WebDriver driver= Driver.getDriver();
    EtsyPAge pAge =new EtsyPAge();

    @Given("the user navigate to Esty webPage")
    public void the_user_navigate_to_Esty_webPage() {
       driver.get(ConfigReader.getProperty("etsyUrl"));
    }

    @Then("the user search for {string}")
    public void the_user_search_for(String search) {
        pAge.searchBox.sendKeys(search);
        pAge.searchButton.click();
    }

    @Then("the user validate with {string}")
    public void the_user_validate_with(String expectedtitle) {
        String actualMessage= driver.getTitle();

        Assert.assertEquals(actualMessage,expectedtitle);

    }
}
