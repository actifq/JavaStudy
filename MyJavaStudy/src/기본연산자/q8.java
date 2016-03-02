package 기본연산자;

/* 
  세 개의 for문을 이용하여 아래와 같은 모양의 구구단을 출력

 2단 3단 4단 5단
 6단 7단 8단 9단

*/

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=3;i++){
			for(int j=2;j<=9;j++){
				for(int k=1;k<=9;k++){
					System.out.println(j+"*"+k+"="+j*k);
				}
			}
		}
	}

}
