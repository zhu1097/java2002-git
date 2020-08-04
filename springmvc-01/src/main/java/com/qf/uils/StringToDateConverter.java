package com.qf.uils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s!=null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-mm");
            try {
                return simpleDateFormat.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else {
            throw new RuntimeException("日期不能为空");
        }
        return null;
    }
}
