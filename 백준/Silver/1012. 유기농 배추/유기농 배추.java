import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 체크포인트
        // 흰 배추벌레를 놓는 곳은 1 (true)이어야 함
        // 상하좌우 연결이 되어있다면 전부 탐색 후 방문했다는 표시를 남긴다
        // 전부 탐색이 완료되었을 때 끝난다

        int T = sc.nextInt(); // 테스트 케이스의 수

        // 테스트케이스만큼 수행한다
        for (int t = 0; t < T; t++) {
            int M = sc.nextInt(); // 가로 길이
            int N = sc.nextInt(); // 세로 길이
            int K = sc.nextInt(); // 배추가 심어진 위치의 개수

            int[][] farmArr = new int[N][M]; // 배추밭 초기 배열 선언
            boolean[][] needVisitArr = new boolean[N][M]; // 방문여부 배열 선언

            // 반복문을 통해 배추밭을 전부 0, false로 초기화 시켜준다
            for (int i = 0; i < N; i++) {
                Arrays.fill(farmArr[i],0);
                Arrays.fill(needVisitArr[i], false);
            }

            // 배추가 심어진만큼 해당 위치에 1, true를 넣어준다
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                farmArr[y][x] = 1;
                needVisitArr[y][x] = true;
            }

            // 상, 하, 좌, 우 순으로 x, y 축을 선회하도록 배열을 만들어준다
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};

            // 벌레의 마릿수를 저장해 줄 변수 선언
            int bugAmount = 0;

            // BFS를 위한 Queue 선언
            Queue<Integer> queue = new LinkedList<>();

            // 배열을 탐색하면서
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    // 만약 방문해야 하는 것으로 표시되어 있고 더불어 해당 위치가 1이라면
                    if (needVisitArr[n][m] && farmArr[n][m] == 1) {
                        queue.add(n); // y축을 담아준다 (n 이 세로의 넓이 = y)
                        queue.add(m); // x축을 담아준다 (m 이 가로의 넓이 = x)
                        needVisitArr[n][m] = false; // 방문한 곳은 방문을 했다는 표시로 변경해주고
                        bugAmount++; // 벌레 마리수를 추가한다

                        // 큐가 비어있지 않을 동안
                        while (!queue.isEmpty()) {
                            int y = queue.poll(); // 먼저 넣어준 y 축을 꺼내서 담아 준다
                            int x = queue.poll(); // 다음 넣어준 x 축을 꺼내서 담아 준다

                            // 4방향 탐색을 위해 4번 반복하면서
                            for (int i = 0; i < 4; i++) {
                                int ny = y + dy[i]; // 다음 탐색할 x, y 좌표들을 담아준다.
                                int nx = x + dx[i];

                                // 범위를 초과하지 않도록 제한해준다 (0이상 길이 미만)
                                if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
                                    // 최초 조건과 동일하게 검사해서 방문해야 하는 인접 장소라면 동일하게 담아준다.
                                    if (farmArr[ny][nx] == 1 && needVisitArr[ny][nx]) {
                                        queue.add(ny);
                                        queue.add(nx);
                                        needVisitArr[ny][nx] = false; // 방문했다고 체크
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // 결과 출력
            System.out.println(bugAmount);
        } // 첫번째 반복문 끝
    }
}