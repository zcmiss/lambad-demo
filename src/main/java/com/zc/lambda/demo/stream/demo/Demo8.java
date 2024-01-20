package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;
import com.zc.lambda.demo.stream.pojo.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * demo8
 * 中间操作 flatMap
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo8 {
    public static void main(String[] args) {
        List<Author> authors = AuthorData.getAuthors();
        // 创建流
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split("，")))
                .distinct()
                .forEach(System.out::println);


    }
    public static void test02() {
        // 打印所有书籍的名称
        List<Author> authors = AuthorData.getAuthors();
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .forEach(book -> System.out.println(book.getName()));
    }

    public static void test01() {
        List<Author> authors = AuthorData.getAuthors();
        authors.stream()
                .map(Author::getBooks)
                .forEach(books -> books.forEach(book -> System.out.println(book.getName())));
    }
}
