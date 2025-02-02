import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 체크포인트
        // 섬의 갯수를 세어야 하는데, 연결되어있으면 한 개의 섬임 (대각선으로 연결되어도 하나의 섬!!!)
        // 너비 : w => m , 높이 : h => n
        // 1 <= w, h <= 50
        // 1은 땅, 0은 바다
        // 마지막 입력줄은 0 0 이 주어진다 => while 문으로 마지막 입력이 0 0 이 나오면 탈락

        // 상, 우상, 우, 우하, 하, 좌하, 좌, 좌상 방향 순으로 8방탐색
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        // 상하좌우 탐색만 하면 2번째 입력에서 섬이 2개가 됨... -> 대각으로 연결될 경우 상하좌우로만 안되기 때문에 탐색방향 추가

        // 반복 횟수가 정해지지 않기 때문에 입력을 지속적으로 받아준다
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            // 입력받은 변수를 재할당
            int m = w; // 가로 (2차원)
            int n = h; // 세로 (1차원)

            // 0 0 입력이 들어오기 전까지는 무한 반복한다
            if (w == 0 && h == 0) {
                break;
            }

            String[][] board = new String[n][m]; // 땅과 섬의 정보를 담는 배열 선언
            boolean[][] vis = new boolean[n][m]; // 방문 여부를 담는 배열 선언

            // board 배열에 입력을 받아준다
            for (int i = 0; i < n; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    board[i][j] = st2.nextToken();
                }
            }
//            System.out.println(Arrays.deepToString(board)); // 배열 입력들어오는 것 확인

            int count = 0; // 섬의 갯수
            // 스택을 사용할 것인데 Deque로 대신하여 사용
            Deque<int[]> stack = new ArrayDeque<int[]>();

            // Deque 사용법
            // stack.addFirst(e) == push
            // stack.removeFirst() == pop
            // stack.peekFirst() == peek

            // 모든 좌표를 탐색하면서
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    // 만약 board에서 해당 위치가 0이거나 방문한 적이 없을 경우 넘어가고
                    if (board[x][y].equals("0") || vis[x][y]) {
                        continue;
                    }

                    count++; // 섬을 발견하면 카운트를 더해주고
                    stack.addFirst(new int[]{x, y}); // 스택에 탐색 시작을 진행할 좌표를 담아준다
                    vis[x][y] = true; // 그리고 방문했다고 표시

                    // stack에 방문할 장소가 있는 동안
                    while (!stack.isEmpty()) {
                        // 현 탐색기준 위치를 직전 탐색의 x축과 y축으로 빼주고
                        int[] cur = stack.removeFirst();
                        int curX = cur[0];
                        int curY = cur[1];

                        // 8방향으로 탐색을 진행하는데
                        for (int dir = 0; dir < 8; dir++) {
                            int nx = curX + dx[dir];
                            int ny = curY + dy[dir];

                            // 탐색범위를 벗어난다면 건너뛰고
                            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                                continue;
                            }

                            // 만약 기존에 탐색했던 범위 혹은 대상이 아니라면 건너뛴다.
                            // (vis 배열에서 방문한 배열이 true가 들어있거나 혹은 0이라면)
                            if (vis[nx][ny] || board[nx][ny].equals("0")) {
                                continue;
                            }

                            vis[nx][ny] = true; // 위의 조건을 통과했다면 방문표시를 하고
                            stack.addFirst(new int[]{nx,ny}); // stack에도 저장한다
                        }
                    }
                }
            }
            System.out.println(count);
        }
    } // 메인함수 끝
}