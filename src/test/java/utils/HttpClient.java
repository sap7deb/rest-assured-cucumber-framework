package utils;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.util.Map;

public class HttpClient {

    final RequestSpecification httpRequest;
    final TestProperties prop;
    Response response;

    public HttpClient(String baseUrl) {
        this.prop = ManageProperties.loadProperties();
        RestAssured.baseURI = baseUrl;
        this.httpRequest = RestAssured.given().urlEncodingEnabled(true);
        setHeader();
    }

    public void setHeader() {

        httpRequest.headers(prop.getHeaders());

    }
    public Response get(String endPoint) {
        response = httpRequest.request(Method.GET, endPoint);
        response.prettyPrint();
        return response;
    }


    public Response postWithFile(File jsonPayload, String endPoint) {
        httpRequest.body(jsonPayload).log().all();
        response = httpRequest.request(Method.POST, endPoint);
        response.prettyPrint();
        return response;
    }


    public Response getWithQueryParams(Map<String, String> parameters, String endPoint) {
        httpRequest.queryParams(parameters).log().all();
        response = httpRequest.request(Method.GET, endPoint);
        response.prettyPrint();
        return response;
    }

    public Response getWithPathParams(Map<String, String> parameters, String endPoint) {
        httpRequest.pathParams(parameters).log().all();
        response = httpRequest.request(Method.GET, endPoint);
        response.prettyPrint();
        return response;
    }

    public Response put(File jsonPayload, String endPoint) {
        httpRequest.body(jsonPayload).log().all();
        response = httpRequest.request(Method.PUT, endPoint);
        response.prettyPrint();
        return response;
    }

}
