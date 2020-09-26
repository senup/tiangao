package com.tiangao.book;

import com.tiangao.book.pojo.Booktype;
import com.tiangao.book.service.BooktypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  11:06
 * @Modified By:
 */
@SpringBootTest
public class MyTest {
    @Autowired
    private BooktypeService booktypeService;

    @Test
    public void addMore() {
        for (int i = 0; i < 100;i++) {
            booktypeService.insertBooktype("杂志"+(i+1900)+"期");
        }
    }

    @Test
    public void listBookTypes() {
        List<Booktype> booktypes =
                booktypeService.selectAllBooktype();
        booktypes.forEach(System.out::println);
    }

    @Test
    public void getOneBookType() {
        Booktype booktype = booktypeService.getBooktype(2);
        Booktype booktype2 = booktypeService.getBooktype(222222222);
        System.out.println(booktype);
        System.out.println(booktype2);
    }

    @Test
    public void deleteOne() {
        booktypeService.deleteBooktypeById(1);
    }

}
