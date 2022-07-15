/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/



public class IntToString 
{ 
  public static void main(String args[]) 
  { 
    int number = 54321; 
    String str = String.valueOf(number);
    System.out.println("With valueOf method: string5 = " + str);
    System.out.println("3rd position of charactervalue:"+str.charAt(2));
    
  } 
}