import java.util.Scanner;
class prime
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,count=0;
      System.out.println("enter n value:");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
        }
        }
           
      if(count==2)
      {
          
       System.out.println("prime number:"+n);
      }
            
            else
            {
            System.out.println("not prime number:"+n);
          }
        
    }
  }
  
  