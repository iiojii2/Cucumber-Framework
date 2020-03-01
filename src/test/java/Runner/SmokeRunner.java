package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.cucumber.features",
        glue = "StepDefenitions",
        dryRun = false,
        monochrome = false,
        tags = "@smoke"
)

public class SmokeRunner {
}
