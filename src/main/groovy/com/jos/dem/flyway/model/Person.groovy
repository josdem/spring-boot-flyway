package com.jos.dem.flyway.model

import static javax.persistence.GenerationType.AUTO

import javax.persistence.Id
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Person {

  @Id
  @GeneratedValue(strategy=AUTO)
  Long id

  @Column(nullable = false)
  String firstname

  @Column(nullable = false)
  String lastname
}
