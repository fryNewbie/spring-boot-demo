package com.example.demo.book.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author fry
 * @since 2019-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Book对象", description="学生信息表")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图书编号")
    @TableId("bookID")
    private String bookID;

    @ApiModelProperty(value = "书名")
    @TableField("bookName")
    private String bookName;

    @ApiModelProperty(value = "出版日期")
    @TableField("PD")
    private LocalDateTime pd;

    @ApiModelProperty(value = "作者")
    private String author;

    @ApiModelProperty(value = "价格")
    private String price;


}
