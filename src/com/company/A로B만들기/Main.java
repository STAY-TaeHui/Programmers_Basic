package com.company.A로B만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120886


import java.util.Arrays;

public class Main {

}
class Solution {
    public int solution(String before, String after) {
        char[] bfArray = before.toCharArray();
        char[] afArray = after.toCharArray();

        Arrays.sort(bfArray);
        Arrays.sort(afArray);

        for(int i=0; i<bfArray.length; i++){
            if(bfArray[i]!=afArray[i]){
                return 0;
            }
        }
//        return Arrays.equals(bfArray, afArray) ? 1:0;

        return 1;
    }
}//        return new String(a).equals(new String(b)) ? 1 :0;
//          new String() 에 char[]를 넣으면 문자열이 됨!
