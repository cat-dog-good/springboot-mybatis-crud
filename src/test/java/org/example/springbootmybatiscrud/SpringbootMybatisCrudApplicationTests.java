package org.example.springbootmybatiscrud;

import org.example.springbootmybatiscrud.POJO.emp;
import org.example.springbootmybatiscrud.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest//springboot整合单元测试的注解
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
        int number = empMapper.delete(11);//返回值为删除记录的条数
        System.out.println("成功删除记录数量:"+number);
    }

    @Test
    public void testInsert(){
        emp emp =new emp();
        emp.setId(11);
        emp.setWorkNo("1111");
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate(){
        emp emp =new emp();
        emp.setId(9);
        emp.setName("zhangsan");
        empMapper.update(emp);
    }

    @Test
    public void testGetById(){
        emp emp = empMapper.getById(5);
        System.out.println(emp);
    }

    @Test
    public void testSelect(){
        List<emp> list = empMapper.select("男", 18);
        list.forEach(System.out::println);
    }

}
