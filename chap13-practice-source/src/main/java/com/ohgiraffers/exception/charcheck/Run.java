package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
       new Run().test1();

    }

    public void test1() {
        // Scanner sc 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요.");
        String str = sc.nextLine();

        CharacterProcess characterProcess = new CharacterProcess();

        try {
            characterProcess.countAlpha(str);

        } catch (CharCheckException e) {
            System.out.println(e.getMessage());

        }



    }
}
