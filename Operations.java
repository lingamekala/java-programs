/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
 

 class Operations {

  public static void main (String args[])
   {
     int a=30,b=10; 
    a-=b;
     {
    
       System.out.println("print a-=b:"+a);
     }
     int c=45,d=2;
     c+=d;
     {
       System.out.println("print a+=d:"+c);
       
     }
     int e=600,f=10;
     e/=f;
     
     {
       System.out.println("e/=f:"+e);
       
     }
     int g=15;
     g--;
     {
     System.out.println("g--:"+g);
     
   }
     int h=14,i=5;
     h%=i;
     {
       System.out.println("remainder:"+h);
     }

   }
 }
   

  