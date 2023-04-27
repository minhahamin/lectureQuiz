package quiz;

import java.util.Scanner;

public class Quiz3 {
public static void main(String[] args) {
   String id = "itbank";
   String pw = "it";
   
   Scanner sc = new Scanner(System.in);
   String userid, userpw;
   
   String name = "로그인성공";
   String name1 = "아이디 불일치";
   String name2= "패스워드 불일치";
   
   //userid 와 userpw에 문자열을 입력 받아서
   //1)아이디 불일치      2) 아이디는 일치하지만, 패스워드 불일치       3) 아이디와 패스워드 모두 일치하면 로그인 성공
   
   //3개 결과를 화면에 출력
   
   System.out.println("아이디 : " );
   userid= sc.nextLine();
   System.out.println("비밀번호 : " );
   userpw=sc.nextLine();
   
   
   //값이랑 비교 (값이랑 비교할 때 쓰는 건데 문자로 쓰니까 안되지 ;;
   /*if (id==userid && pw == userpw) 
         System.out.println("login");
   else if(id!=userid && pw==userpw )
      System.out.println("로그인 불일치");
   else if(id == userid && pw != userpw)
      System.out.println("패스워드 불일치");
*/
   
   
   //문자열이랑 비교
   if(userid.equals(id)) {
      if(userpw.equals(pw)) { // .앞에 있는 값이 null 이면 예외오류가 생김
         System.out.println("로그인성공");
      }
      else {
         System.out.println("로그인 실패(비번 불일치)");
      }
      
   }
   else {
      System.out.println("로그인실패(아이디 불일치)");
   }
   
   
   
   sc.close();

      
}
}