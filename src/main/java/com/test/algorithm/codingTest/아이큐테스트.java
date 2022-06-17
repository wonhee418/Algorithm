package com.test.algorithm.codingTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 : 홀수 또는 짝수중에 하나만 존재하는 값의 순번을 출력하는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) "2 4 7 8 10" ⇒ 3 # 7만 홀수
 * - ex) "1 2 1 1" ⇒ 2 # 2만 짝수
 *
 * **주의할점**
 * - 순번의 시작은 0이 아니라 1입니다.
 *
 * 풀이 :
 *  짝수와 홀수 List를 만든 후, 주어진 숫자를 각 List에 담은 후
 *  배열의 개수가 1개인 배열의 값을 주어진 배열에서 몇번째에 있는지 찾는다
 */


public class 아이큐테스트 {
    public int solution(String numbers) {
        String[] numArry = numbers.split(" ");
        List<Integer> numList = new ArrayList<>();
        //짝수를 담을 List
        List<Integer> even = new ArrayList<>();
        // 홀수를 담을 List
        List<Integer> odd = new ArrayList<>();

        for (String num: numArry) {
            int n = Integer.parseInt(num);
            numList.add(n);
            //숫자가 짝수라면 짝수 List에 추가 , 홀수라면 홀수 List에 추가
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }
        // 인덱스는 0번쨰 부터 시작하기 때문에 +1을 해줍니다.
        // 홀수의 갯수가 1개라면 해당 값을 주어준 배열에 몇번째에 있는지 찾고,
        // 홀수의 갯수가 1개가 아니라면 짝수가 1개이므로 짝수의 값을 주어진 배열의 몇번째에있는지 찾습니다.
       return odd.size() == 1 ? numList.indexOf(odd.get(0)) + 1 : numList.indexOf(even.get(0)) + 1;
    }

    public static void main(String[] args) {
        아이큐테스트 method = new 아이큐테스트();
        System.out.println(method.solution("2 4 7 8 10"));
    }
}

