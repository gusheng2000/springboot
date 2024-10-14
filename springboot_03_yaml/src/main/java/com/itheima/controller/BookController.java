package com.itheima.controller;

import com.itheima.myDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String ciybtry;

    @Value("${user3.name}")
    private String name;

    @Value("${user3.age}")
    private int age;

    @Value("${tempDir}")
    private String tempDir;
    //使用自动装备将所有的数据封装到一个对象中
    @Autowired
    private Environment env;
    @Autowired
    private myDataSource mds;


    @GetMapping
    public String getById() {
        System.out.println("springboot is running....2");
        System.out.println("country---->>" + ciybtry);
        System.out.println("name1---->>" + name);
        System.out.println("tempDir---->>" + tempDir);


        System.out.println("==============================");
        System.out.println(env.getProperty("user2.name"));


        System.out.println("==============================");

        System.out.println(mds);
        return "springboot is running....2";


    }
}
