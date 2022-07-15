/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
class DisplayDay
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner (System.in);
      int n;
      System.out.println("enter n value:");
        n=s.nextInt();
      switch(n)
        {
          case 1:
            System.out.println("sun day");
            break;
          case 2:
            System.out.println("mon day");
            break;
          case 3:
            System.out.println("tuese day");
            break;
          case 4:
            System.out.println("wedness day");
            break;
          case 5:
            System.out.println(" thursday");
            break;
          case 6:
            System.out.println("fri day");
            break;
          case 7:
            System.out.println("saturday");
            break;
            default :
            System.out.println("wrong choice");
            break;
        }
      }
  }
          //Good Job!
            

 
