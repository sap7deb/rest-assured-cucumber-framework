package utils;

import java.io.File;


public class ManageJsonPayloads extends BaseTest {


    public static File getFile(String jsonFile) {

        return new File(
                "src/test/resources/" + jsonFile);
    }

}