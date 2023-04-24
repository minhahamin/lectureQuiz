package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		/* 두 정수를 입력받아서 합계를 구하고
		 * a+b =c 의 형식으로 정답을 포함한 수식을 화면에 출력해 주세요*/
		
		
		//1) 코드를 진행하기 위해 필요한 변수가 무엇이고, 몇개인지 파악
		
		int a, b;
		int c;
		//Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		/*2) 고정값은 변수에 초기값으로 넣음 (상수)
			 입력값을 받아서 변수에 저장함
	    */	
		System.out.printf("a 값 입력 :");
		a = Integer.parseInt(num.nextLine());
		
		System.out.printf("b 값 입력 :");
		b = Integer.parseInt(num.nextLine());
		
		//3) 연산이 필요한 값은 입력이후 처리함
		c=a+b;
		
		//필요한 값을 출력함(추가로 서식을 지정해도 됨)
		System.out.println( a + "+" + b + "=" + c);	//System.out.printf("%d + %d = %d \n", a,b,c);
		
		//코드가 종료되기 전 마무리 작업을 수행함
		num.close();
		
		
		}
	
}
