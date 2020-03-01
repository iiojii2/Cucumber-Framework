package StepDefenitions;

import Pages.AllOrdersPAge;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ListOfAllOrdersStepsDefs {
    AllOrdersPAge pAge= new AllOrdersPAge();

    @Then("the user should see {string}")
    public void the_user_should_see(String expected) {
        String actual= pAge.listOfAllOrder.getText();
        Assert.assertEquals(actual,expected);
    }
}
