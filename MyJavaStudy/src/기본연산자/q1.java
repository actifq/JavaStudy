package �⺻������;

// �Է¹��� ���� 10,000����, 5,000����, 1,000����, 500����, 100����, 50����, 10���� ������ ȯ���Ͽ� ������ ������ ����ϴ� ���α׷� 

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("�� �Է�:");
		int won=sc.nextInt();
		
		System.out.println("10,000����"+"->"+(won%10000));
		System.out.println("10,000����"+"->"+((won%10000))%5000);
		
		
		
		
		
		/*System.out.println("5,000����"+"->"+won/5000);
		System.out.println("1,000����"+"->"+won/1000);
		System.out.println("500����"+"->"+won/500);
		System.out.println("100����"+"->"+won/100);
		System.out.println("50����"+"->"+won/50);
		System.out.println("10����"+"->"+won/10);
		*/
		
		
		
		
		
		
	}

}
