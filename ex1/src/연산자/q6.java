package 연산자;

import java.util.*;

public class q6 {
	
	
	
	public static void q6(){
	
		Scanner sc=new Scanner(System.in);
		
		float f ;
		float s ;
		
		System.out.println("화씨 온도를 입력해 주세요");
		f=sc.nextFloat();
		
		System.out.println("입력된 화씨 온도는 :"+f);
		
		s=(float)(5.0/9.0*(f-32));

		System.out.println("화씨온도를 섭씨온도로 수정:"+s);
		
	}
	
	public static void main(String args[]){
		q6();
	}
}
