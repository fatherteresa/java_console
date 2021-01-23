package D1_if_Quiz;

import java.util.Scanner;

public class D1_if3_정답 {
	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("숫자 입력 : ");
		int me = scan.nextInt();
		
		if(me < com) { System.out.println("Up!"); }
		if(me > com) { System.out.println("Down!"); }
		if(me == com) { System.out.println("Bingo!"); }
		
	}
}
