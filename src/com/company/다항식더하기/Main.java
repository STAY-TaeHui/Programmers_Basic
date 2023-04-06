package com.company.다항식더하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120863
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution.solution("2");
    }
}

class Solution {
    public static String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();

        int xCount = 0;
        int numCount = 0;


        for(String p : polynomial.split(" ")){
            if(!p.equals("+")){
                if(p.contains("x")){
                    String replaceX = p.replace("x", "");
                    xCount += replaceX.isBlank() ? 1 : Integer.parseInt(replaceX);
                }
                else{
                    numCount += Integer.parseInt(p);
                }
            }
        }
        if(xCount != 0){
            if (xCount != 1) {
                answer.append(xCount);
            }
            answer.append("x");
        }
        if(numCount != 0){
            if(answer.length() != 0){
                answer.append(" + ");
            }
            answer.append(numCount);
        }
        return answer.toString();
    }
}