package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   Random ran = new Random();
   int ea = ran.nextInt(15)+1;
   int eb= ran.nextInt(15)+1;;
   int  ec= ran.nextInt(15)+1;;
   //int current;
   int min = 0;
   String name;
   
   
   System.out.printf("ea: %d, eb: %d, ec: %d \n", ea, eb, ec);
   
   
   // ea : 1 , eb : 8, ec :3
   //입력 : 7
   //출력 : eb 엘리베이터가 이동합니다
   //거리 최소값
   //거리 최소값이 몇번째와 같은지 찾음
   //최소값과 일치하는 순번의 엘리베이터 이름을 출력
   
   
   
   int a;
   System.out.println("엘리베이터 층 입력 : " );
   a= Integer.parseInt(sc.nextLine ());
   
   
   

   
 //거리구하기 (절대값)
   int distA= a-ea;
   int distB= a-eb;
   int distC= a-ec;
   

   

   //절대값
   if (distA<0) {
      distA *= -1;
      
      
         }
   else if(distB<0)
   {
      distB *= -1;
      
   
      
   } else if(distC<0) {
      distC *= -1;

      
   }

   //거리 최소값
   //최소값이 몇번째와 같은지 찾음
   min = distA;
   name = "ea";
   if(min > distB) {
      min = distB;
      name = "eb";
   }
   if (min > distC) {
      min = distC;
      name ="ec";
   }
   
   //최소값과 일치하는 순번의 엘리베이터 이름을 출력함
   System.out.printf("%s 엘리베이터가 이동합니다 ",name);
   sc.close();
}
}