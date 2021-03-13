import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittechconsulting/eclipse-workspace/BDD_200926M/mylogin.feature"
}, tags= {"@smoke"},plugin= {"pretty","html:report"})
public class Runner {

}
