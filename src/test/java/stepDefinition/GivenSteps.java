package stepDefinition;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import utils.BaseTest;
import utils.HttpClient;
import utils.ManageProperties;

public class GivenSteps extends BaseTest {

    @Given("User has an valid {string}")
    public void setEndpoint(String endPoint) throws Throwable {
        prop = ManageProperties.loadProperties();
        mapper = new ObjectMapper();
        baseURL = prop.getBaseUrl().get("local");
        endpoint = endPoint;
        httpService = new HttpClient(baseURL);

    }

}
