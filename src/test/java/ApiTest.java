import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static api.BaseClass.*;
import static api.endpoint.*;
import static api.payload.*;

public class ApiTest {

    @Test
    public void createUserTest() {

        Response resp =
                RestAssured
                        .given()
                        .spec(requestSpec)
                        .body(createUserPayload("John Doe", "QA Engineer"))
                        .when()
                        .post(POST_USER);

        System.out.println("Status Code: " + resp.getStatusCode());
        System.out.println("Response Body: " + resp.getBody().asString());
    }
}