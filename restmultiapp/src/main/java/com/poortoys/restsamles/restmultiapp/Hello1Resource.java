package com.poortoys.restsamles.restmultiapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello1")
public class Hello1Resource {
    @GET
    public String hello() {
        return "Hello, world (1)";
    }
}
