import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int size = arr.length;

        for(int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int x = sc.nextInt();
        int left = 0;
        int right = n-1;
        while(right > left){
            if(arr[left]+arr[right] == x){
                count++;
                left++;
            } else if (arr[left]+arr[right] < x) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}