package com.itheima.domain;

import lombok.Data;


//lombook 简化pojo开发
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
