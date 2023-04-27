package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
public static void main(String[] args) {
   Random ran = new Random();
   Scanner sc = new Scanner(System.in);
   
   int cnt = 0;
   int answer = ran.nextInt(100)+1;
   int user;
   int min=1, max=100;
   
   
   while (true) {
      System.out.printf("업 & 다운(%d ~ %d) : ",min, max);
      user = Integer.parseInt(sc.nextLine());
      
      //user = (min +max ) / 2; 이진탐색
      //System.out.println ("컴퓨터가 계산한 값 : " + user);
      
      cnt +=1;
      
      if(user > answer) {
         
         System.out.printf("다운 \n", answer);
         
         max = user-1;
         //System.out.printf(" (%d ~ %d)", );
      
      }
      else if(user < answer )
      {
         System.out.printf("업 \n ", answer);
         min = user + 1;
         
      }
      else {
         
         break;
         
   }
   } System.out.printf("정답은 %d 입니다 !! %d 회 만에 정답을 맞췄습니다\n",answer,cnt);
   sc.close();
   
}}