package D_if;

import java.util.Random;

public class D_if_08 {
	public static void main(String[] args) {

		/*
		  	  if ���� �ɼ� 2����  (1) else (2) else if 
		  	  
		  	  if �� ������ ��Ȯ�� �ڵ带 ©��������
		  	  else if ����ϸ�   ���ǹ��� ������ �������ΰ�� ���� ȿ�������� �ڵ带 �ۼ��Ҽ��ִ�.
		  	  		  	 
		  	 ----------------------------------------------------------------	  	  
		 
		  	  if(���ǽ�1){
			 		���ǽ�1�� ��(true)�� ��, ������ ����;
			  }else if(���ǽ�2){
			  		���ǽ�2�� ��(true)�� ��, ������ ����;
			  }else if(���ǽ�3){
			  		���ǽ�3�� ��(true)�� ��, ������ ����;
			  }else{
			  		�� ������ ��� �������� ���� ��, ������ ����;
			  }
			 		
		 */
		
		//===========================================
		// if ���� else if 2�� �� ���� else ���� ���� �ϳ��ι��δ�. 
		// else�� ��������� �����̵Ǹ� �۵��Ѵ�. 
		
		System.out.println("1.��� 2.���� 3.��");
		int  select = 1;
		if(select == 1) 	 { System.out.println("���");}
		else if(select == 2) { System.out.println("����");}
		else if(select == 3) { System.out.println("��");}
		else {System.out.println("����2");}

	}
}
