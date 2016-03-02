package 기본연산자;

// 입력받은 값을 10,000원권, 5,000원권, 1,000원권, 500원권, 100원권, 50원권, 10원권 단위로 환산하여 각각의 개수를 출력하는 프로그램 

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("값 입력:");
		int won=sc.nextInt();
		
		System.out.println("10,000원권"+"->"+(won%10000));
		System.out.println("10,000원권"+"->"+((won%10000))%5000);
		
		
		
		
		
		/*System.out.println("5,000원권"+"->"+won/5000);
		System.out.println("1,000원권"+"->"+won/1000);
		System.out.println("500원권"+"->"+won/500);
		System.out.println("100원권"+"->"+won/100);
		System.out.println("50원권"+"->"+won/50);
		System.out.println("10원권"+"->"+won/10);
		*/
		
		
		
		
		
		
	}

}
