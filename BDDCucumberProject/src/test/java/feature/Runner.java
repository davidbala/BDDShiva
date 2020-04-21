package feature;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = "FeatureFile" ,glue = {"stepDefinition"},dryRun = true)
public class Runner extends AbstractTestNGCucumberTests{
	
	

}
