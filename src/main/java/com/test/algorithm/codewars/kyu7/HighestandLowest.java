package com.test.algorithm.codewars.kyu7;


import javax.lang.model.type.ArrayType;
import java.util.Arrays;

/**
 * 문제 : In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *        주어진 문자열에서 가장 큰 숫자와 작은 숫자를 출력하여라
 *
 *       입출력 예
 *       highAndLow("1 2 3 4 5")  // return "5 1"
 *       highAndLow("1 2 -3 4 5") // return "5 -3"
 *       highAndLow("1 9 3 4 -5") // return "9 -5"
 */
public class HighestandLowest {
    public static String solution(String numbers) {
        String[] arrNum = numbers.split(" ");
        int len = arrNum.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            int n = Integer.parseInt(arrNum[i]);
            num[i] = n;
        }
        Arrays.sort(num);
        String high = Integer.toString(num[len-1]);
        String low = Integer.toString(num[0]);
        return high +" " + low;
    }

    public static void main(String[] args) {
        HighestandLowest method = new HighestandLowest();
        System.out.println(method.solution("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}

