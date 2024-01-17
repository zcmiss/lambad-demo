package com.zc.lambda.demo.stream.demo;

import com.zc.lambda.demo.stream.pojo.Author;
import com.zc.lambda.demo.stream.pojo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据
 *
 * @author zengc
 * @date 2024/01/17
 */
public class AuthorData {
    public static List<Author> getAuthors() {
        // 数据初始化
        Author luXun = new Author(1L, "鲁迅", 30, "中国现代文学家、思想家、革命家、民主战士、爱国者、教育家、翻译家。", null);
        Author caoXueqin = new Author(2L, "曹雪芹", 30, "中国清代作家，著有长篇小说《红楼梦》。", null);
        Author laoShe = new Author(3L, "老舍", 30, "中国现代作家、戏剧家、文学评论家、翻译家。", null);
        Author baJin = new Author(4L, "巴金", 30, "中国现代作家、文学评论家、翻译家。", null);
        Author bingXin = new Author(5L, "冰心", 30, "中国现代作家、诗人、翻译家、儿童文学作家、散文家。", null);
        Author guoMoruo = new Author(6L, "郭沫若", 30, "中国现代作家、诗人、翻译家、儿童文学作家、散文家。", null);

        // 书籍列表初始化
        // 鲁迅的作品
        ArrayList<Book> luXunBooks = new ArrayList<>();
        luXunBooks.add(new Book(1L, "狂人日记", 30.0, "鲁迅", "小说", 9, "《狂人日记》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXunBooks.add(new Book(2L, "呐喊", 30.0, "鲁迅", "小说", 9, "《呐喊》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXunBooks.add(new Book(3L, "彷徨", 30.0, "鲁迅", "小说", 9, "《彷徨》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXunBooks.add(new Book(4L, "故事新编", 30.0, "鲁迅", "小说", 9, "《故事新编》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXunBooks.add(new Book(5L, "野草", 30.0, "鲁迅", "小说", 9, "《野草》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXunBooks.add(new Book(6L, "朝花夕拾", 30.0, "鲁迅", "小说", 9, "《朝花夕拾》是鲁迅创作的一篇短篇小说，最初发表于1918年5月15日的《新青年》第四卷第五号。"));
        luXun.setBooks(luXunBooks);

        // 曹雪芹的作品
        ArrayList<Book> caoXueqinBooks = new ArrayList<>();
        caoXueqinBooks.add(new Book(1L, "红楼梦", 30.0, "曹雪芹", "小说", 9, "《红楼梦》是一部白话长篇章回体小说，是中国古典四大名著之一，中国古典长篇巅峰之作，由清代作家曹雪芹所著。"));
        caoXueqin.setBooks(caoXueqinBooks);

        // 老舍的作品
        ArrayList<Book> laoSheBooks = new ArrayList<>();
        laoSheBooks.add(new Book(1L, "四世同堂", 30.0, "老舍", "小说", 9, "《四世同堂》是老舍创作的一部长篇小说，于1943年由上海晨光出版公司出版。"));
        laoSheBooks.add(new Book(2L, "骆驼祥子", 30.0, "老舍", "小说", 9, "《骆驼祥子》是老舍创作的一部长篇小说，于1939年由上海晨光出版公司出版。"));
        laoSheBooks.add(new Book(3L, "茶馆", 30.0, "老舍", "小说", 9, "《茶馆》是老舍创作的一部长篇小说，于1943年由上海晨光出版公司出版。"));
        laoSheBooks.add(new Book(4L, "龙须沟", 30.0, "老舍", "小说", 9, "《龙须沟》是老舍创作的一部长篇小说，于1943年由上海晨光出版公司出版。"));
        laoShe.setBooks(laoSheBooks);

        // 巴金的作品
        ArrayList<Book> baJinBooks = new ArrayList<>();
        baJinBooks.add(new Book(1L, "家", 30.0, "巴金", "小说", 9, "《家》是巴金创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        baJinBooks.add(new Book(2L, "春", 30.0, "巴金", "小说", 9, "《春》是巴金创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        baJinBooks.add(new Book(3L, "秋", 30.0, "巴金", "小说", 9, "《秋》是巴金创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        baJinBooks.add(new Book(4L, "冬", 30.0, "巴金", "小说", 9, "《冬》是巴金创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        baJin.setBooks(baJinBooks);

        // 冰心的作品
        ArrayList<Book> bingXinBooks = new ArrayList<>();
        bingXinBooks.add(new Book(1L, "寄小读者", 30.0, "冰心", "小说", 9, "《寄小读者》是冰心创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        bingXin.setBooks(bingXinBooks);

        // 郭沫若的作品
        ArrayList<Book> guoMoruoBooks = new ArrayList<>();
        guoMoruoBooks.add(new Book(1L, "激流三部曲", 30.0, "郭沫若", "小说", 9, "《激流三部曲》是郭沫若创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        guoMoruoBooks.add(new Book(2L, "祝福", 30.0, "郭沫若", "小说", 9, "《祝福》是郭沫若创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        guoMoruoBooks.add(new Book(3L, "春蚕", 30.0, "郭沫若", "小说", 9, "《春蚕》是郭沫若创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        guoMoruoBooks.add(new Book(4L, "秋收", 30.0, "郭沫若", "小说", 9, "《秋收》是郭沫若创作的一部长篇小说，于1931年由上海晨光出版公司出版。"));
        guoMoruo.setBooks(guoMoruoBooks);

        // 作者列表初始化
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(luXun);
        authors.add(caoXueqin);
        authors.add(laoShe);
        authors.add(baJin);
        authors.add(bingXin);
        authors.add(guoMoruo);
        return authors;
    }
}
