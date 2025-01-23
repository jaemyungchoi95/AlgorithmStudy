import java.util.ArrayList;
import java.util.Collections;
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
        // 탐색을 하면서 만약 <를 만나면 거기서부터는 >를 만날 때 까지 해당 문자들을 임시배열에 담아준다.
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
        
        List<String> strCheckArr = new ArrayList<>(); // 문자열을 체크해 줄 배열 선언
        List<String> answerArr = new ArrayList<>(); // 정답이 되는 문자를 받아줄 배열 선언
        
        // 문자열 S를 탐색하면서
        for (int i = 0; i < S.length(); i++) {
//        	System.out.println(S.charAt(i)); // 출력 테스트
        	strCheckArr.add(Character.toString(S.charAt(i)));
        	
        	// 만약 strCheckArr 배열의 첫 번째에 <, 마지막에 > 가 담기면
        	if (strCheckArr.get(0).equals("<") && strCheckArr.get(strCheckArr.size()-1).equals(">")) {
        		// 해당 글자만큼은 문자로 결합하여 answerArr에 담아주고
        		answerArr.add(String.join("", strCheckArr));
        		// strCheckArr은 초기화 시켜준다
        		strCheckArr.clear();
        		// 만약배열의 첫번째에 < 가 없으며, 마지막에 공백을 만나면
        	} else if (!strCheckArr.get(0).equals("<") && strCheckArr.get(strCheckArr.size()-1).equals(" ")) {
        		// 배열을 역순으로 반전시키고 
        		Collections.reverse(strCheckArr);
        		// 앞으로 가게 된 공백을 뒤로 이동시켜준다
        		strCheckArr.add(" "); // 맨뒤에 공백 추가
        		strCheckArr.remove(0); // 맨 앞의 공백 제거
        		// 작업이 완료되었다면, 해당 글자만큼은 문자로 결합하여 answerArr에 담아주고
        		answerArr.add(String.join("", strCheckArr));
        		// strCheckArr은 초기화 시켜준다
        		strCheckArr.clear();
        		
        		// 만약 배열의 마지막에 <를 만나면 
        	} else if (strCheckArr.get(strCheckArr.size()-1).equals("<")) {
        		// 배열의 마지막에 있는 "<" 를 빼주고
        		strCheckArr.remove(strCheckArr.size()-1);
        		// 배열을 역순으로 반전시킨다
        		Collections.reverse(strCheckArr);
        		// 작업이 완료되었다면, 해당 글자만큼은 문자로 결합하여 answerArr에 담아주고
        		answerArr.add(String.join("", strCheckArr));
        		// strCheckArr은 초기화 시켜주고
        		strCheckArr.clear();
        		// strCheckArr에 다시 <를 넣어준다
        		strCheckArr.add("<");
        		
        	}
        }
        
        // 만약 반복문이 끝났는데 남아있는 배열이 있다면
        if (strCheckArr.size() > 0) {
        	// 배열이 < > 로 둘러쌓여있는지 확인하고 그렇다면 그대로 출력
        	if (strCheckArr.get(0).equals("<") && strCheckArr.get(strCheckArr.size()-1).equals(">")) {
        		// 해당 글자만큼은 문자로 결합하여 answerArr에 담아주고
        		answerArr.add(String.join("", strCheckArr));
        		// strCheckArr은 초기화 시켜준다
        		strCheckArr.clear();
        		// 그렇지 않은 경우라면
        	} else {
        		// 배열을 역순으로 반전시킨다
        		Collections.reverse(strCheckArr);
        		// 작업이 완료되었다면, 해당 글자만큼은 문자로 결합하여 answerArr에 담아주고
        		answerArr.add(String.join("", strCheckArr));
        		// strCheckArr은 초기화 시켜주고
        		strCheckArr.clear();
        	}
        }
        
//        System.out.printf("strCheckArr : %s\n", strCheckArr);
//        System.out.printf("answerArr : %s\n", answerArr);
        
        // answerArr 배열을 출력한다.
        System.out.println(String.join("", answerArr));
    }
}