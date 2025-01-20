import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 체크포인트
        // 남녀, 학년을 기준으로 분류되어야 함
        // 방마다 기준인원을 충족하는지 초과하는지 체크하는 로직 필요

        int students = sc.nextInt(); // 학생 수
        int limit = sc.nextInt(); // 최대 배정 가능 인원
        int[] girls = new int[7]; // 남학생 정보를 담은 배열
        int[] boys = new int[7]; // 여학생의 정보를 담은 배열
        int roomCount = 0; // 필요한 방 갯수

        // 학생 수만큼 학생의 정보를 입력받는다
        for (int i = 0; i < students; i++) {
            // 여학생일 경우
            if (sc.nextInt() == 0) {
                girls[sc.nextInt()] += 1;
            // 남학생일 경우
            } else {
                boys[sc.nextInt()] += 1;
            }
        }

        // 1학년 부터 학년별로 배열을 순회하면서
        for (int i = 1; i <= 6; i++) {
            // 여학생
            if (girls[i] <= limit && girls[i] != 0) { // 학년별 여핵생이 최대인원 이하이면
                roomCount++; // 방 갯수를 하나 더해준다
            } else if (girls[i] > limit) { // 인원이 초과한다면
                // 초과된 인원을 기준인원으로 나눈 몫에 1을 더해준다
                roomCount += Math.floor(girls[i]/limit) + 1;
            }

            //남학생도 여학생과 같은 로직으로 연산 진행
            if (boys[i] <= limit && boys[i] != 0) {
                roomCount++;
            } else if (boys[i] > limit) {
                roomCount += Math.floor(boys[i]/limit) + 1;
            }
        }
        System.out.print(roomCount);
    }
}