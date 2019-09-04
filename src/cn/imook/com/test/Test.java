package cn.imook.com.test;

import cn.imook.com.dao.UserMapper;
import cn.imook.com.entity.User;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mysql.jdbc.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.sql.DataSource;
import javax.swing.text.Utilities;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Application.xml"})
public class Test {
    @Autowired
    private UserMapper userMapper;
    @org.junit.Test
    public void testDataSource() throws SQLException {
            EntityWrapper entityWrapper = new EntityWrapper();
//        int count2 = userMapper.getCount2("胡智立6");
//        System.out.println(count2);
//            String name = "。。";
//            Map map = new HashMap();
//            map.put("name","胡智立6");
//            map.put("phone", null);
////            entityWrapper.allEq(map);
//            entityWrapper.like(!StringUtils.isNullOrEmpty(name),"name","智");
//        List<User> list = userMapper.selectList(entityWrapper);
//        System.out.println(list.size());
//        for (User user:list){
//            System.out.println(user.toString());
//        }
//        int count2 = userMapper.selectCount(entityWrapper);
//        System.out.println(count2);
        //增
        User user = new User();
        user.setName("aaaddd");
        boolean insert = user.insert();
        System.out.println(insert);
//        for (int i = 0; i<10;i++){
//            user.setName("胡智立"+i);
//            user.setPassword("123123");
//            user.setPhone(1369950294);
//            Integer num = userMapper.insert(user);
//        }
//        System.out.println(num);
        //修改  根据对象ID为条件修改
//        user.setId(2);
//        user.setName("小立一号");
//        boolean num = user.updateById();
//        System.out.println(num);
        //查询
//        user.setId(1);
//        User user1 = userMapper.selectById(1);  //根据ID为查询条件，如果有多条数据报错
//        System.out.println(user1);
//        user.setId(1);
//        user.setName("小立一号");
//        User user1 = userMapper.selectOne(user);  //根据多个条件查询，如果有多条数据报错
//        System.out.println(user1);
//        Map map = new HashMap();   /*把查询条件封装到一个Map集合中，调用selectByMap方法,集合中的Key为表中的列名*/
//        map.put("name","胡智立");
//        List<User> users = userMapper.selectByMap(map);
//        System.out.println(users.size());
//        List<Integer> idList = new ArrayList<>();  //通过多个id查询多条数据，调用selectBatchIds方法，并通过List集合传参
//        idList.add(1);
//        idList.add(2);
//        idList.add(3);
//        List<User> employees = userMapper.selectBatchIds(idList);
//        System.out.println(employees);
        //分页查询，调用selectPage方法,new Page(页码，显示条数)
//        List<User> users = userMapper.selectPage(new Page(1, 3),
//                new EntityWrapper<User>().like("name","智"));
//        for (User user1 : users){
//            System.out.println(user1.getId());
//        }
        //条件删除，注：类型为属性类型，类型对不上会报错
//        Long id = new Long(1);
//        Integer integer = userMapper.deleteById(id);
//        System.out.println(integer);
        //根据Map集合封装的属性为条件删除，必须全部对应上
//        Map map = new HashMap();
//        map.put("id",4);
//        map.put("name","胡智立0");
//        Integer integer = userMapper.deleteByMap(map);
//        System.out.println(integer);
        //根据ID批量删除
//        List list = new ArrayList();
//        list.add(5);
//        list.add(6);
//        Integer integer = userMapper.deleteBatchIds(list);
//        System.out.println(integer);
    }
}
