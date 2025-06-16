package org.example.springbootmybatiscrud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.springbootmybatiscrud.POJO.emp;

import java.util.List;

@Mapper//在运行时，会自动生成该接口的实现类对象，并且将该对象交给IOC容器管理
public interface EmpMapper {
    //查询全部用户信息
//    @Select("select * from emp")
//    public List<emp> list();

}
