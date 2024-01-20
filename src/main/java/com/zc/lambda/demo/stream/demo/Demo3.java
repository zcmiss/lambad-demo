package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * demo3
 * 中间操作 Map
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo3 {
    public static void main(String[] args) {
        // 打印所有作家的姓名
        List<Author> authors = AuthorData.getAuthors();
        // 集合转换成流
        authors.stream()
                // Map 转换成作家年龄
                .map(author -> author.getAge() + 10)
                // 输出
                .forEach(System.out::println);

    }

    public static void test01() {
        // 打印所有作家的姓名
        List<Author> authors = AuthorData.getAuthors();
        // 集合转换成流
        authors.stream()
                // Map 转换成作家姓名
                .map(Author::getName)
                // 输出
                .forEach(System.out::println);
    }
}
