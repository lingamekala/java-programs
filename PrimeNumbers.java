/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
class PrimeNumbers
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      int n,l,u,c=0,i;
      System.out.println("lower num ,upper num:");
      l=s.nextInt();
      u=s.nextInt();
      
      for(n=l;n<=u;n++)
        {
          c=0;
          for(i=1;i<=u;i++)
            {
            if(n%i==0)
              c++;
              }
          if(c==2)
          
            System.out.println("prime numbers"+n);
            }
      }
  }

//Good Job!
  
            
            
      
          
        
