package com.company.유한소수판변;
//https://school.programmers.co.kr/learn/courses/30/lessons/120878

public class Main {
    public static void main(String[] args) {
        Solution.solution(11,22);
    }
}

class Solution {
    public static int solution(int a, int b) {
        int answer = 1;
        //최소공배수
        int result = gcd(a,b);
        b = b%result == 0 ? b/result : b;
        int nmg = 0;

        while(b>1){
            if(b%2 !=0 && b%5 != 0){
                answer = 2;
                break;
            }
            else{
                if(b%2 ==0){
                    b = b/2;
                }else if(b%5 ==0){
                    b = b/5;
                }
            }
        }


        return answer;
    }
    public static int gcd(int a, int b){
        while (b != 0) {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}