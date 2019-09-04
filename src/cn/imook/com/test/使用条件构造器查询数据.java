package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import cn.imook.com.entity.User;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mysql.jdbc.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class 使用条件构造器查询数据 {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void testDataSource() throws SQLException {
        //实例化一个条件构造器
        EntityWrapper entityWrapper = new EntityWrapper();
        String name = "。。";
        Map map = new HashMap();
        map.put("name", "胡智立6");
        map.put("phone", null);   //将条件以键值对的形式存到Map
        entityWrapper.allEq(map);   //把Map集合放到条件构造
        //判断name是否为空，然后 name = %智% and Map集合
        entityWrapper.like(!StringUtils.isNullOrEmpty(name), "name", "智");
        //selectList ：根据条件构造器查询多条数据，返回一个集合
        List<User> list = userMapper.selectList(entityWrapper);
        System.out.println(list.size());
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}
