package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo6
 * 中间操作 limit
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo6 {
    public static void main(String[] args) {
        // 获取所有作家
        List<Author> authors = AuthorData.getAuthors();
        // 获取流
        authors.stream()
                // 去重
                .distinct()
                // 排序
                .sorted()
                // 截取前两个
                .limit(2)
                // 输出
                .forEach(author -> System.out.println(author.getName()));
    }
}
