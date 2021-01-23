package D_if_이론;

import java.util.Random;

public class D_if4_랜덤 {
	public static void main(String[] args) {

		/*
		 * # 랜덤
		 * 
		 *  1) import java.util.Random; 추가
		 *  2) Random ran = new Random(); 추가 
		 *  3) 이후 int r = ran.netInt(랜덤범위); ==> (0 ~ 랜덤범위-1)  중에서하나가 나온다. 
		 */
		
		
		Random ran = new Random();
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);

		// 문제 1) 1 ~ 5 사이의 랜덤
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// 문제 2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
		System.out.println(rNum);
		
	}
}
