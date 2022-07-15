/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/


class Palindrome
  {
public static void main(String args[])
    {  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev)){  
        return true;  
    }
    else
    {  
        return false;  
    }  
}  
}  
  