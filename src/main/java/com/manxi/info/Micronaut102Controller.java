package com.manxi.info;

import io.micronaut.http.annotation.*;

@Controller("/micronaut102")
public class Micronaut102Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}