package com.zc.lambda.demo;

import java.util.function.IntConsumer;

/**
 * lamdba demo3
 * 省略规则
 *
 * @author zengc
 * @date 2024/01/17
 */
public class LamdbaDemo3 {
    /**
     * 主要
     *
     * @param args args
     */
    public static void main(String[] args) {
        foreacharr(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf("%d ", value);
            }
        });
        System.out.println();
        foreacharr(System.out::print);
    }

    /**
     * 前景
     *
     * @param intConsumer int消费者
     */
    public static void foreacharr(IntConsumer intConsumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            intConsumer.accept(i);
        }
    }

}
