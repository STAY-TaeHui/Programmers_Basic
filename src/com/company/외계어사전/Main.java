package com.company.외계어사전;
//https://school.programmers.co.kr/learn/courses/30/lessons/120869

import java.util.Arrays;

public class Main {
}
//["p", "o", "s"]	["sod", "eocd", "qixm", "adio", "soo"]
//["z", "d", "x"]	["def", "dww", "dzx", "loveaw"]
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        for(String d : dic){
            for(String sp : spell){
                if(d.contains(sp)){
                    count++;
                }
            }
            if(count == spell.length)
                answer = 1;
            else
                count = 0;
        }
        return answer;
    }
}