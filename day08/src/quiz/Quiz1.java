package quiz;

public class Quiz1 {
	public static void main(String[] args) {
		// 기존에 예제로 활용되었던 코드들을 함수화해보자
		// 내가 알고 있는 내용을 함수로 만들기
		
		// sample) 정수를 거꾸로 뒤집는 코드
		// 정수 하나를 전달받아서, 정수를 뒤집은 값을 반환하는 함수
		int t1 = reverseNumber(1234);
		System.out.println(t1);
		
		// 1) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수
		int t2 = getMaxNum(2, 3, -5);
		System.out.println("t2 : " + t2);
		
		// 2) 놀이기구 이용시간에 따른 요금을 반환하는 함수 (3000, 3500, 4000 ...)
		int t3 = getFee(49);
		int t4 = getFee(50);
		int t5 = getFee(51);
		
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		System.out.println("t5 : " + t5);
		
		// 3) 지하철 구간 당 3분, 구간 수를 전달받아서 걸린 시간을 반환하는 함수
		// 단, 60분을 초과하면 시간과 분을 각각 출력한다 (문자열 반환)
		String t6 = getSubwayTime(15);	// 45분
		String t7 = getSubwayTime(25);	// 1시간 15분
		System.out.println(t6);
		System.out.println(t7);
	}
	
	static String getSubwayTime(int station) {
		String str = null;
		int time = station * 3;
		if(time > 60) {
			str = String.format("%d시간 %d분", time / 60, time % 60);
		}
		else {
			str = time + "분";
		}
		return str;
	}
	
	static int getFee(int time) {
		int fee = 3000;
		if(time > 30) {
			fee += 500 * ((time - 21) / 10);
		}
		return fee;
	}
	
	static int getMaxNum(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		return max;
	}
	

	// 매개변수도 넓은 범주에서 보면 지역변수이다
	static int reverseNumber(int num) {
		int ret = 0;
		while(num != 0) {
			ret *= 10;
			ret += num % 10;
			num /= 10;
		}
		return ret;
	}
	
	
	
}
