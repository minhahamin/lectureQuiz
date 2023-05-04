package quiz;

import java.util.Scanner;

public class phonebook_main {

	
	private static final contact ob = null;
	//데이터를 저장할 배열은 어느 함수에서나 접근할 수 있도록 static 으로 작성
	static contact[] arr = new contact [5];		//바깥으로 빼냈기 때문에 굳이 매개변수로 지정할 필요 x
	
	//메인함수 : 프로그램을 시작하면 가장 먼저 실행
	public static void main(String[] args) {
			int sequence = 100;	//고유번호 부여에 사용할 변수 (항상 1씩 증가)
			Scanner sc = new Scanner(System.in);
			String name, pnum;
			int result, menu, idx;
		
			contact tmp ; 
			String form = "%d ) %s : %s \n";
			
			do {
				System.out.println("1. 전화번호 추가");
				System.out.println("2. 목록");
				System.out.println("3. 수정");
				System.out.println("4. 삭제");
				System.out.println("0. 프로그램 종료");
				menu = Integer.parseInt(sc.nextLine());
			
				switch(menu) {
				case 1:
								//추가
					System.out.println("이름 입력");
					name = sc.nextLine();
					
					System.out.println("전화번호 입력 ");
					pnum = sc.nextLine();
					
				
					tmp = new contact();
					tmp.idx =sequence ++;
					tmp.name= name;
					tmp.pnum= pnum;
					
					result = insert(tmp);
					System.out.println(result ==1 ? "추가 성공 ":"추가 실패");
					break;
				case 2:			//목록
					for(int i=0; i<arr.length; i++) {
						if(arr[i]!=null) {
							System.out.printf(form, arr[i].idx, arr[i].name, arr[i].pnum);
						}
					}
					break;
				case 3:			//수정(idx)
					
					System.out.println("수정 할 데이터 번호 입력 : ");
					idx =Integer.parseInt( sc.nextLine());
					System.out.println("이름 입력");
					name = sc.nextLine();
					
					System.out.println("전화번호 입력 ");
					pnum = sc.nextLine();
					
					tmp = new contact();
					tmp.idx = idx; // 고유번호는 유지 하려면 (신규생성이 아니므로 이쪽으로)
					//sequence ++;      //고유번호 바꾸려면
					tmp.name= name;
					tmp.pnum= pnum;
					
					
				
					
					result = update( idx, tmp);
					System.out.println(result ==1 ? "수정 완료":"수정 실패");
					break;
				
				case 4:
					
					System.out.println("삭제 할 데이터 번호 입력 : ");
					idx =Integer.parseInt( sc.nextLine());
				    result = delete (idx);
					System.out.println(result ==1 ? "삭제 완료":"삭제 실패");
					
					break;
				case 0:
					break;	
				default: System.out.println("메뉴를 확인하시고 다시 입력해주세요");
				
				}
			System.out.println("\n");
			
			}while (menu!=0);
			
			
			
	}
	//데이터 추가 함수
	static int insert(contact ob) {	//빈칸을 찾아서, ob를 저장함
		int row=0;
		for (int i =0; i<arr.length; i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				row = 1;
				break;
			
	}	


}
		return row;
}

	//특정 데이터 수정 함수
	static int update(int idx, contact ob) {		//idx 번 데이터를 찾아서 ob로 교체함
		int row=0;
		for(int i =0 ; i<arr.length; i++) {		//빈칸이 아니면서, idx가 일치하면
			if(arr[i]!=null&&arr[i].idx==idx) {
				arr[i]=ob;		//새로운 객체로 덮어씌우고
				row =1;		//결과값 준비
				break;			//반복 탈출
			}
		}
		
		return row;
	
	}
	//특정 데이터를 삭제 함수
	static int delete(int idx) {		//idx번 데이터를 찾아서 삭제함(빈칸으로 만듦)
		int row=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null && arr[i].idx==(idx))
			{
				arr[i]=null;
				row=1;
				break;
			}
		}
		return row;
	}
	}

