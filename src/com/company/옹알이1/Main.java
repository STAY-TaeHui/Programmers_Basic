package com.company.옹알이1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        Solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    }
}
class Solution {
    public static int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for(String b : babbling){
            for(String s : str){
                b=b.replaceAll(s," ");
                if(b.trim().length()==0)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}