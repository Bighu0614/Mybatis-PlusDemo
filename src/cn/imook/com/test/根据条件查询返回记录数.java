package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class 根据条件查询返回记录数 {
    @Autowired
    private UserMapper userMapper;
    @org.junit.Test
    public void testDataSource() throws SQLException {
        //实例化一个条件构造器
        EntityWrapper entityWrapper = new EntityWrapper();
        //selectCount：根据条件构造器查询返回记录数
        int count2 = userMapper.selectCount(entityWrapper);
        System.out.println(count2);
    }
}
