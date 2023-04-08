package com.company.한번등장한문자;
//https://school.programmers.co.kr/learn/courses/30/lessons/120896

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution("1231235444");
    }
}

class Solution {
    private static String answer;
    private static StringBuilder sb = new StringBuilder();

    public static String solution(String s) {
//        String answer = s;
        answer = s;

//        for(String st : s.split("")){
//            if (sb.indexOf(st) == -1) {
//                sb.append(st);
//            }else{
//                answer = answer.replaceAll(st,"");
//            }
//        }
        Arrays.stream(answer.split("")).forEach(c -> {
            if (sb.indexOf(c) == -1) {
                sb.append(c);
            }else{
                answer = answer.replaceAll(c,"");
            }
        });

        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        sb = new StringBuilder();
        for(char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }
}