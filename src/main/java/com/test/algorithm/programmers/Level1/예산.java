package com.test.algorithm.programmers.Level1;


import java.util.Arrays;

/**
 * 문제 : S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
 *       그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다.
 *       그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
 *       물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
 *       예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며,
 *       1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
 *       부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
 *       최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
 *
 *       제한사항
 *       - d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
 *       - d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
 *       - budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.
 *
 *       입출력 예
 *           d      	budget	    result
 *       [1,3,2,5,4]	  9           3
 *       [2,2,3,3]	     10           4
 */

public class 예산 {
    public int solution(int[] d, int budget) {
        //주어진 배열 d 를 오름차순으로 정렬
        Arrays.sort(d);
        int sum = 0;
        int result = 0;
        for (int n : d) {
            //정렬된 숫자를 한번씩 계속 더해서
            sum += n;
            //더한값이 budget보다 같거나 커질때까지 카운팅을 해준다.
            if (sum <= budget) {
                result++;
            } else {
                break;
            }
        }
        //budget 보다 같거나 커질때까지 카운팅 된 숫자가 지원해 줄 수 있는 부서 수이다.
        return result;
    }

    public static void main(String[] args) {
        예산 method = new 예산();
        int[] d = {1,3,2,5,4};
        System.out.println(method.solution(d, 9));
    }
}

