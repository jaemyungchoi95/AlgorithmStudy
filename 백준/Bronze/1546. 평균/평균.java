import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 시험본 과목의 개수 N
		int[] arr = new int[N]; // 과목별 점수를 담아줄 정수 배열 선언
		double max = 0;
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < N; i++) {
			sum += (double)(arr[i] / max) * 100;
		}
		
		System.out.printf("%f\n", sum/N);
		
		sc.close();
	}
}
