package com.tiangao.book.service;

import com.tiangao.book.mapper.BookMapper;
import com.tiangao.book.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  11:43
 * @Modified By:
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public void insertBook(Book book) {
        bookMapper.insert(book);
    }

    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    public Book getBookById(int no) {
        return bookMapper.getBookById(no);
    }

    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    public void deleteBookById(int no) {
        bookMapper.deleteBookById(no);
    }
}
