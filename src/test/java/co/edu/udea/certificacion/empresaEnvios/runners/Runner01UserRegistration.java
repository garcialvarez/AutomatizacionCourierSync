package co.edu.udea.certificacion.empresaEnvios.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/UserRegistration.feature",
        glue = "co.edu.udea.certificacion.empresaEnvios.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner01UserRegistration {}