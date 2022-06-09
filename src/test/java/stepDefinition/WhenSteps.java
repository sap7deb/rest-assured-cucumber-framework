package stepDefinition;

import io.cucumber.java.en.When;
import utils.BaseTest;
import utils.ManageJsonPayloads;
import utils.TestConstants;

public class WhenSteps extends BaseTest implements TestConstants {

    @When("User makes a request for the id {int}")
    public void userMakesRequestToGet(int param) {
        response = httpService.get(endpoint+"/"+param);
    }

    @When("User makes a request with {string}")
    public void userMakesRequestToCreate(String requestBody) {
        response = httpService.postWithFile(ManageJsonPayloads
                        .getFile(requestPayloadPath + requestBody),
                endpoint);
    }
}
