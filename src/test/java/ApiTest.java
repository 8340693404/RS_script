import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void createAdminTest() {

        String data = """
        {
            "email": "abcdmm12388@gmail.com",
            "password": "1234567@mMMa",
            "role": "ADMIN"
        }
        """;

        Response resp = RestAssured
                .given()
                .relaxedHTTPSValidation()  // <-- Ignore SSL issues
                .header("Content-Type", "application/json")
                .body(data)
                .when()
                .post("https://www.shoppersstack.com/shopping/POST/users/login");

        System.out.println("Status Code: " + resp.getStatusCode());
        System.out.println("Response Body: " + resp.getBody().asString());
    }
}