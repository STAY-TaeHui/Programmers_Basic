package com.company.개미군단;
//https://school.programmers.co.kr/learn/courses/30/lessons/120837

public class Main {
    public static void main(String[] args)
    {
    }
}
//5, 3, 1
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int five = 5;
        int three = 3;
        int one = 1;

        answer = answer+(hp/five);
        hp = hp % five;
        answer = answer+(hp/three);
        hp = hp%three;
        answer = answer+hp/one;
        return answer;
    }
}