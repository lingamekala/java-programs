import java.util.Scanner;
class sum
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int r,product=1,n;
      System.out.println("enter number:");
      n=sc.nextInt();
      while(n>0)
        {
          r=n%10;
          product=product*r;
          n=n/10;
        }
      System.out.println("the product of digits:"+product);
        
      
    }
  }