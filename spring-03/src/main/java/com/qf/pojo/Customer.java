package com.qf.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class Customer {
    @Value("张艺兴")
    private String username;
  /*  @Autowired
    @Qualifier(value = "car")*/
  @Resource(name = "car")
    private Car car;
}
