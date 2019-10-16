package com.example.demo.news.controller;


import com.example.demo.news.entity.News;
import com.example.demo.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * @since 2019-10-08
 */
@RestController
@RequestMapping("/news/news")
@CrossOrigin
public class NewsController {

    @Autowired
    private INewsService iNewsService;

    @GetMapping("/list")
    public List<News> news(){
        return iNewsService.list();
    }


}
