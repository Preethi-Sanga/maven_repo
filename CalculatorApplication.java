import java.util.*;
import java.util.Scanner;
public class CalculatorApplication{
 
     public static void main(String []args){
         int v1,v2,ch;
         float result=0;
         Scanner sc=new Scanner(System.in); 
         System.out.print("Enter first value: ");
         v1=sc.nextInt();
         System.out.print("Enter second value: ");
         v2=sc.nextInt();
          
         System.out.print("\n1: Addition of v1 & v2.\n2: Subtraction of v1 & v2.");
         System.out.print("\n3: Multiplication of v1 & v2.\n4: Division of v1 & v2.");
         System.out.print("\n5: Remainder of v1 & v2.\n6: Exit.");
          
         System.out.print("\nEnter your choice: ");
         ch=sc.nextInt();
          
         switch(ch)
         {
             case 1:
                 result=(v1+v2); break;
             case 2:
                 result=(v1-v2); break;
             case 3:
                 result=(v1*v2); break;
             case 4:
                 result=(float)((float)v1/(float)v2); break;
             case 5:
                 result=(v1%v2); break;
             default:
                 System.out.println("An Invalid Choice Please enter correct values!!!\n");
         }
         if(ch>=1 && ch<=5)
            System.out.println("Result is: " + result);
          
     }
}
