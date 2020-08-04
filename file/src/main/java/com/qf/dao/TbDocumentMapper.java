package com.qf.dao;

import com.qf.pojo.TbDocument;
import com.qf.pojo.TbDocumentExample;
import java.util.List;

import com.qf.pojo.TbType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbDocumentMapper {
    int countByExample(TbDocumentExample example);

    int deleteByExample(TbDocumentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDocument record);

    int insertSelective(TbDocument record);

    List<TbDocument> selectByExample(TbDocumentExample example);

    TbDocument selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDocument record, @Param("example") TbDocumentExample example);

    int updateByExample(@Param("record") TbDocument record, @Param("example") TbDocumentExample example);

    int updateByPrimaryKeySelective(TbDocument record);

    int updateByPrimaryKey(TbDocument record);
    List<TbDocument> findAll(String typeName);
}