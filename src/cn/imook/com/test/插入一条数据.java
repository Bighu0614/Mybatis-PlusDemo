package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import cn.imook.com.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class 插入一条数据 {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void testDataSource() throws SQLException {
        User user = new User();
        user.setName("aaaddd");
        //insert：插入数据，并返回boolean类型
        boolean insert = user.insert();
        System.out.println(insert);
    }
}
