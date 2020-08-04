package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class TbDocument {
    private Integer id;

    private String documentTitle;

    private String documentContext;

    private String documentAuthor;

    @JsonFormat(pattern = "yyyy-MM-dd ",timezone = "GMT+8")
    private Date documentDate;

    private Integer typeId;



}