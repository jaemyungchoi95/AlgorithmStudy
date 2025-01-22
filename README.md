# AlgorithmStudy
알고리즘 문제 공부

백준, 프로그래머스 문제를 공부합니다
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 체크포인트
        // 문자열에서 단어만 주어진다.
        // 아래와 같은 규칙이 있음
        // 1. 알파벳 소문자, 숫자, 공백, 특문 < > 로만 이루어짐
        // 2. 문자열의 시작과 끝은 공백이 아님
        // 3. < 와 > 가 문자열에 있는 경우 번갈아가며 등장 => 즉 짝을 맞춰서 등장한다?
        // 	  태그는 단어x , 태그와 단어 사이에 공백x
        
        // 보니까 태그는 안바뀜 => 즉, 태그는 대상이 아닌 것으로 봐야 한다.
        // 공백 혹은 태그를 기준으로 하여 뒤집을 문자를 찾아야 함
        // 탐색을 하면서 만약 <를 만나면 거기서부터는 >를 만날 때 까지 해당 문자들을 임시변수에 담아준다.
        // 공백을 만나고도 마찬가지
        
        // 태그의 ASCII Code 를 가져오려면?
        // String r = "<", l = ">";
        // int rNum = (int)r.charAt(0), lNum = (int)l.charAt(0);
        // System.out.printf("< 아스키 : %d, > 아스키 : %d", rNum, lNum);
        // => 출력 "< 아스키 : 60, > 아스키 : 62" / 공백의 아스키 : 32
        
        // char 라면 바로 (int)char 로 캐스팅이 가능하지만, string인 경우 charAt(인덱스)로
        // 가져오는 문자의 형태를 한글자 즉, char로 바꿔줘야 한다!!!
        
        String S = sc.nextLine(); // 문자열을 한줄 다 받아준다
//        System.out.printf("S 값 확인 : %s\n", S); // 잘 받아졌는지 확인
        
        String strStay = ""; // 원본으로 보존할 문자열을 입력받아 줄 임시 변수
        String strRev = ""; // 원본으로 보존할 문자열을 입력받아 줄 임시 변수
        
        List<String> strRevArr = new ArrayList<>(); // 문자열을 뒤집어 줄 임시배열 선언
        List<String> answerArr = new ArrayList<>(); // 정답이 되는 문자를 받아줄 배열 선언
        
//        		strRevArr.add(Character.toString(S.charAt(i)));

        // 문자열을 탐색한다
        for (int i = 0; i < S.length(); i++) {
//        	System.out.printf("문자열의 문자는 : %c, ASCII : %d\n", S.charAt(i), (int)S.charAt(i));
        	
        	// 만약 문자의 i번째의 인덱스가 "<" 에 해당한다면
        	if ((int)S.charAt(i) == 60) {
        		strStay += Character.toString(S.charAt(i)); // strStay에 글자를 누적해준다
        		// 그러다가 i번째의 인덱스가 ">" 에 해당한다면
        		if ((int)S.charAt(i) == 62) {
        			answerArr.add(strStay); // 누적된 글자를 정답 배열에 담아주고
        			strStay = ""; // strStay 문자열을 초기화 시킨다 
        		}
        		
        		// 만약 문자의 i번째의 인덱스가 "<" 에 해당하지 않는다면
        	} else if ((int)S.charAt(i) != 60) {
        		
        	}
        	
        	
        }
        System.out.printf("strRevArr 잘 담겼는지? : %s\n", strRevArr);
        System.out.printf("answerArr 잘 담겼는지? : %s\n", answerArr);
        System.out.printf("strRev에는 잘 담겼는지? : %s", strRev);
    }
}
