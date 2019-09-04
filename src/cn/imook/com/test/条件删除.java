package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
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
public class 条件删除 {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void testDataSource() throws SQLException {
        //根据ID为条件删除，注：类型为属性类型，类型对不上会报错
        Long id = new Long(1);
        Integer integer = userMapper.deleteById(id);
        System.out.println(integer);
        //根据Map集合封装的属性为条件删除，必须全部对应上
        Map map = new HashMap();
        map.put("id",4);
        map.put("name","胡智立0");
        Integer integer1 = userMapper.deleteByMap(map);
        System.out.println(integer1);
        //根据ID批量删除
        List list = new ArrayList();
        list.add(5);
        list.add(6);
        Integer integer2 = userMapper.deleteBatchIds(list);
        System.out.println(integer2);
    }
}
