package com.tony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tony.service.IDemoService;

@RestController
@RequestMapping(path = "/rest/demo", produces = "application/json;charset=UTF-8")
public class DemoController {

  @Autowired
  private IDemoService demoService;

  @GetMapping("/sayHello")
  public String sayHello(String name) {
    return demoService.sayHello(name);
  }

}
