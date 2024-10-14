package com.itheima.ssmp_my;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmpMyApplicationTests {
@Autowired
private BookDao bookDao;

    @Test
    void  seleall () {
        System.out.println(bookDao.selectList(null));;
    }
    @Test
    void selectbyid(){
        bookDao.selectById(12);
    }

}
