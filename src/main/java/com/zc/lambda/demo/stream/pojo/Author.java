package com.zc.lambda.demo.stream.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

/**
 * 著者
 *
 * @author zengc
 * @date 2024/01/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Author implements Comparable<Author> {

    /** id */
    private Long id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
    /** 简介 */
    private String intro;
    /** 书籍 */
    private List<Book> books;

    /**
     * 与相比
     *
     * @param o o
     * @return int
     */
    @Override
    public int compareTo(Author o) {
        return this.getAge() - o.getAge();
    }
}
