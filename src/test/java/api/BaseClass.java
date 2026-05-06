package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

    public static RequestSpecification requestSpec =
            new RequestSpecBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-api-key", "free_user_3DKaWQw5d42nZdIkmpyPaBo6SJf")
                    .build();
}