package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08ssmpApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(3));
    }


    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);

    }


    @Test
    void testYpdate() {
        Book book = new Book();
        book.setId(12);
        book.setType("aaaa");
        book.setName("vvvv");
        book.setDescription("dfcdsaf");
        bookDao.updateById(book);
    }


    @Test
    void testDelete() {
        bookDao.deleteById(10);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {
        //分页的对象
        IPage page = new Page<>(2, 5);
        bookDao.selectPage(page, null);


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

    @Test
    void testGetBy() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.like("name", "spring");
        bookDao.selectMaps(wrapper);
    }


    @Test
    void testGetBy2() {
        String name = "1";

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name != null,Book::getName, name);
        bookDao.selectMaps(lqw);
    }
}
