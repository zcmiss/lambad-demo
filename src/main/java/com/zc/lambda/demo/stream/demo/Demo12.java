package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;
import com.zc.lambda.demo.stream.pojo.Book;
import org.w3c.dom.ls.LSOutput;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * demo12
 * 终结操作 collect
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo12 {
    /** 作者数据 */
    final private static List<Author> authorDatas = AuthorData.getAuthors();

    public static void main(String[] args) {
        // 获取所有作家的名字转换成map 集合
        Map<String, List<Book>> collect = authorDatas.stream()
                .collect(Collectors.toMap(Author::getName, Author::getBooks));
        // 循环展示
        collect.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

    }

    /**
     * 测试02
     * 获取所有作家的名字转换成set 集合
     */
    public static void test02() {
        // 获取所有作家的名字转换成set 集合
        Set<String> collect = authorDatas.stream()
                .map(Author::getName)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }

    /**
     * 测试01
     * 获取所有作家的名字转换成List 集合
     */
    public static void test01() {
        // 获取所有作家的名字转换成List 集合
        List<String> collect = authorDatas.stream()
                .map(Author::getName)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
