package 기본연산자;

import java.util.Scanner;;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math,sum;
		double avg;
		System.out.println("국어,영어,수학 점수를 입력해주세요");

		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);

		sum = kor + eng + math;
		avg = sum / 3;
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);

	}

}
