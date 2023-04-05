package com.company.소인수분해;
//https://school.programmers.co.kr/learn/courses/30/lessons/120852
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(420);
    }
}

class Solution {
    public static List<Integer> list = new ArrayList<>();
    public static int[] solution(int n) {
        int[] answer = {};
        div(n,2);

        answer = list.stream().mapToInt(v->v).distinct().toArray();
        return answer;
    }
    public static void div(int num, int d){
        if(num<2){
            return;
        }
        if(num % d == 0){
            list.add(d);
            div(num/d, d);
        }
        else{
            div(num, d+1);
        }
    }
}