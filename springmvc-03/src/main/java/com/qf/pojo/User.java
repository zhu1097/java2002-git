package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @JsonIgnore
    private Integer id;
    @JsonProperty("姓名")
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone ="GMT+8")
    private Date birth;
}

