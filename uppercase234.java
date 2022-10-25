 import java.util.Scanner;
class uppercase234
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner (System.in);
      int n,fact=1;
      System.out.println("enter n value");
      n= sc.nextInt();
      for(int i=1;i<=n;i++)
        {
         fact=fact*i;
          {
        
            System.out.println("factors="+fact);
          }
        }
    }
  }
  