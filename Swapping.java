/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

 class Swapping
   {
     public static void main(String args[])
     {
       Scanner sc= new Scanner (System.in);
       int a,b;
       System.out.println("a is first number:");
       a=sc.nextInt();
     System.out.println("b is second number:");
       b=sc.nextInt();
       System.out.println("before swaping:"+a);
       System.out.println("before swaping:"+b);
       a=b;
       b=a;
       System.out.println("after swaping:"+a);
       System.out.println("after swaping:"+b);
     }
         
       
     }

 