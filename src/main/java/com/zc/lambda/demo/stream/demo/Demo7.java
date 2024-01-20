package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo7
 * 中间操作 skip
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo7 {
    public static void main(String[] args) {
        // 获取所有作家
        List<Author> authors = AuthorData.getAuthors();
        // 创建流
        authors.stream()
                // 去重
                .distinct()
                // 排序
                .sorted()
                // 跳过第一个
                .skip(1)
                // 输出
                .forEach(author -> System.out.println(author.getName()));
    }
}
