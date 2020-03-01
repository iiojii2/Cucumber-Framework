package StepDefenitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageStepsDefs {
        HomePage page = new HomePage();


    @Then("the user validate menu order list")
    public void the_user_validate_menu_order_list() {
        List<String> expected= page.orderMenuData();

        List<String> actual= new ArrayList<>();
        for (WebElement element:page.orderMenu){
            actual.add(element.getText());

        }
        for (int i =0; i<actual.size();i++){
            Assert.assertEquals(expected.get(i),actual.get(i));

        }
        System.out.println("this is for menu");

    }


}
