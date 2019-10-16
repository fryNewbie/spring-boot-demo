package com.example.demo.book.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.demo.book.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fry
 * @since 2019-08-27
 */
@DS("slave")
public interface BookMapper extends BaseMapper<Book> {

}
