package com.poortoys.restsamles.restmultiapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello3")
public class Hello3Resource {
    @GET
    public String hello() {
        return "Hello, world (3)";
    }
}
