package com.company.순서쌍의개수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120836?language=java

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(1);
    }
}
//100
//(1, 100), (2, 50), (4, 25), (5, 20), (10, 10), (20, 5), (25, 4), (50, 2), (100, 1)
class Solution {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if (n % i == 0)
            {
                answer++;
            }
        }

//        return (int) IntStream.rangeClosed(1,n).filter(value -> n%value ==0).count();
        return answer;
    }
}