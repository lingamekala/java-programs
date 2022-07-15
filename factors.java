import java.util.Scanner;
class factors
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i;
      System.out.println("enter n value:");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
      System.out.println("factors of giveb number:"+i);
        }
        }
    }
  }