package burak.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features="src/test/resources/featuresBurak",
        glue= "burak/step_definitions",
        dryRun = false,
        tags = ""
)

public class CukesRunner {

}
