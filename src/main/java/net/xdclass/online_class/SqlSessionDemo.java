package net.xdclass.online_class;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import jdk.nashorn.internal.runtime.BitVector;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;

public class SqlSessionDemo {

    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";
        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取session
        try {
            //SqlSession sqlSession = sqlSessionFactory.openSession(true);//开启事务自动提交
            SqlSession sqlSession = sqlSessionFactory.openSession();
/*            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video1 = videoMapper.selectById(44);
            System.out.println(video1.toString());
            sqlSession.commit();*/

          //  VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);

            VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
            Video v = new Video();
            v.setTitle("hhhhh");
            mapper.add(v);
           sqlSession.commit();

            sqlSession.close();
        }catch (Exception e){

            e.printStackTrace();

        }



        }


    }

