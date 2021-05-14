package com.poortoys.restsamles.restmultiapp;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/apiv1")
public class MyApplication1 extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(Hello1Resource.class, Hello2Resource.class);
    }
}