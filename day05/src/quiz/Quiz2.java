package quiz;

public class Quiz2 {
public static void main(String[] args) {
	//첫날에 10원으로 시작하여, 하루가 지날 때 마다 2배씩 입금 금액을 늘려나감
	//이런 식으로 30일동안 입금했을 때 은행에 누적된 총 금액이 얼마인지 계산하여 출력
	//10,20,40,80,160, ...
	
	
	//변수 준비 : 입금금액, 날짜, 계좌잔고
	long coin =10;
	int day = 1;
	long sum=0;
	System.out.println(coin+" ");
	
	//날짜가 30일 될 때까지
	while(day<31) {
		sum += coin; //계좌에 준비한 돈 입금
		coin*=2; //다음날을 위해서 2배의 돈을 입금함
		day++; //날짜 넘어감
		System.out.printf("%,d\n",coin);
		
	}
	
	System.out.printf("총 금액 : %,d", sum);
	System.out.println();
	
}
}