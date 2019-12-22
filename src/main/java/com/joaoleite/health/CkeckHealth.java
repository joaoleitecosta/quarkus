package com.joaoleite.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;


@Liveness
@ApplicationScoped
public class CkeckHealth implements HealthCheck {
    

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("good application").up().build();
    }
}