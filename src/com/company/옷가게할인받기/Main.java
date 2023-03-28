package com.company.옷가게할인받기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120818

public class Main {
}

class Solution {
    public int solution(int price) {
        double discount = 0;
        if(price<100000){
            discount = 1;
        }
        else if(price>=100000 && price<300000){
            discount = 0.95;
        }
        else if(price>=300000 && price<500000){
            discount = 0.9;
        }
        else if(price>=500000){
            discount = 0.8;
        }

        return (int)(price * discount);
    }
}