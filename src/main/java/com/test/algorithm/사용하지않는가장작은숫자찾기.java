package com.test.algorithm;

import java.util.Arrays;
import java.util.HashMap;


/**
 * 문제 : 0부터 시작하는 양수(+)인 ID가 있습니다. 여러 ID를 보고 사용하지 않는 가장 작은 숫자를 찾는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) [0,1,2,4] ⇒ 3
 * - ex) [0,1,2,3,4,5,6] ⇒ 7
 *
 * **주의할점**
 * - 정렬되지 않는 배열을 넣어도 동작해야함
 * - 중복된 숫자가 있는 경우도 동작해야함
 */

public class 사용하지않는가장작은숫자찾기 {
    public int solution(int[] arr) {
        //중복된 숫자가 있거나, 정렬되지 않은 배열이여도 찾을 수 있도록 주어진 배열을 오름차순으로 정렬합니다.
        Arrays.sort(arr);
        //배열의 0번째 숫자부터 1씩 증가한 값을 배열의 숫자와 차례대로 비교합니다
        int i = arr[0];
        for (int num: arr) {
            //비교한 값이 서로 맞지 않는다면 해당 값이 사용하지않는 가장 작은수입니다.
            if (i != num) {
                return i;
            }
            i++;
        }
        // 사용하지 않는 숫자가 가장 마지막숫자일 경우를 대비하여 해당 값을 리턴합니다.
        return i;
    }
        public static void main (String[]args){
            사용하지않는가장작은숫자찾기 method = new 사용하지않는가장작은숫자찾기();
            int[] arr = {0,3,2,1,4,6,9};
            System.out.println(method.solution(arr));
        }
}

