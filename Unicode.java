//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

//import statements for java program to read inputs using Scanner class 
 import java.util.Scanner;

 class Unicode 
   {
     public static void main(String args[])
     {
       System.out.println("character=");
       Scanner scanner=new Scanner(System.in);
       char character=scanner.next().charAt(0);
       int asciivalue=character;
       System.out.println("ASCII value of "+character+"is:"
                          +asciivalue);
       }
   }