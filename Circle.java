//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
 import java.util.Scanner;
class Circle
  {
  public static void main(String args[])
    {
      int r;
      float pi= 3.14f,c;
      Scanner s=new Scanner(System.in);
        
      System.out.println("radius");
      r=s.nextInt();
      System.out.println("pi");
      pi=s.nextFloat();
      c= 2*(pi)*r;
      System.out.println("area:"+c);
      
       }
   } 
      
      
