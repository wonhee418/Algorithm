package com.test.algorithm.codingTest;


/**
 * 문제 : 각 자리의 숫자를 더한값을 원래 숫자에서 빼고 결과가 하단에 나열한 과일코드가 나올때까지 계산하는 코드를 작성해주세요.
 *        1-kiwi
 *        2-pear
 *        3-kiwi
 *        4-banana
 *        5-melon
 *        6-banana
 *        7-melon
 *        8-pineapple
 *        9-apple
 *        10-pineapple
 *        ...
 *        1~ 100까지 각 숫자의 과일코드가 정해져있다.
 *
 * **예시**
 * - ex) 10 => 10 - (1+0) = 9 ⇒ apple
 * - ex) 325 =>
 *     - 325 - (3+2+5) = 315
 *     - 315 - (3+1+5) = 306
 *     - 306 - (3+0+6) = 297
 *     - ...
 *
 * **주의할점**
 * - 10~10000 사이의 숫자를 입력합니다.
 */
public class 더하고빼기 {
    public String solution(int n) {

        // 주어진 숫자를 문자형으로 변환후 한자리씩 배열에 담습니다.
        String[] num = Integer.toString(n).split("");

        //각 자리의 숫자를 더한 값의 초기값입니다.
        int sum = 0 ;
        for (String s : num) {
            //각 자리의 숫자를 더한 값을 sum에 담아 줍니다.
            sum += Integer.parseInt(s);
        }
        //원래 숫자에서 각 자리의 숫자를 더한 값을 뺀 결과값을 calc에 담아줍니다.
        int calc = n - sum;
        // 계산 한 값이 100 이상이라면 100 이하가 될때까지 반복해주고,
        // 100이하가 됐다면 해당 숫자의 해당하는 과일코드를 출력합니다.
        return calc > 100 ? solution(calc) : (calc % 9) == 0 ? calc + "-apple" : "다른과일";
    }

    public static void main(String[] args) {
        더하고빼기 method = new 더하고빼기();
        System.out.println(method.solution(325));
    }
}

