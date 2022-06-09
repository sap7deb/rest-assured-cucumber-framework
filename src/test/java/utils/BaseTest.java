package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTest {
    public static Response response;
    public static String baseURL;
    public static String endpoint;
    public static TestProperties prop;
    public static HttpClient httpService;
    public static ObjectMapper mapper;
    public static int userId;
}
