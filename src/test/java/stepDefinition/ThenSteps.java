package stepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.BaseTest;
import utils.ManageJsonPayloads;
import utils.TestConstants;

import java.util.Map;

public class ThenSteps extends BaseTest implements TestConstants {

    @Then("Use validated that the response matched {string} with status code {int}")
    public void assertResponseBody(String responseBody, int statusCode) throws Throwable {
        Assert.assertEquals(mapper.readTree(
                ManageJsonPayloads.getFile(responsePayloadPath
                        + responseBody)), mapper.readTree(response.getBody().asString()));
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Then("User validated that the response with status code")
    public void assertResponseBody(Map<String,String> responseData) {

        for (Map.Entry<String,String> data : responseData.entrySet()){
            Assert.assertTrue(response.jsonPath().getString(data.getKey()).equalsIgnoreCase(data.getValue()));
        }
        userId= response.jsonPath().getInt("id");
        System.out.println(userId);
    }
}
