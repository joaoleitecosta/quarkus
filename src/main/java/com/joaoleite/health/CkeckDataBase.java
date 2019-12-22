package com.joaoleite.health;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.joaoleite.hibernate.ProductService;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@ApplicationScoped
@Readiness
public class CkeckDataBase implements HealthCheck {
    
@Inject ProductService productService;

    @Override
    public HealthCheckResponse call() {
          return HealthCheckResponse.named("good database").up().build();
    }


}