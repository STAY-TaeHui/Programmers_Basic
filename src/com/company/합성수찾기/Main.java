package com.company.합성수찾기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120846

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(15);
    }
}

class Solution {
    public static int solution(int n) {
        int answer =0;
        if(n<4){
            return 0;
        }
        for(int i=4; i<=n; i++){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
                if (count >= 3)
                {
                    answer++;
                    break;
                }
            }
        }
        return (int)IntStream.rangeClosed(4, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() > 2).count();
//        return answer;
    }
}