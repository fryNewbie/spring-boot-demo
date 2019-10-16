package com.example.demo.book.controller;


import com.example.demo.book.entity.Book;
import com.example.demo.book.service.IBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fry
 * @since 2019-08-27
 */
@RestController
@RequestMapping("/book/book")
@Api(tags = "书籍管理接口",description = "v1.0")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @ApiOperation("获取书记列表")
    @GetMapping("/list")
    public List<Book> books(){
        return iBookService.list();
    }


}
