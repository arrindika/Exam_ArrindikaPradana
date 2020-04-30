package androidtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/androidtest",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Android"}
)
public class AndroidRun {
}
