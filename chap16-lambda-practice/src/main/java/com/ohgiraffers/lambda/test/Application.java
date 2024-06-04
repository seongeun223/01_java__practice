package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.*;

import static java.lang.Double.sum;
import static java.lang.Double.valueOf;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    private void test1() {
        Supplier<LocalTime> supplier = () -> LocalTime.now();
        LocalTime localTime = supplier.get();
        System.out.println(localTime);

    }

    private void test2() {
        Supplier<Set<Integer>> supplier = () -> {

            Set<Integer> ball = new TreeSet<>();
            while (ball.size() < 6) {
                ball.add((int) (Math.random() * 45) + 1);
                //System.out.println("로또 번호 : " + ball);

            }
            return ball;
        };
        System.out.println(supplier.get());

    }

    private void test3() {
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 원화의 달러는 " + (double) num /1300 + "$입니다.");
        intConsumer.accept(3000);

    }

    private void test4() {
//        IntToDoubleFunction intToDoubleFunction = () -> double;#applyAsDouble(int value)
//        Function<Integer, String> function = (str) -> Integer.parseInt(str);
//        String strValue = "12345";
        Function<Integer, String> intConsumer = (num) -> "입력하신 원화의 달러는 " + (double) num /1300 + "$입니다.";
        System.out.println(intConsumer.apply(3000));
}

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
            Predicate<String> predicate = str -> str.trim().length() ==0;

        for(String str : strList) {
            System.out.println("[" + str + "의 길이는 0입니까?" + "]" + predicate.test(str));



        }
    }
}
