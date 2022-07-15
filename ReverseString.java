/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

class ReverseString 
{
  public static void main (String args[])
  {
    
  
  StringBuffer st= new StringBuffer ("Learning made is to bitlabs");
         System.out.println(st.reverse());

 
}
}