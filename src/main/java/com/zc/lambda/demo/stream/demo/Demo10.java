package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import java.util.List;

/**
 * demo10
 * 终结操作 count 计数
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo10 {
    /** 作者数据 */
    final static private List<Author> authorDatas = AuthorData.getAuthors();

    public static void main(String[] args) {
        long count = authorDatas.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .count();
        System.out.println(count);

    }
}
