package com.jos.dem.flyway.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FlywayController {

  @RequestMapping
  String index(){
    'Hello Flyway!'
  }

}
