/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class HighestNumber
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner (System.in);
      int a,b,c;
      System.out.println("enter a,b,c values:");
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      if(a>b&&b>c)
        System.out.println("a is highest");
      else if(b>a&&b>c)
        System.out.println("b is highest");
      else if(c>a&&c>b)
        System.out.println("c is highest value");
      }
  }
//Good Job!
