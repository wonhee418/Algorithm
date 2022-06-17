package com.test.algorithm.programmers.Level1;


import java.util.Arrays;

/**
 * 문제 : 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 *       numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 *       제한사항
 *       - 1 ≤ numbers의 길이 ≤ 9
 *       - 0 ≤ numbers의 모든 원소 ≤ 9
 *       - numbers의 모든 원소는 서로 다릅니다.
 *
 *       입출력 예
 *       numbers	            result
 *       [1,2,3,4,6,7,8,0]	      14
 *       [5,8,4,0,6,7,9]	      6
 */

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        //0~9까지의 합 - numbers의 값 하나씩을 빼준다면 없는 숫자의 합과 같은 결과값이 나옵니다.
        int answer = 45;
        //numbers에 담긴 입력값수 많큼 for문을 돌리기
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }

    public static void main(String[] args) {
        없는숫자더하기 method = new 없는숫자더하기();
        int[] d = {1,2,3,4,6,7,8,0};
        System.out.println(method.solution(d));
    }
}

