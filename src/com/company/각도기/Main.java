package com.company.각도기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120829

public class Main {
}

class Solution {
    public static int solution(int angle) {
        final int acuteAngle = 1;
        final int rightAngle = 2;
        final int obtuseAngle = 3;
        final int flatAngle = 4;

        if (angle < 90 && angle>0) {
            return acuteAngle;
        }
        else if(angle == 90){
            return rightAngle;
        }
        else if(angle>90 && angle<180){
            return obtuseAngle;
        }
        else if(angle==180)
            return flatAngle;
        else
            return 0;
    }
}