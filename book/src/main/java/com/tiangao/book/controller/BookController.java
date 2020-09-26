package com.tiangao.book.controller;

import com.github.pagehelper.PageHelper;
import com.tiangao.book.pojo.Book;
import com.tiangao.book.pojo.Booktype;
import com.tiangao.book.service.BookService;
import com.tiangao.book.utils.XTJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description: 图书具体信息表
 * @Date: Created in 2020/9/26  10:41
 * @Modified By:
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     *
     * @auther: 涛哥
     * @Description: 插入图书
     * @date: 2020/9/26 12:48
     * @param: [book]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @PostMapping
    public XTJSONResult insertBook(Book book) {
        if (book == null) {
            return XTJSONResult.errorMsg("book can not be null");
        }
        bookService.insertBook(book);
        return XTJSONResult.ok();
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 分页查询
     * @date: 2020/9/26 12:48
     * @param: [page, size]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @GetMapping
    public XTJSONResult getAllBook(Integer page,Integer size) {
        if (page == null) {
            page=1;
        }
        if (size == null) {
            size=10;
        }
        PageHelper.startPage(page,size);
        List<Book> books = bookService.selectAllBook();
        if (CollectionUtils.isEmpty(books)) {
            return XTJSONResult.errorMsg("can not find list!");
        }
        return XTJSONResult.ok(books);
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 根据id查询图书
     * @date: 2020/9/26 12:48
     * @param: [no]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @GetMapping("/{no}")
    public XTJSONResult getBookById(@PathVariable("no") Integer no) {
        if (no == null) {
            return XTJSONResult.errorMsg("id can not be null");
        }
        Book book = bookService.getBookById(no);
        if(book == null) {
            return XTJSONResult.errorMsg("query book but not found!");
        }
        return XTJSONResult.ok(book);
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 更新图书
     * @date: 2020/9/26 12:48
     * @param: [book]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @PutMapping
    public XTJSONResult updateBook(Book book) {
        bookService.updateBook(book);
        return XTJSONResult.ok();
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 根据id删除图书
     * @date: 2020/9/26 12:48
     * @param: [no]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @DeleteMapping("/{no}")
    public XTJSONResult deleteBooktype(@PathVariable("no") Integer no) {
        if (no == null) {
            return XTJSONResult.errorMsg("id can not be null");
        }
        bookService.deleteBookById(no);
        return XTJSONResult.ok();
    }

}
