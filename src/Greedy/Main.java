package Greedy;

import java.util.Arrays;

public class Main {
    /*
        문제: 한 개의 회의실에서 진행할 수 있는 최대 회의 수 구하기
        - 목표: 하나의 회의실에서 최대한 많은 회의 진행하기
        - 입력: N개의 회의 시간(시작 시간, 종료 시간)
        - 출력: 최대 회의 개수
        - 조건:
         1. 한 회의가 끝나는 것과 동시에 다음 회의 시작 가능
         2. 회의는 중간에 중단될 수 없음
         3. 시작 시간과 종료 시간이 같을 수도 있음*/
    public static void main(String[] args) {
        // 테스트용 회의 배열 생성
        int[][] meetings = {
                {1, 4},  // 1번팀
                {3, 5},  // 2번팀
                {0, 6},  // 3번팀
                {5, 7},  // 4번팀
                {3, 8},  // 5번팀
                {5, 9},  // 6번팀
                {6, 10}, // 7번팀
                {8, 11}  // 8번팀
        };

        // 최대 회의 개수 구하기
        int maxCount = maxMeetings(meetings);
        System.out.println("최대 진행 가능한 회의 수: " + maxCount);
    }

    private static int maxMeetings(int[][] meetings) {
        //1. 정렬 단계
        //1.1 종료 시간을 기준으로 오름 차순 정렬
        Arrays.sort(meetings, (a, b) -> a[1]-b[1]);  //종료시간인 인덱스 1번값을 기준으로 더 빠르면 앞으로 정렬
        // 2. 회의 선택 및 카운트 단계
        // 2.1. 첫 번째 회의 선택 및 카운트 1 증가
        int count = 1;
        // 2.2. 첫 번째 회의의 종료 시간 저장
        int lastEndTime = meetings[0][1];

        // 2.3. 이전 선택한 회의의 종료 시간보다 시작 시간이 같거나 늦은 회의 중에서
        //      가장 일찍 끝나는 회의 선택하고 카운트 증가
        // 2.4. 더 이상 선택할 회의가 없을 때까지 2.3 반복
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] >= lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }

        // 3. 결과 반환 단계
        // 3.1. 회의 카운트 반환
        return count;
    }
}
