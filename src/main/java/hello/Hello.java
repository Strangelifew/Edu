package hello;

import spark.Request;

import static spark.Spark.*;

public class Hello {
    public static void main(String[] args) {
        get("/hello/:x/:y", (request, response) -> {
            String x = request.params(":x");
            String y = request.params(":y");
            int sum = Integer.parseInt(x) + Integer.parseInt(y);
            return "Hello: " + sum;
        });
    }
}
