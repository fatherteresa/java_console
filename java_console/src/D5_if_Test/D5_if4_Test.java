package D5_if_Test;

import java.util.Scanner;

public class D5_if4_Test {
	public static void main(String[] args) {

		/*
		  	#문제 1) 마트에서 오이를 3개씩 묶어서 1500원에 판다고 한다
			# 오이가 14개 필요하다. 돈이 얼마필요한가(오이는 묶음으로만 판다)
			
			
			# 문제 2) 민수네 반 학생은 26명입니다
			# 민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
			# 도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다.
			# 총얼마가 필요한가요?
			
			
			#문제3) 가게에서 24600원 짜리 옷을샀습니다.
			# 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
		  
		  
		 */
		
		// 문제 1)
		int count = 14 / 3;
		if(14 % 3 != 0) count += 1;
		System.out.println(count);
		
		
	}
}
