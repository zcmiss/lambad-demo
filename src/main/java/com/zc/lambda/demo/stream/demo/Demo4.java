package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo4
 * 中间操作  distinct
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo4 {
    public static void main(String[] args) {
        // 获取所有作家
        List<Author> authors = AuthorData.getAuthors();
        //创建流
        authors.stream()
                .distinct()
                .forEach(author -> System.out.println(author.getName()));

    }
}
