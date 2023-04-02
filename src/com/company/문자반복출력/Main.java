package com.company.문자반복출력;
//https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class Main {
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] my_chars = my_string.toCharArray();

        for(char c : my_chars){
            for(int i=0; i<n; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}