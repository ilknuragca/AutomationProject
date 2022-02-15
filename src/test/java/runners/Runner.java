package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "pretty",//This is used for more readable reports or outputs
//                "html:target/default-cucumber-reports.html",//Use this reports
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "rerun:target/failedRerun.txt"
//
//        },

        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        //tags = "@login_user_correct2",
        //tags="@register_user",
        //tags="@login_user_excel",
        tags="@login_user_excel_negative",
        dryRun = false
)

public class Runner {
}
