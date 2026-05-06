package api;

public class payload {

    public static String createUserPayload(String name, String job) {
        return """
    {
        "name": "%s",
        "job": "%s"
    }
    """.formatted(name, job);
    }

}