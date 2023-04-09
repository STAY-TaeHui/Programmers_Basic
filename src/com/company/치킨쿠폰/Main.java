package com.company.치킨쿠폰;
//https://school.programmers.co.kr/learn/courses/30/lessons/120884
public class Main {
}

class Solution {
    public int solution(int chicken) {
        int answer = -1;
        if(chicken<10){
            return 0;
        }
        return orderByCoupon(chicken/10, chicken%10);
    }
    public int orderByCoupon(int chicken, int coupon){
        if(coupon>=10){
            chicken += coupon/10;
            coupon = coupon%10;
        }
        if(chicken == 0){
            return 0;
        }

        return chicken + orderByCoupon(chicken/10, coupon+chicken%10);
    }
}