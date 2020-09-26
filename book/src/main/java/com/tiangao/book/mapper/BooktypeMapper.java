package com.tiangao.book.mapper;

import com.tiangao.book.pojo.Booktype;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  10:55
 * @Modified By:
 */
public interface BooktypeMapper {

    @Insert("INSERT INTO booktype(name) VALUES (#{name})")
    void insertBooktype(@Param("name") String name);


    @Select("select * from booktype where no = #{no}")
    Booktype getBooktypeById(@Param("no") int no);

    @Select("select * from booktype")
    List<Booktype> getAllBooktype();

    @Delete("delete from booktype where no = #{no}")
    void deleteBooktypeById(@Param("no") int no);

    @Update("update booktype set name = #{name} where no = #{no}")
    void updateBooktype(@Param("no")Integer no, @Param("name")String name);


}
