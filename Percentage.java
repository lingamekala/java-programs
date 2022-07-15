//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
 import java.util.Scanner;

class Percentage
  
  {
       public static void main(String args[])
    {
      
    Float totalmarks,maximummarks,percentage,marks;
      Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the maximum marks=");
      totalmarks=scanner.nextFloat();
      
      System.out.println("Enter the total marks=");
      maximummarks=scanner.nextFloat();
      
      
      percentage=(maximummarks)*100/(totalmarks);
      System.out.println("percentage :"+percentage);
      }
  }

