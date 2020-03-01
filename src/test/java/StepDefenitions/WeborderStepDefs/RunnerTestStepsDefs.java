package StepDefenitions.WeborderStepDefs;

import io.cucumber.java.en.Given;

public class RunnerTestStepsDefs {


    @Given("The user send key")
    public void the_user_send_key() {
        System.out.println("This is test 1");
    }

    @Given("The user click the button")
    public void the_user_click_the_button() {
        System.out.println("This is test 2");
    }

}
