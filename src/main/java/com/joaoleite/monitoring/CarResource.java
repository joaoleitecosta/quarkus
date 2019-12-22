package com.joaoleite.monitoring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/cars")
public class CarResource {
  
  
  @GET
  @Produces(value = MediaType.TEXT_PLAIN)
  @Counted(name = "number of requests on cars")
  @Timed(name = "duration search cars")
  public String findAllCars() {
    return "olá";
  }

  @GET
  @Path("/memoria")
  @Produces(MediaType.TEXT_PLAIN)
  @Gauge(name = "Quantidade de memoria", unit = MetricUnits.BYTES)
  public long quantideMemoria() {
      return Runtime.getRuntime().freeMemory();
  }

}