package com.zc.lambda.demo.lamdba;

import java.util.function.IntBinaryOperator;

/**
 * lamdba demo1
 * 入门
 *
 * @author zengc
 * @date 2024/01/17
 */
public class LamdbaDemo0 {
    public static void main(String[] args) {
        // 1. 使用匿名内部类的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类的方式");
            }
        }).start();

        // 2. 使用Lambda表达式
        new Thread(() -> System.out.println("使用Lambda表达式")).start();

        // 3. 练习
        int num = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println("num = " + num);

        int num2 = calculateNum((left, right) -> left + right);
        System.out.println("num2 = " + num2);


    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
