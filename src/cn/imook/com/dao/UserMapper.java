package cn.imook.com.dao;

import cn.imook.com.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {
    @Select("select count(1) from user where name = #{name}")
    int getCount2(@Param("name") String name);
}
