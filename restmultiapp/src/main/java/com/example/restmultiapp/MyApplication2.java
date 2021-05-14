package com.example.restmultiapp;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.Set;

@ApplicationPath("/apiv2")
public class MyApplication2 extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(Hello3Resource.class, Hello4Resource.class);
    }
}
