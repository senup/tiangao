package com.tiangao.book.pojo;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  10:25
 * @Modified By:
 */
public class Booktype {
    private Integer no;
    private String name;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
