package cucumber_framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun =false,tags = "@Price")//,strict = true//tags = "@Smoke")

//dryRun=true  By default its value is False , we need to set it to true to check for missing  step defination
//strict=true  is to pointout unimplemented step defination(if there are unexecuted tests)

public class CucumberRun
{

}
