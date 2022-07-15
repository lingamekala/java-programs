 import java.util.Scanner;
class rangeprime
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int i,n,c=0,r;
      System.out.println("enter r value");
      r=s.nextInt();
      for(n=1;n<=r;n++)
        {
          c=0;
          for(i=1;i<=n;i++)
            {
              if(n%i==0)
                c++;
              }
        
          if(c==2)
          
            System.out.println("\t range of prime numbers:   "+n);
          }
      }
  }