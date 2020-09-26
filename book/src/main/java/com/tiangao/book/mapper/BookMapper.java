package com.tiangao.book.mapper;

import com.tiangao.book.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  11:42
 * @Modified By:
 */
public interface BookMapper {
    @Insert("insert into book (type_no, name, price, pub_time, author,pub_company)" +
            "values"+
            "(#{typeNo},#{name},#{price},now(),#{author},#{pubCompany})")
    void insert(Book book);

    @Select("select * from book")
    List<Book> selectAllBook();


    @Select("select * from book where no = #{no}")
    Book getBookById(@Param("no") int no);


    @Update("update book set " +
            "name = #{name}," +
            "type_no = #{typeNo}," +
            "price = #{price}," +
            "author = #{author}," +
            "pub_company = #{pubCompany}" +
            "where no = #{no}")
    void updateBook(Book book);

    @Delete("delete from book where no = #{no}")
    void deleteBookById(@Param("no") int no);
}
