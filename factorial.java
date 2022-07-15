import java.util.Scanner;
class factorial
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner (System.in);
      int n,f=1,i,t;
      System.out.println("enter number:");
      n=sc.nextInt();
    
      for(i=1;i<=n;i++)
        {
          f=f*i;
          f=f;
      
        }
      {
          System.out.println("factorial of:"+f);
          
        }
      
      
    }
  }