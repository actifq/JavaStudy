package �⺻������;

import java.util.Scanner;;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math,sum;
		double avg;
		System.out.println("����,����,���� ������ �Է����ּ���");

		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);

		sum = kor + eng + math;
		avg = sum / 3;
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + avg);

	}

}
