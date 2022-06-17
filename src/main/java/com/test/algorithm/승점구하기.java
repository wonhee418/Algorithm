package com.test.algorithm;


/**
 * 문제 : 점수를 보고 이기면 3점, 비기면 1점, 지면 0점으로 계산하여 전체 승점을 구하는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) ["3:1", "2:2", "1:3"] ⇒ 4
 *
 * **주의할점**
 * - 10개의 경기 점수를 입력합니다.
 * - 0점에서 최대 4점까지 입력합니다.
 */
public class 승점구하기 {
    public int solution(String[] arr) {
        //한 번도 이기지 못했을 경우를 대비하여 초기값을 0으로 설정합니다.
        int result = 0;
        for (String score : arr) {
            //우리팀의 점수와 상대팀의 점수를 비교하기위해 : 기준으로 나누어줍니다.
            String[] num = score.split(":");
            //우리팀 점수
            int ourTeam = Integer.parseInt(num[0]);
            //상대팀 점수
            int opposingTeam = Integer.parseInt(num[1]);

            //int scoreSum = a > b ? 3 : a < b ? 0 : 1; => 삼항 연산자를 중첩으로 사용할시 가독성이 좋지 않아 if문으로 사용했습니다
            //우리팀이 이겼을때 3점 추가
            if(ourTeam > opposingTeam)
                result += 3;
            //무승부일때 1점 추가
            if(ourTeam == opposingTeam)
                result += 1;
            //우리팀이 졌을때 0점(승점 추가 없음)
            if(ourTeam < opposingTeam)
                result += 0;
        }
        return result;
    }
        public static void main (String[]args){
            승점구하기 method = new 승점구하기();
            String[] arr = {"3:1","2:2","1:3","2:1","1:1","4:1","2:3","3:3","4:2","1:4"};
            System.out.println(method.solution(arr));
        }
}

