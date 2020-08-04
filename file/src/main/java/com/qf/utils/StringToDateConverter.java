package com.qf.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String documentDate) {
        if (documentDate!=null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return simpleDateFormat.parse(documentDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else {
            throw new RuntimeException("日期不能为空");
        }
        return null;
    }
}
