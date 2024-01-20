package com.zc.lambda.demo.stream.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

/**
 * 书
 *
 * @author zengc
 * @date 2024/01/17
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Book  {

    /** id */
    private Long id;
    /**书名*/
    private String name;
    /**价格*/
    private Double price;
    /**作者*/
    private String  authorName;
    /** 类别 */
    private String category;
    /** 分数 */
    private Integer score;
    /** 简介 */
    private String intro;

}
