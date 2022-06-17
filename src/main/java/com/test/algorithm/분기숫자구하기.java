package com.test.algorithm;


/**
 * 문제 : 1~12월중에 숫자를 입력받고 1분기, 2분기, 3분기, 4분기를 리턴하는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) 3 ⇒ 1
 * - ex) 8 ⇒ 3
 * - ex) 11 ⇒ 4
 *
 * **주의할점**
 * - 1부터 12까지의 숫자만 입력합니다.
 */
public class 분기숫자구하기 {
    public int solution(int month) {
        // 입력된 값을 3으로 나누어 소수점 올림한 값이 분기를 나타내는 원리를 이용하여 분기를 구합니다.
        return (int)Math.ceil((double)month / 3);
    }

        public static void main (String[]args){
            분기숫자구하기 method = new 분기숫자구하기();
            System.out.println(method.solution(4));
        }
}

