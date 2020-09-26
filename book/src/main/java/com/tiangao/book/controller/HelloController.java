package com.tiangao.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/26  10:30
 * @Modified By:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
