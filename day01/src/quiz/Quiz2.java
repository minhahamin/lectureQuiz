package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/* 세 과목의 점수를 정수형태로 입력받고, 이름은 문자열로 입력
		 * 그 다음, 정수의 합계와 평균을 구함
		 * 이때, 평균은 실수 형태로 소수점 둘째자리까지 출력
		 * 
		 * 모든 준비가 끝나면 이름과 합계와 평균만 출력함
		 * 
		 * 추가 ) boolean 타입 변수를  선언하며, 평균이 60점 이상이 아닌지 판별하기
		 *      합격 여부 : true
		 * */
		
		//디버깅 시작 : f11
		//중단점 설정 : ctrl + shift + b
		//다음 코드 실행 : f5(step into), f6(step over)
		//제어문 (반복문) 에서 값의 변화를 추적하기 위해서 사용할 수 있음 -> python tutor (간단한 것만)
		
		
		//1) 변수선언
		int kor ,eng, math;
		double avg;
		int sum;
		boolean pass;
		
		String name;
		
		
		Scanner sc = new Scanner(System.in);
		
		//2) 입력
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());

		
		System.out.print("수학점수 입력 : ");
		math = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		
		//3) 합계, 평균 , 합격여부 구하기
		sum = kor + eng + math;
		avg = (kor+eng+math)/3;
		
		pass = avg >= 60;
		
		
		
		System.out.printf("%s 의 합계 : %d  ", name, sum);
		System.out.printf("%s 의 평균 : %.2f\n ", name, avg);
		System.out.printf("합격 여부 : "+ pass);
		
		
		//4) 마무리
		sc.close();
	}
	
}
