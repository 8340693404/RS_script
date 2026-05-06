import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void createUserTest() {

        String data = """
        {
            "name": "John Doe",
            "job": "QA Engineer"
        }
        """;

        Response resp = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("Content-Type", "application/json")
                .header("x-api-key", "free_user_3DKaWQw5d42nZdIkmpyPaBo6SJf")
                .body(data)
                .when()
                .post();

        System.out.println("Status Code: " + resp.getStatusCode());
        System.out.println("Response Body: " + resp.getBody().asString());

        //Assert.assertEquals(resp.getStatusCode(), 201);
    }
}