package com.test.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 : 이름이 4글자면 친구입니다. 친구를 찾는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) ["Ryan", "Kieran", "Mark"] => ["Ryan", "Mark"]
 *
 * **주의할점**
 * - 입력받은 순서를 유지해서 출력해주세요.
 */


public class 친구찾기 {
    public List<String> solution(String[] numArray) {
        //이름이 4글자인 사람이 친구이기에 standard 변수에 기준을 입력해줍니다.
        int standard = 4;
        //배열의 추가를 위해 List를 사용합니다.
        List<String> myFriends = new ArrayList<String>();
        // 입력받은 사람 수 만큼 for문을 돌려 이름이 4글자인 친구를 찾습니다.
        for (String friend :numArray) {
            //이름이 4글자라면
            if (standard == friend.length()) {
                // myFriends에 친구를 추가합니다.
                myFriends.add(friend);
            }
        }
        return myFriends;
    }

    public static void main(String[] args) {
        친구찾기 method = new 친구찾기();
        String[] friends = {"Ryan", "Kieran", "Mark"};
        System.out.println(method.solution(friends));
    }
}

