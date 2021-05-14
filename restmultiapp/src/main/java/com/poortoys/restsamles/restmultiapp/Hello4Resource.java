package com.poortoys.restsamles.restmultiapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello4")
public class Hello4Resource {
    @GET
    public String hello() {
        return "Hello, world (4)";
    }
}
