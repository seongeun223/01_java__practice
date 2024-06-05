package com.ohgiraffers.hw1.model.comparator;

import java.util.Comparator;

public class AssCategory<BookDTO> implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;
        if(o1.getCategory() - o2.getCategory() > 0){
            result = 1;
        } else if(o1.getCategory() - o2.getCategory() < 0) {
            result = -1;
        }
        return result;
    }

    public void getCategory() {

    }
}
