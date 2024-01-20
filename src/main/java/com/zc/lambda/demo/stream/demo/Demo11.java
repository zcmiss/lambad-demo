package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;
import com.zc.lambda.demo.stream.pojo.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * demo11
 * 终结操作 max min
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo11 {
    /** 作者数据 */
    final static private List<Author> authorDatas = AuthorData.getAuthors();

    public static void main(String[] args) {
        // 最大评分
        Optional<Integer> max = authorDatas.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(Book::getScore)
                .distinct()
                .max(Comparator.comparingInt(s -> s));
        System.out.println("最大值：" + max.get());

        // 最小评分
        Optional<Integer> min = authorDatas.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(Book::getScore)
                .distinct()
                .min(Comparator.comparingInt(s -> s));
        System.out.println("最小值：" + min.get());

    }
}
