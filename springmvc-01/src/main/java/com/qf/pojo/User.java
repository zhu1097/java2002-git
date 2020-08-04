package com.qf.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private List<Car> list;
    private Map<String,Car> map;
    private Date birth;

}
