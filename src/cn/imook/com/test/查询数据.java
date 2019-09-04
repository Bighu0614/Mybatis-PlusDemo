package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import cn.imook.com.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class 查询数据 {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void testDataSource() throws SQLException {
        User user = new User();
        user.setId(1);
        User user1 = userMapper.selectById(1);  //根据ID为查询条件，如果有多条数据报错
        System.out.println(user1);
        user.setId(1);
        user.setName("小立一号");
        User user2 = userMapper.selectOne(user);//根据多个条件查询，如果有多条数据报错
        Map map = new HashMap();   /*把查询条件封装到一个Map集合中，调用selectByMap方法,集合中的Key为表中的列名*/
        map.put("name","胡智立");
        List<User> users = userMapper.selectByMap(map);
        System.out.println(users.size());
        List<Integer> idList = new ArrayList<>();  //通过多个id查询多条数据，调用selectBatchIds方法，并通过List集合传参
        idList.add(1);
        idList.add(2);
        idList.add(3);
        List<User> employees = userMapper.selectBatchIds(idList);
        System.out.println(employees);
    }
}
