package com.test.algorithm.codewars.kyu8;


import java.util.Arrays;

/**
 * 문제 : Your task is to make two functions
 *       ( max and min, or maximum and minimum, etc., depending on the language )
 *       that receive a list of integers as input, and return the largest and lowest number in that list, respectively.
 *       주어진 배열에서 최댓값과 최소값을 구하여라라
 *
 *
 *       입출력 예
 *       [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
 *       [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
 *       [42, 54, 65, 87, 0]             -> min = 0, max = 87
 *       [5]                             -> min = 5, max = 5
 */
public class FindMaximumandMinimumValuesofaList {
    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length -1];
    }

    public static void main(String[] args) {
        FindMaximumandMinimumValuesofaList method = new FindMaximumandMinimumValuesofaList();
        int[] min ={4,6,2,1,9,63,-134,566};
        int[] max ={-52, 56, 30, 29, -54, 0, -110};
        System.out.println(method.min(min));
        System.out.println(method.max(max));
    }
}

