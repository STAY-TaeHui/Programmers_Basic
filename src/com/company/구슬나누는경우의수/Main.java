package com.company.구슬나누는경우의수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120840

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(3,2);
    }
}
//n!
//(n-m)! * m!
class Solution {
    public static int solution(int balls, int share) {
        int top = rec(balls);
        int bottom = rec(balls-share) * rec(share);

        return top/bottom;
    }
    public static int rec(int num){
        if(num!=0){
            return num*rec(num-1);
        }
        else return 1;

    }
}