package com.zc.lambda.demo.lamdba;

import java.util.function.Function;

/**
 * lamdba demo2
 * 方法泛型
 *
 * @author zengc
 * @date 2024/01/17
 */
public class LamdbaDemo2 {
    public static void main(String[] args) {
        Integer typrConver = typrConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        System.out.println(typrConver);

        Integer typrConver2 = typrConver(Integer::parseInt);
        System.out.println(typrConver2);

        String typrConver1 = typrConver(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "测试：" + s;
            }
        });
        System.out.println(typrConver1);
        String typrConver3 = typrConver(s -> "测试：" + s);
        System.out.println(typrConver3);


    }

    /**
     * 典型对流器
     *
     * @param function 作用
     * @return {@link R}
     */
    public static <R> R typrConver(Function<String, R> function) {
        String str = "12345";
        return function.apply(str);
    }

}
