package com.joaoleite.panache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {
    
  @Id
  private Long id;

  
  @Column(length = 150, nullable = false)
  private String name;

  @Column(length = 1, nullable = false)
  private String sex;
  
  public Person() {
}


  public Person(String name, String sex) {
    this.name = name;
    this.sex = sex;
	}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getSex() {
	return sex;
}


public void setSex(String sex) {
	this.sex = sex;
}

  


}