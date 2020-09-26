package com.tiangao.book.pojo;

import java.util.Date;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  10:34
 * @Modified By:
 */
public class Book {
    private Integer no;
    private Integer typeNo;
    private String name;
    private double price;
    private Date pubTime;
    private String author;
    public  String pubCompany;

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", typeNo=" + typeNo +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pubTime=" + pubTime +
                ", author='" + author + '\'' +
                ", pubCompany='" + pubCompany + '\'' +
                '}';
    }

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubCompany() {
        return pubCompany;
    }

    public void setPubCompany(String pubCompany) {
        this.pubCompany = pubCompany;
    }
}
