package com.tiangao.book;

import com.tiangao.book.pojo.Book;
import com.tiangao.book.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  12:24
 * @Modified By:
 */
@SpringBootTest
public class BookTest {
    @Autowired
    private BookService service;

    @Test
    public void test1() {
        Book book = new Book();
        book.setName("134");
        service.insertBook(book);
    }

    @Test
    public void test2() {
        for (int i = 0; i < 100; i++) {
            Book book = new Book();
            book.setName(i+"本");
            book.setTypeNo(2);
            book.setAuthor(i + "个作者");
            book.setPrice(i);
            book.setPubCompany("天高");
            service.insertBook(book);
        }
    }

    @Test
    public void test3() {
        service.deleteBookById(1);
    }

    @Test
    public void test4() {
        service.selectAllBook();
    }
}
