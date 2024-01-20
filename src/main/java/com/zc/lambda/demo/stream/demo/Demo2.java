package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo2
 * 中间操作 filter
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Author> authors = AuthorData.getAuthors();
        // 打印所有作家姓名长度大于2的作家

        //集合转换成流
        authors.stream()
                // 过滤 作家姓名长度大于2的
                .filter(author -> author.getName().length() > 2)
                // 输出 作家姓名
                .forEach(author -> System.out.println(author.getName()));
    }
}
