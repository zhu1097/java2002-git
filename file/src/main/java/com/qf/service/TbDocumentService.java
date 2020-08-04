package com.qf.service;



import com.qf.pojo.TbDocument;
import com.qf.pojo.TbType;

import java.util.List;

public interface TbDocumentService {
    List<TbDocument> findAll(String typeName);

    void deleteById(String id);
    int add(TbDocument tbDocument);

    void updateDocument(TbDocument tbDocument);
}
