package org.example.springbootmybatiscrud.mapper;

import org.apache.ibatis.annotations.*;
import org.example.springbootmybatiscrud.POJO.emp;

import java.util.List;

@Mapper//在运行时，会自动生成该接口的实现类对象，并且将该对象交给IOC容器管理
public interface EmpMapper {

    //根据id删除员工信息
    @Delete("delete from emp where id = #{id}")//sql占位符
    public int delete(Integer id);

    //新增员工
    @Insert("insert into emp(id,workNo,name,gender,age,idCard)" +
            "values (#{id},#{workNo},#{name},#{gender},#{age},#{idCard})")
    //可以返回主键的注解
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insert(emp emp);

    //更新员工
    @Update("update emp set id=#{id},workNo=#{workNo},name=#{name},\n" +
            "               gender=#{gender},age=#{age},idCard=#{idCard} where id=#{id}")
    public void update(emp emp);

    //根据id查询员工
    @Select("select * from emp where id=#{id}")
    public emp getById(Integer id);
}
