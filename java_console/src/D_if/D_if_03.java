package D_if;

import java.util.Scanner;

public class D_if_03 {
	public static void main(String[] args) {

		//������ �����ֱ�(Scope)
		
		/*
		 *  ������ �������� {}�߰�ȣ �ȿ��� �ۿ� �����Ѵ�. } ���� �߰�ȣ�� ������ �Ҹ��Ѵ�.
		 */
		
		int x = 10;		
		if(true) {			
			int y = 20;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
		}//y �� �Ҹ��ϴ� �ñ� 
		
		System.out.println("x = " + x); // x�� ��밡�������� y�� ����Ҽ�����.
	//	System.out.println("y = " + y); 
		
	}// x�� �Ҹ��ϴ� �ñ�
}