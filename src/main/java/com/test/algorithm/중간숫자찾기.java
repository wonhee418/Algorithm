package com.test.algorithm;

import java.util.Arrays;

/**
 * 문제 : 3개의 숫자 중에 2번째 크기의 숫자 위치를 찾는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) [0,1,2] ⇒ 1
 * - ex) [5,1,2] ⇒ 2
 */

public class 중간숫자찾기 {
    public int solution(int[] numArray) {
        //입력된 숫자를 오름차순으로 정렬합니다.
        Arrays.sort(numArray);
        //크기순으로 정렬된 배열중 두번째 크기의 자릿수를 가리켜 리턴합니다.
        return numArray[1];
    }

    public static void main(String[] args) {
        중간숫자찾기 method = new 중간숫자찾기();
        int[] ints = {6, 8, 3};
        System.out.println(method.solution(ints));
    }
}

