package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbDocument;
import com.qf.service.TbDocumentService;
import com.qf.utils.StringToDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("document")
public class TbDocumentController {
    @Autowired
    private TbDocumentService tbDocumentService;
    @RequestMapping("findAll")
    public Map<String, Object> findAll(int page, int limit, String typeName){

        PageHelper.startPage(page,limit);
        List<TbDocument> tbDocuments = tbDocumentService.findAll(typeName);
        PageInfo<TbDocument> pageInfo = new PageInfo<>(tbDocuments);


    Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());//分页数据
        return map;

    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map add(TbDocument tbDocument){
        tbDocumentService.add(tbDocument);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","添加成功");
        map.put("count","");//总记录数
        map.put("data","");//分页数据
        return map;
    }
    @RequestMapping("deleteById")
    public void deleteById(String id){
       tbDocumentService.deleteById(id);

    }
    @RequestMapping("updateDocument")
    public void updateDocument(TbDocument tbDocument){
        System.out.println(tbDocument.toString());
      tbDocumentService.updateDocument(tbDocument);

    }


}
