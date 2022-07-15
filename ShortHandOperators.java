/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first value: 
    10
    Enter second value: 
    20
    
    Expected Output:
    a*=b is: 200
    a-=b is: 180
    a/=b is: 9
    a%=b is: 9
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
 class ShortHandOperators 
 {
   public static void main (String args[])
   {
     Scanner sc = new Scanner (System.in);
     int a,b;
     System.out.println("enter a, b values:");
     a= sc.nextInt();
     b=sc.nextInt();
    a*=b;
     {
    
       System.out.println("print a*=b:"+a);
     }
     a-=b;
     {
       System.out.println("print a-=b:"+a);
       
     }
     a/=b;
     {
       System.out.println("a/=b:"+a);
       
     }
     a%=b;
     {
     System.out.println("a%=b:"+a);
     
   }

   }
 }
   

 