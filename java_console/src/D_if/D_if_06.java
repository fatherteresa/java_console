package D_if;

import java.util.Random;

public class D_if_06 {
	public static void main(String[] args) {

		/*
		  	if ���� �ɼ� 2����  (1) else (2) else if 
			
			# ������ 2�����ΰ�� else �� �̿��ؼ� 2��° ������ �����Ҽ��ִ�. 
			
		 */
		
		// ��) Ȧ¦���.
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}

		System.out.println("-------------------------");

		if (num % 2 == 0) {
			System.out.println("¦��");
		} else { // if�� ������ �ƴϸ� �����ǽ����Ѵ�. 
			System.out.println("Ȧ��");
		}

	}
}
