package ���;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�ð�[0~23]:");
		int a=sc.nextInt();
		
		if (a>=0 && a<=12){
			System.out.println("����"+a+"��");
		}
		if (a>=13 && a<=24){
			System.out.println("����"+(a-12)+"��");
		}
		
		
		//1 2 3 4 5 6 7 8 9 10 11 12 
		//13 14 15 16 17 18 19 20 21 22 23 24
		
	}

}
