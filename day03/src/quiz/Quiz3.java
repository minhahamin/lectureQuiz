package quiz;

import java.util.Scanner;

public class Quiz3 {
public static void main(String[] args) {
	//놀이기구 이용 시간에 따른 요금을 계산하려고 함
	//기본요금은 3000원이며, 10분마다 500원의 추가요금이 발생함
	//요금표는 다음과 같음
	// 0~30 : 3000
	//31~40 : 3500
	//41~50 : 4000
	//51~60 : 4500
	
	//반복문 사용 없이, if를 이용해 시간을 분 단위로 입력 받고 요금을 계산하여 출력
	
	

	//입력
	Scanner sc = new Scanner(System.in);
	int coin, time;
	
	
	String result;
	System.out.println("이용시간 (분) : " );
	time= Integer.parseInt(sc.nextLine ());
	
		
	
	//연산
	//time = (coin * perTime)+ 500;
	
	
	//38분이면 추가시간 (8/10 +1) * 500 = 500
	//40분이면 추가시간 (10/10 + 0) * 500 = 500
	//41분이면 추가시간 (11/10 +1) * 500 = 1000
	
	
	
	if(0<=time && time<=30) {
		coin=3000;
		
	}
	else {
		coin = 3000;
		if(time % 10==0) {
		coin += 500 * (((time-30)/10)+0);
		}
	else  {
		coin += 500 * (((time-30)/10)+1);
		
	}
		
	}
	 System.out.printf("요금 : %d 원입니다", coin);
	 sc.close();
	 
}
}