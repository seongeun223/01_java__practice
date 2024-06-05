package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        new Run().test();
    }
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 수를 입력하세요.");
        int b = sc.nextInt();
        NumberProcess numberProcess = new NumberProcess();

        try {

            numberProcess.checkDouble(a,b);
            boolean bl = new NumberProcess().checkDouble(a, b);

            if(bl) {
                System.out.println(a + "는(은)" + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는(은)" + b + "의 배수가 아닙니다.");
            }

        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());

        }
    }
}
