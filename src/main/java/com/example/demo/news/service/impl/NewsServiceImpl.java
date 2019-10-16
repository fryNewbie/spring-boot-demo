package com.example.demo.news.service.impl;

import com.example.demo.news.entity.News;
import com.example.demo.news.mapper.NewsMapper;
import com.example.demo.news.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fry
 * @since 2019-10-08
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
