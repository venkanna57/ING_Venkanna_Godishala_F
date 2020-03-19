package com.hcl.ing.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/hcl/ing/feature/GetData.feature"
,glue={"com.hcl.ing.stepdefination"}
,plugin = { "pretty", "html:testOutput/cucumber.html","json:testOutput/cucumber.json" }
//,tags = "@UIAPI"
,monochrome = true
, dryRun = false )		
public class TestRunner {

}
