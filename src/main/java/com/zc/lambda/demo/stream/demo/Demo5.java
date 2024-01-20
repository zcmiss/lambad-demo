package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.Comparator;
import java.util.List;

/**
 * demo5
 * 中间操作 排序 sorted
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo5 {
    public static void main(String[] args) {
        // 获取所有作家
        List<Author> authors = AuthorData.getAuthors();
        authors.stream()
                .distinct()
                .sorted(Comparator.comparing(Author::getAge))
                .forEach(author -> System.out.println(author.getName()));
    }

    /**
     * 测试01
     * 空餐排序
     */
    public static void test01() {
        List<Author> authors = AuthorData.getAuthors();
        // 创建流
        authors.stream()
                // 去重
                .distinct()
                // 实现Comparable接口 来进行空参排序
                .sorted()
                // 输出
                .forEach(author -> System.out.println(author.getName()));
    }
}
