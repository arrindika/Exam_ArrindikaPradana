package webtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/webtest",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Web"}
        )
public class webrun {
}
