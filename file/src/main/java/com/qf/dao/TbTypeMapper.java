package com.qf.dao;

import com.qf.pojo.TbType;
import com.qf.pojo.TbTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbTypeMapper {
    int countByExample(TbTypeExample example);

    int deleteByExample(TbTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbType record);

    int insertSelective(TbType record);

    List<TbType> selectByExample(TbTypeExample example);

    TbType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbType record, @Param("example") TbTypeExample example);

    int updateByExample(@Param("record") TbType record, @Param("example") TbTypeExample example);

    int updateByPrimaryKeySelective(TbType record);

    int updateByPrimaryKey(TbType record);
}