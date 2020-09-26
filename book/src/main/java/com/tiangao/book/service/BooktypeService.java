package com.tiangao.book.service;

import com.tiangao.book.mapper.BooktypeMapper;
import com.tiangao.book.pojo.Booktype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  10:46
 * @Modified By:
 */
@Service
public class BooktypeService {

    @Autowired
    private BooktypeMapper booktypeMapper;

    public void insertBooktype(String name) {
        booktypeMapper.insertBooktype(name);
    }

    public Booktype getBooktype(int no) {
        return booktypeMapper.getBooktypeById(no);
    }

    public List<Booktype> selectAllBooktype() {
        return booktypeMapper.getAllBooktype();
    }

    public void deleteBooktypeById(int no) {
        booktypeMapper.deleteBooktypeById(no);
    }

    public void updateBooktype(Booktype booktype) {
        Integer no = booktype.getNo();
        String name = booktype.getName();
        booktypeMapper.updateBooktype(no, name);
    }
}
