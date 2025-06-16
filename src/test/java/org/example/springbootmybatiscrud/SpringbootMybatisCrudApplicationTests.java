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

//    @Test
//    public void testListUser(){
//        List<emp> list = empMapper.list();
//        list.stream().forEach(user -> System.out.println(user));
//    }

}
