package D_if_�̷�;

import java.util.Random;

public class D_if6_���ǹ��ɼ�else {
	public static void main(String[] args) {

		/*
		  	if ���� �ɼ� 2����  (1) else (2) else if 
			
			# (1) ������ 2�����ΰ�� else �� �̿��ؼ� 2��° ������ �����Ҽ��ִ�. 
			
		 */
		
		// ��) Ȧ¦���.
		int num = 11;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}

		System.out.println("-------------------------");

		if (num % 2 == 0) {
			System.out.println("¦��");
		} 
		else { // if�� ������ �ƴϸ� �����ǽ����Ѵ�. 
			System.out.println("Ȧ��");
		}

	}
}
