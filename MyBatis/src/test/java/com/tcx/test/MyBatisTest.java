package com.tcx.test;

import com.tcx.domain.User;
import com.tcx.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        SqlSession ss = ssf.openSession(false);//false为手动提交事务

        UserMapper um = ss.getMapper(UserMapper.class);


//        查
//        List<User> users = um.selectAll();

//        增
//        User user = new User();
//        user.setStuClass("大数据");
//        user.setStuName("无名");
//        user.setSex("男");
//        user.setAge(20);
//        um.insertUser(user);
//        System.out.println(user.getId()); //通过设置useGeneratedKeys="true" keyProperty="id"添加

//        删
        int[] ids = new int[]{4,5};
        um.deleteByIds(ids);

        ss.commit(); //提交事务

        ss.close();
    }
}
