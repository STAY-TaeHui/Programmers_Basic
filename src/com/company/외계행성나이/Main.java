package com.company.외계행성나이;
//https://school.programmers.co.kr/learn/courses/30/lessons/120834

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(23);
    }
}

class Solution {
    public static String solution(int age) {
        String strAge = age+"";
        StringBuilder sb = new StringBuilder();
        char[] chars = strAge.toCharArray();
        for(char c : chars){
            int intC = c-48+97;
            System.out.println(intC);
            sb.append((char)intC);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}