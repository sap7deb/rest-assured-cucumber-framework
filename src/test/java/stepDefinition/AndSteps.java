package stepDefinition;

import io.cucumber.java.en.And;
import org.junit.Assert;
import utils.BaseTest;


public class AndSteps extends BaseTest {


    @And("User validates the response code as {int}")
    public void assertStatusCode( int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }


}
