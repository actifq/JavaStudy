package 연산자;

// 한글자를 입력받아 출력함수로 출력

import java.util.Scanner;

public class q2 {
	
	public static void q2(){
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("한글자를 입력해주세요");
		a=sc.nextInt();
		
		System.out.println(a);
	}
	
	public static void main(String args[]){
		q2();
	}
}