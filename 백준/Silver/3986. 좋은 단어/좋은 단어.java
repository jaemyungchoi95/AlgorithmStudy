import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 단어의 수
        int count = 0; // 좋은 단어의 갯수를 담아줄 변수


        // N만큼 단어를 입력받아 준다
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int length = word.length();

            Deque<String> stack = new ArrayDeque<>(); // 단어를 관리해줄 Deque 선언 (Stack으로 활용)
            // Deque 활용법
            // stack.addFirst() = 자료 추가
            // stack.removeFirst() = 자료 삭제
            // stack.peekFirst() = 직전 자료를 불러온다.
            // stack.clear() = 비우기

            // stack에 한글자씩 넣어줄 것인데
            for (int j = 0; j < length; j++) {
                String letter = Character.toString(word.charAt(j)); // 글자를
                // 민약 stack이 비워져있으면 조건없이 넣고
                if (stack.isEmpty()) {
                    stack.addFirst(letter);
                } else {
                    // 차있으면 이전 글자와 비교하여 동일한 글자가 들어오면 일단 넣고 두개 삭제해준다
                    if (stack.peekFirst().equals(letter)) {
                        stack.removeFirst();
                        // 동일한 글자가 아니면 그냥 추가해준다.
                    } else {
                        stack.addFirst(letter);
                    }
                }
            }

            // 만약 모든 반복이 끝났을 때 stack이 비워져있으면 count++
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.print(count);
    }
}
