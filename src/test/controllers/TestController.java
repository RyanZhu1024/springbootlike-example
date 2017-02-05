package test.controllers;

import cs682.server.annotations.RequestMapping;
import cs682.server.annotations.RestController;
import cs682.server.http.HttpMethod;
import cs682.server.http.HttpRequest;
import cs682.server.http.HttpResponse;

/**
 * Created by RyanZhu on 05/02/2017.
 */
@RestController("test")
public class TestController {
    @RequestMapping(value = "/", method = HttpMethod.GET)
    public HttpResponse test(HttpRequest httpRequest) {
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setBody("123");
        return httpResponse;
    }
}
