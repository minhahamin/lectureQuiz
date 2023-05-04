package quiz;

import java.util.Scanner;

class student2{
	// 학생의 이름과
	String name;
	//국어, 영어, 수학 성적
	int kor;
	int eng;
	int math;
	//합계점수와 평균점수를 저장하기 위한 필드를 작성함
	int sum;
	double avg ;
	
	//이름과 합계, 평균을 출력하는 메서드를 작성함
	void show() {
		System.out.printf("%s : 합계 %d 점, 평균 %.2f 점\n", name, sum, avg );
	}
	//학생 객체를 생성하기 위한 생성자를 작성함
	student2(String name, int kor, int eng, int math){
		// 멤버 필드와 지역변수의 이름이 겹칠 때 
		//그냥 쓰면 지역변수 (가까운 것부터 참조하기 때문)
		//this. 을 붙이면 멤버 필드(this 는 객체 자신을 가리키기 때문)
		this.name = name;			
		this.kor=kor;		
		this.eng=eng;
		this.math=math;
		sum = kor +eng +math;				//멤버필드임을 강조하고 싶다면, this를 붙여도 됨
		avg = sum / 3.0;
	}
	//단, 학생 객체는 이름과 세과목의 점수를 반드시 입력해야만 생성할 수 있으며
	
	//합계와 평균은 전달받지 않고, 생성자에서 계산하여 필드의 값을 채워야 됨
	
	
	
}

public class Quiz1 {

	public static void main(String[] args) {
		//서로 다른 두 학생 객체를 만들어서 성적을 출력
		
		
		
		
		
		
		
		student2 st1 = new student2("이지은", 100, 97, 87);
		student2 st2 = new student2("홍진호", 22,22,22);
		st1.show();
		st2.show();

	}

}
