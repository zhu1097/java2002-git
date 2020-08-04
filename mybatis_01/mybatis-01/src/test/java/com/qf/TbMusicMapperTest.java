package com.qf;

import com.qf.dao.TbMusicMapper;
import com.qf.pojo.TbMusic;
import com.qf.pojo.TbMusicExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TbMusicMapperTest {

    @Test
    public void test_findById() throws Exception{
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        TbMusicMapper musicMapper = sqlSession.getMapper(TbMusicMapper.class);

        TbMusic tbMusic = musicMapper.selectByPrimaryKey("2");

        System.out.println(tbMusic);

    }


    @Test
    public void test_findAll() throws Exception{
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        TbMusicMapper musicMapper = sqlSession.getMapper(TbMusicMapper.class);

        List<TbMusic> tbMusics = musicMapper.selectByExample(null);

        System.out.println(tbMusics);
    }

    @Test
    public void test_findByName() throws Exception{
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

        TbMusicMapper musicMapper = sqlSession.getMapper(TbMusicMapper.class);

        String name = "来";

        TbMusicExample tbMusicExample = new TbMusicExample();
        TbMusicExample.Criteria criteria = tbMusicExample.createCriteria();
        //添加查询条件
        criteria.andMusicNameLike("%"+name+"%");

        List<TbMusic> tbMusics = musicMapper.selectByExample(tbMusicExample);

        System.out.println(tbMusics.get(0));
        System.out.println(tbMusics);
    }

    //Mybatis缓存：
    // 两种:
    //1.一级缓存sqlSession级别
    //2.二级缓存SqlSessionFactory级别
    @Test
    public void test_sqlSession()throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();

        TbMusicMapper musicMapper1 = sqlSession.getMapper(TbMusicMapper.class);
        TbMusic tbMusic1 = musicMapper1.selectByPrimaryKey("1");
        //清空一级缓存，如果close()，commit() 一级缓存也会消失
        sqlSession.clearCache();

        TbMusicMapper musicMapper2 = sqlSession.getMapper(TbMusicMapper.class);
        TbMusic tbMusic2 = musicMapper2.selectByPrimaryKey("1");

        System.out.println(tbMusic1 == tbMusic2);
    }

    @Test
    public void test_sqlSessionFactory()throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession1 = factory.openSession();
        TbMusicMapper musicMapper1 = sqlSession1.getMapper(TbMusicMapper.class);
        TbMusic tbMusic1 = musicMapper1.selectByPrimaryKey("1");
        sqlSession1.close();

        SqlSession sqlSession2 = factory.openSession();
        TbMusicMapper musicMapper2 = sqlSession2.getMapper(TbMusicMapper.class);
        TbMusic tbMusic2 = musicMapper2.selectByPrimaryKey("1");
        sqlSession2.close();

//        SqlSession sqlSession3 = factory.openSession();
//        TbMusicMapper musicMapper3 = sqlSession3.getMapper(TbMusicMapper.class);
//        TbMusic tbMusic3 = musicMapper3.selectByPrimaryKey("1");
//        sqlSession3.close();

    }

}
