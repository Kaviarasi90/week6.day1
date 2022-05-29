package Runner;

import Steps.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/",glue="Steps", monochrome = true, publish = true,
                                                   // tags="@functional" 
                                                   // tags="@smoke or @regression" --->> or means anyone is available it's executed
                                                   //tags="@smoke and @regression" //and means both tags in single scenario, anyone is available it's executed
                                                   tags = "not @regression") //---->> except )
public class CucumberRunner extends BaseClass{
	
	

}
