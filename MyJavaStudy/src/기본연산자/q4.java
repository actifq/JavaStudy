package 기본연산자;

// 두 개의 실수들을 입력 받아 그 실수들의 합,차, 곱을 계산하여 출력하는 프로그램 작성

import java.util.*;

class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		double s1,s2;
		
		
		System.out.println("두개의 실수를 입력해주세요:");
		s1=sc.nextDouble();
		s2=sc.nextDouble();
		
		double sum=s1+s2;
		double cha=s1-s2;
		double gop=s1*s2;
		
		System.out.println("실수1:"+s1);
		System.out.println("실수2:"+s2);
		
		System.out.println("합:"+sum);
		System.out.println("차:"+cha);
		System.out.println("곱:"+gop);
		
		
	}

}
