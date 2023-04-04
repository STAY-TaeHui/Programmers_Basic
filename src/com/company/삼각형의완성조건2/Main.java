package com.company.삼각형의완성조건2;
//https://school.programmers.co.kr/learn/courses/30/lessons/120868

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(new int[]{11,7});
    }
}
/*
[3, 6]	5
- 6일때 -> 3< 4,5, <=6
- 6말고 -> 3+6> 8,7 >6
[11, 7]	13
- 11일때 -> 5,6,7,8,9,10,11
- 11말고 -> 17,16,15,14,13,12
*/
class Solution {
    public static int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int min = 0;

        if(sides[0]>sides[1]){
            max = sides[0];
            min = sides[1];
        }
        else{
            max = sides[1];
            min = sides[0];
        }
        answer +=IntStream.rangeClosed(max-min+1, max).count();
        System.out.println(answer);
        answer +=IntStream.range(max+1,min+max).count();
        System.out.println(answer);

        return answer;
    }
}