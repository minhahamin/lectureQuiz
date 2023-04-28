package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
   // 1) 정수를 입력받아서 절대값 출력하기
   // 2) 두 정수를 입력받아서 작은 값 출력하기
   // 3) 세 정수를 입력받아서 가장 작은 값 출력하기
   // 4) 정수의 범위가 1에서 20사이에 포함되면 true 아니면 false
   
   
   
   //1)
   int a;
   Scanner sc = new Scanner(System.in);
   System.out.println("정수 입력 : " );
   a= Integer.parseInt(sc.nextLine ());

   if (a<0)
   {
      a= -a;  //단항부호 연산자
      
   
   } System.out.println(" a 의 절대값 : "+ a);

      
   
   
   //2)
   int num1, num2;
   int min;
   
   System.out.println("첫번째 정수 입력 : " );
   num1= Integer.parseInt(sc.nextLine ());
   
   
   System.out.println("두번째 정수 입력 : " );
   num2= Integer.parseInt(sc.nextLine ());
   
   if (num1<num2) {
      min = num1;
      System.out.printf("작은 값 : %d \n", min);
   }
   else if(num1>num2)
   {
      min = num2;
      System.out.printf("작은 값 : %d \n",min);
   }
   
   
   
   
   //3)
   int x, y, z;
   int min1 = 0;
   
   //한번에 입력받기
   //new ArrayList<String>(sc.NextLine().Split("   ")).stream().flatMap(str -> Integer.parseInt(str).toArray();
   
   
   
   System.out.println("첫번째 정수 입력 : " );
   x= Integer.parseInt(sc.nextLine ());
   System.out.println("두번째 정수 입력 : " );
   y= Integer.parseInt(sc.nextLine ());
   System.out.println("세번째 정수 입력 : " );
   z= Integer.parseInt(sc.nextLine ());
   
   
   if(x<y) {
      min1=x;
      
      
   } else if(y>z)
   {   min1=z;
      
   } else if(z>y)
   {   min1=y;
      
   } 
   System.out.printf("작은 값 %d", min1);
   System.out.println();
   
   
   
   //4
   int c;
   Scanner sc4 = new Scanner(System.in);
   System.out.println("범위 : " );
   c= Integer.parseInt(sc.nextLine ());
   
   /*if(1<=c && c<=20) {
      System.out.println("true");
   }
   else System.out.println("false");
   */
   
   
   boolean flag = 1<=c && c<=20;
   System.out.println(flag);
}
}