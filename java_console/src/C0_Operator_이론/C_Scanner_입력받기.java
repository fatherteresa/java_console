package C0_Operator_이론;

import java.util.Scanner;

/*
 * # 입력받기
 * 1. import java.util.Scanner;  // main 위에 적어준다.(필수)
 * 	
 * 2. Sanner scan = new Scanner(System.in); // main안에 적어야한다.(필수)
 *
 * 3. 안내문 작성
 *    System.out.print("나이를 입력하세요 : "); 
 *    
 * 4. 입력받기
 *    int age = scan.nextInt(); //콘솔창에 숫자를 누르고 엔터를 누를때까지 대기한다.
 *    
 * 5. 결과출력 
 * 	  System.out.println("당신의 나이는 " + age + "세 이군요!");
 */

public class C_Scanner_입력받기 {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
				
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		
	}
}
