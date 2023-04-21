package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Results.json"},
        glue = "stepdefinitions",
        features = "src/test/resources/features"
)

public class TestRunner {

    @Managed(driver = "chrome")
    private WebDriver driver;



}