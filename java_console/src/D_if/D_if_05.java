package D_if;

import java.util.Random;

public class D_if_05 {
	public static void main(String[] args) {

		
		// if�� �߰�ȣ ����
		
		// if ���� ��� ������ �����ϰ�� {} �� �����Ҽ��ִ�. 
		// �����̻��ϰ�� �����ϸ� �̻��� ����� �ʷ��Ѵ�.
		
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}
		System.out.println("-------------------------");
		
		if (num % 2 == 0)
			System.out.println("¦��");
		if (num % 2 == 1)
			System.out.println("Ȧ��");

	}
}