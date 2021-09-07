package com.tony.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import com.tony.service.IDemoService;

@Component
public class DemoServiceImpl implements IDemoService {

  @DubboReference
  private IDemoService demoService;

  @Override
  public String sayHello(String name) {
    return demoService.sayHello(name);
  }

}
