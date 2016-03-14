package 제어문;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("알파벳:");
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		
		  System.out.println(a.toUpperCase()); // 모두 대문자로
          System.out.println(str2.toLowerCase());  // 모두 소문자로

				
		
	}

}


/*
import java.util.Scanner;

public class notEnglish {
	public static void main(String[] args) {

		System.out.println("알파벳 하나를 입력하세요");
		Scanner input = new Scanner(System.in);


		char ch = input.next().charAt(0); // 맨 앞글자반환해주는 함수

		System.out.println(ch);

		if (ch >= 'A' && ch <= 'Z') { // 대문자일 때
			System.out.println((char) (ch + ('a' - 'A')));
		} else if (ch >= 'a' && ch <= 'z') { // 소문자일 때
			System.out.println((char) (ch - ('a' - 'A')));
		} else {
			System.out.println("잘못입력하였습니다.");
		}
	}
}
*/