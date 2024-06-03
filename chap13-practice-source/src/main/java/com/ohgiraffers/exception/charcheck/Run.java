package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        // Scanner sc 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요.");
        String str = sc.next();
        CharacterProcess characterProcess = new CharacterProcess();

        characterProcess.countAlpha(str);

    }

    public void test1() {


    }
}
