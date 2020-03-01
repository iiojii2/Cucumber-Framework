package StepDefenitions;

import Pages.EtsyPAge;
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
       driver.get("https://www.etsy.com/?ref=lgo");
    }

    @Then("the user search for {string}")
    public void the_user_search_for(String search) {
        pAge.searchBox.sendKeys(search);
        pAge.searchButton.click();
    }

    @Then("the user validate with {string}")
    public void the_user_validate_with(String title) {
        String actualMessage= driver.getTitle();

        Assert.assertEquals(title,actualMessage);

    }
}
