package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Stream;

/**
 * demo9
 * 总结 操作 forEach
 *
 * @author zengc
 * @date 2024/01/19
 */
public class Demo9 {


    /** 作者数据 */
    final static private List<Author> authorDatas = AuthorData.getAuthors();

    public static void main(String[] args) {
        authorDatas.stream()
                .map(Author::getName)
                .distinct()
                .forEach(System.out::println);


    }
}
