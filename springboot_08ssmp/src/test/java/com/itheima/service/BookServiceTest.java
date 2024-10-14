package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    //    注入service对象
    @Autowired
    private IBookService bookService;

    @Test
    void testById() {
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("-----------");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);

    }


    @Test
    void testupdate() {
        Book book = new Book();
        book.setId(11);
        book.setType("测试通用接口开发修改");
        book.setName("efsdfs");
        book.setDescription("asdawe");
        bookService.updateById(book);
    }


    @Test
    void testDelete() {
        bookService.removeById(14);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage() {
        //分页的对象

        IPage<Book> page = new Page<Book>(2, 5);
        bookService.page(page);

//        查看第几页
        System.out.println(page.getCurrent());
//        一页几条数据
        System.out.println(page.getSize());
//        一共多少页
        System.out.println(page.getPages());
//        一共多少数据
        System.out.println(page.getTotal());
//        所查询的数据
        System.out.println(page.getRecords());


    }


}
