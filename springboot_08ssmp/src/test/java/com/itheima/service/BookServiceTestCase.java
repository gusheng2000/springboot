package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    //    注入service对象
    @Autowired
    private BookService bookService;

    @Test
    void testById() {
        System.out.println(bookService.getById(6));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试业务层");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);

    }


    @Test
    void testYpdate() {
        Book book = new Book();
        book.setId(12);
        book.setType("测试更新数据");
        book.setName("vvvv");
        book.setDescription("dfcdsaf");
        bookService.update(book);
    }


    @Test
    void testDelete() {
        bookService.delete(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage() {
        //分页的对象

        IPage<Book> page = bookService.getPage(2, 5);

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
