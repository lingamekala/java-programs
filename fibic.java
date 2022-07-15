 import java.util.Scanner;
class fibic
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum,o=1,f=0,n,i;
      System.out.println("enter n value:");
      n=sc.nextInt();
      for(i=1;i<n;i++)
        {
          sum=f+o;
          f=o;
          o=sum;
          System.out.println("value:"+sum);
        }
    }
  }