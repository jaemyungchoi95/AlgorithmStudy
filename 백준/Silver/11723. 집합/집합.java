import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[21];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()); //연산 회당 입력을 받을 것
            int arr2 = 0;
            String arr1 = st.nextToken();

            if(!(arr1.equals("all") || arr1.equals("empty"))){
                arr2 = Integer.parseInt(st.nextToken());
            }
            switch (arr1) {
                case "add":
                    arr[arr2] = 1;
                    break;

                case "remove":
                    arr[arr2] = 0;
                    break;

                case "check":
                    bw.write(arr[arr2]+"\n");
                    break;

                case "toggle":
                    arr[arr2] = (arr[arr2]+1)%2;
                    break;

                case "all":
                    Arrays.fill(arr,1);
                    break;

                case "empty":
                    arr = new int[21];
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}