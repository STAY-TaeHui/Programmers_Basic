package com.company.암호해독;
//https://school.programmers.co.kr/learn/courses/30/lessons/120892

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution.solution("dfjardstddetckdaccccdegk",4);
    }
}

class Solution {
    public static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] cipherArr = cipher.split("");
        for(int i=0; i<cipherArr.length; i++){
            if((i+1)%code == 0)
                sb.append(cipherArr[i]);
        }
//        return sb.toString();

        return IntStream.range(0,cipher.length())
                .filter(v -> (v+1)%code == 0 )
                .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                .collect(Collectors.joining());
    }
}