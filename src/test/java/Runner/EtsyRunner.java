package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.cucumber.features.Etsy",
        glue = "StepDefenitions",
        dryRun = false,
        monochrome = false
)
public class EtsyRunner {

}
