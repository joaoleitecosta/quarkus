package com.joaoleite.panache;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Path("/people")
public class PersonResource {

  @Inject PersonRepository repository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Person> findAllPerson() {
    return repository.listAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Transactional
  public void savePerson(@RequestBody PersonDTO personDTO) {
    Person person = new Person(personDTO.getName(), personDTO.getSex());
    repository.persist(person);
  }


}