package com.qf.service.impl;

import com.qf.dao.TbDocumentMapper;
import com.qf.pojo.TbDocument;
import com.qf.pojo.TbType;
import com.qf.service.TbDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbDocumentServiceImpl implements TbDocumentService {
    @Autowired
    private TbDocumentMapper tbDocumentMapper;
    @Override
    public List<TbDocument> findAll(String typeName) {
        return tbDocumentMapper.findAll(typeName);
    }

    @Override
    public void deleteById(String id ) {
        tbDocumentMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int add(TbDocument tbDocument) {
        return tbDocumentMapper.insert(tbDocument);
    }

    @Override
    public void updateDocument(TbDocument tbDocument) {
        tbDocumentMapper.updateByPrimaryKeySelective(tbDocument);
    }
}
