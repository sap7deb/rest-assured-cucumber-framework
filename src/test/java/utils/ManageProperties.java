package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class ManageProperties {
    public static TestProperties loadProperties() {
        var mapper = new ObjectMapper(new YAMLFactory());
        try {
            var filePath = "src/test/resources/" + "test-properties.yml";

            return mapper.readValue(new File(filePath), TestProperties.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
