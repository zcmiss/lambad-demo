package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo1
 * 测试类
 *
 * @author zengc
 * @date 2024/01/17
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Author> authors = AuthorData.getAuthors();
        System.out.println(authors);
    }

}
