package com.zc.lambda.demo.lamdba;


import java.util.function.IntPredicate;

/**
 * lamdba demo1
 * 练习
 *
 * @author zengc
 * @date 2024/01/17
 */
public class LamdbaDemo1 {
    public static void main(String[] args) {
        parintNum((num) -> num % 2 == 0);
    }


    public static void parintNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
