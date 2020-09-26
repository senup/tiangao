package com.tiangao.book.controller;

import com.tiangao.book.pojo.Booktype;
import com.tiangao.book.service.BooktypeService;
import com.tiangao.book.utils.XTJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 涛哥
 * @Description:分类表
 * @Date: Created in 2020/9/26  10:41
 * @Modified By:
 */
@RestController
@RequestMapping("/booktype")
public class BooktypeController {

    @Autowired
    private BooktypeService booktypeService;

    /**
     *
     * @auther: 涛哥
     * @Description: 新增分类
     * @date: 2020/9/26 11:39
     * @param: [name]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @PostMapping
    public XTJSONResult insertBooktype(@RequestParam("name")String name) {
        if (StringUtils.isBlank(name)) {
            return XTJSONResult.errorMsg("name can not be null!");
        }
        booktypeService.insertBooktype(name);
        return XTJSONResult.ok();
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 获取所有分类
     * @date: 2020/9/26 11:39
     * @param: []
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @GetMapping
    public XTJSONResult getAllBooktype() {
        List<Booktype> booktypes = booktypeService.selectAllBooktype();
        if (CollectionUtils.isEmpty(booktypes)) {
            return XTJSONResult.errorMsg("the result of query is null!");
        }
        return XTJSONResult.ok(booktypes);
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 获取单个分类
     * @date: 2020/9/26 11:40
     * @param: [no]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @GetMapping("/{no}")
    public XTJSONResult getBooktype(@PathVariable("no") int no) {
        Booktype booktype = booktypeService.getBooktype(no);
        if(booktype == null) {
            return XTJSONResult.errorMsg("query bookType but not found!");
        }
        return XTJSONResult.ok(booktype);
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 更新分类
     * @date: 2020/9/26 11:40
     * @param: [booktype]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @PutMapping
    public XTJSONResult updateBooktype(Booktype booktype) {
        if (booktype == null) {
            return XTJSONResult.errorMsg("parm can not be null");
        }
        booktypeService.updateBooktype(booktype);
        return XTJSONResult.ok();
    }

    /**
     *
     * @auther: 涛哥
     * @Description: 根据ID删除某个分类
     * @date: 2020/9/26 11:40
     * @param: [no]
     * @return: com.tiangao.book.utils.XTJSONResult
     *
     */
    @DeleteMapping("/{no}")
    public XTJSONResult deleteBooktype(@PathVariable("no") Integer no) {
        if (no == null) {
            return XTJSONResult.errorMsg("id can not be null");
        }
        booktypeService.deleteBooktypeById(no);
        return XTJSONResult.ok();
    }


}
