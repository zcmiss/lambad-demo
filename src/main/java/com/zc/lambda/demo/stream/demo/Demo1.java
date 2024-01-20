package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * demo1
 * 创建流
 *
 * @author zengc
 * @date 2024/01/17
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<Object, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("1", 1);
        integerHashMap.put("2", 2);
        integerHashMap.put("3", 3);
        integerHashMap.put("4", 4);
        integerHashMap.put("5", 5);
        integerHashMap.put("6", 6);
        integerHashMap.put("7", 7);
        integerHashMap.put("8", 8);
        integerHashMap.put("9", 9);
        integerHashMap.put("10", 10);

        // 获取entrySet
        integerHashMap.entrySet()
                // 转换成流
                .stream()
                // 过滤值是 2以上的
                .filter(entry -> entry.getValue() > 2)
                // 输出
                .forEach(entry -> System.out.println(entry.getKey() + "：" + entry.getValue()));
    }

    public static void test03() {
        // 数组
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 数组转换成流
        Stream.of(arr)
                // 去重
                .distinct()
                // 过滤 2以上的
                .filter(i -> i > 2)
                // 输出
                .forEach(System.out::println);
    }

    public static void test02() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 数组转换成流
        Arrays.stream(arr)
                // 去重
                .distinct()
                // 过滤 2以上的
                .filter(i -> i > 2)
                // 输出
                .forEach(System.out::println);
    }

    public static void test01() {
        List<Author> authors = AuthorData.getAuthors();
        // 吧集合转换成流
        authors.stream()
                // 去重
                .distinct()
                // 过滤 30岁以上的
                .filter(author -> author.getAge() > 30)
                // 输出
                .forEach(author -> System.out.println(author.getName()));
    }
}
