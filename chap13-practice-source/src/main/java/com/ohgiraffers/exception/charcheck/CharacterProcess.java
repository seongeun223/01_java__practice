package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {


    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {

        // chap10-api-section02-String/indexOf() : 문자열에서 특정 문자 정수형으로 반환
        //일치하는 문자가 없을 때 -1 반환


            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    count++;


                }   if (s.indexOf(" ") > -1) {
                    throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

                }

            }



            return count;
        }
    }




