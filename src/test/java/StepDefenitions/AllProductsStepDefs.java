package StepDefenitions;

import Pages.AllProductsPage;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllProductsStepDefs {
    HomePage page= new HomePage();
    AllProductsPage productsPage= new AllProductsPage();

    @Then("the user click view all products button")
    public void the_user_click_view_all_products_button() {
        page.ViewAllProducts.click();
    }

    @Then("the user validate product table")
    public void the_user_validate_product_table() {
        List<String>actualList= productsPage.getProductList();
        List<String> expectedList= productsPage.expectedData();
        Assert.assertTrue(actualList.containsAll(expectedList));
    }

}
