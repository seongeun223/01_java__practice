package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {


    public CharacterProcess() {
    }

    public int countAlpha(String s) {
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i ) >= 65 && s.charAt(i) <= 90) {
              count++;

          } else if (i == 10) {
              int CharCheckException = 0;
              return CharCheckException;
              
          }
        }

        
        return count;

    } 
}



