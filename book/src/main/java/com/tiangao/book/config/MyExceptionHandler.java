package com.tiangao.book.config;

import com.tiangao.book.utils.XTJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 涛哥
 * @Description:异常处理
 * @Date: Created in 2020/9/26  12:41
 * @Modified By:
 */
@ControllerAdvice
public class MyExceptionHandler {
    //声明要捕获的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public XTJSONResult defultExcepitonHandler(HttpServletRequest request, Exception e) {
        return XTJSONResult.errorMsg("可能违反外键约束");
    }

}
