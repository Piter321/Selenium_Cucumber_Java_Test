package Utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"PageActions"},
        plugin = {})


public class run extends AbstractTestNGCucumberTests{

}
