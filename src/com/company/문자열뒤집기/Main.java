package com.company.문자열뒤집기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120822

public class Main {
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }
}