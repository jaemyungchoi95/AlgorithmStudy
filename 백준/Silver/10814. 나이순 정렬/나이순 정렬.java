import java.io.*;
import java.util.*;

public class Main {
	static class Person {
		int age;
		String name;
		int order;
		
		public Person(int age, String name, int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 회원 수 N
		Person[] people = new Person[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			people[i] = new Person(age, name, i);
		}
		
		Arrays.sort(people, (p1, p2) -> {
			if (p1.age != p2.age) {
				return p1.age - p2.age; // 나이 오름차순
			} else {
				return p1.order - p2.order; // 나이가 같으면 등록순
			}
		});
		
		for (Person p : people) {
			bw.write(p.age + " " + p.name + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	} // main
	
} // class
