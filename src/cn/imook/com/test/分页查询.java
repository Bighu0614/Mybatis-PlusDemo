package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import cn.imook.com.entity.User;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class 分页查询 {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void testDataSource() throws SQLException {
        //分页查询，调用selectPage方法,new Page(页码，显示条数)
        //页码：不需要进行运算，内部封装
        List<User> users = userMapper.selectPage(new Page(2, 3),
                new EntityWrapper<User>().like("name","智"));
        for (User user1 : users){
            System.out.println(user1.getId());
        }
    }
}
