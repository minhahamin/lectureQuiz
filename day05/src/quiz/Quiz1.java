package quiz;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	//while 을 활용하여 다음 문제를 풀어보세요
	// 일정 패턴에 따라 반복문 실행(연속성, 일정성이 있어야 됨)
	
	//1) hello, world 를 3번만 출력하세요

	int a = 0;				//반복횟수를 체크하기 위한 변수
	while (a<3) {		// 0부터 시작하여 3보다 작을 때까지(3번 반복)
		System.out.print("hello world \n"); //먼저 출력하고
		a++; //증가는 나중에 함
	} System.out.println();
	
	
	
	//2) 1~20까지 한줄에 띄어쓰기로 구분하세요
	int b = 1;
	while (b<21) {
		System.out.print(b+" ");
		b+=1;
	} System.out.println();

	//3) A부터 Z까지 한줄에 콤마로 구분하여 출력하세요(단, 마지막에는 콤마가 없어야 됨)
	char al='A';  //65				    A부터 시작해서
	while (al<='Z') {    //90		Z가 될 때까지 반복하면서
		System.out.print(al);		// 글자를 출력하고 
		if(al == 'Z')						//만약 글자가 Z이면 (마지막이면)
			System.out.println();	//줄을 바꾼다
		else 									//마지막 글자가 아니면
			System.out.print(",");	// 콤마를 찍고 줄을 바꾸지 않음
		al++;		//출력이 끝나면 다음 글자를 준비하기 위해 값을 1증가 시킴
	} 

	
	//4) 1~100 사이의 정수 중 홀수 합과 짝수 합을 각각 계산하여 출력
	int num=1;
	int even = 0, odd = 0;
	//int sum;

	while (num <=100) {
	
		if(num%2==0) {
			even+=num;
			
			
		}
		else  {
			odd+=num;
		
			
		}
		num++;
		
	}
	
	System.out.printf("홀수 합 : %d , 짝수 합 : %d",even,odd);
	
	System.out.println();
	
	
	
	
	//5) 입력받은 정수를 거꾸로 출력하세요 (입력 : 1234 출력:4321)
	int c;
	int result = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("입력: " );
	c= Integer.parseInt(sc.nextLine());
	//										c				result
//	result += c %10;			//1234			0
//	c /= 10; 						//1234			4
//	result *= 10; 				//123			4
//	
//	result += c %10;			//123			40
//	c /=10;							//12				43
//	result *= 10;				//12				43
//	
//	result += c % 10;		//12				430
//	c /= 10;						//12			432
//	result *= 10;				//1				432
//	
//	result += c % 10 ; 		// 1 				4320
//	c/=10;							//1				4321		
//	result *= 10;				//0				4321
	
	
//	while (c !=0 ) {
//		System.out.print(c%10);
//		c /=10;
//	} System.out.println();
	
	
	
	while(c !=0 ) {
		result *= 10;
		result += c % 10 ; 		
		c/=10;									
		
	} System.out.println(result);
	
	

	sc.close();
	
}
}
