/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/

 import java.util.Scanner;
class Person { 
//declare age 
private int age;
  public int getage()
  {
    return age;
  }
  public void setage(int age)
  {
    this.age=age;
  }
  
//create setters and getters
    
}  

class PersonEncapsulation { 

public static void main(String args[]) { 
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter age : ");
  int a=sc.nextInt();
  Person p=new Person();
  p.setage(a);
  System.out.println("Your age : "+p.getage());
}
}