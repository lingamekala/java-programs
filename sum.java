import java.util.Scanner;
class sum
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int r,sum=0,n;
      System.out.println("enter number:");
      n=sc.nextInt();
      while(n>0)
        {
          r=n%10;
          sum=sum+r;
          n/=10;
        }
      System.out.println("the sum of digits:"+sum);
        
      
    }
  }