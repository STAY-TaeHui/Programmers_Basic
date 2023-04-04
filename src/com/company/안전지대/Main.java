package com.company.안전지대;
//https://school.programmers.co.kr/learn/courses/30/lessons/120866

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}});
    }
}
/*
* 0xxx0
* xx1x0
* x1xx0
* xx1x0
* 0xxx0
*
* 0 01234
* 1 01234
* 2 01234
* 3 01234
* 4 01234
* */
class Solution {
    static int[][] copyBoard;

    public static int solution(int[][] board) {
        int answer = 0;
//        copyBoard = Arrays.copyOfRange(board, 0, board.length);
//          2차원 배열은 copyOfRange로 깊은복사 안됨

        copyBoard = new int[board.length][board.length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                copyBoard[i][j] = board[i][j];
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 1){//2,1
                    boom(i-1,j-1, i+1, j+1);
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(copyBoard[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void boom(int sti, int stj, int endi, int endj)
    {
        int copyLen = copyBoard.length;
        sti = Math.max(sti, 0);
        stj = Math.max(stj, 0);
        endi = Math.min(endi, copyLen - 1);
        endj = Math.min(endj, copyLen - 1);

        for (int i = sti; i <= endi; i++)
        {
            for (int j = stj; j <= endj; j++)
            {
                copyBoard[i][j] = 2;
            }
        }
    }
}