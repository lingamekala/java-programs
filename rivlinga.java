import java.util.Scanner ;
class rivlinga
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
    int rem,n,t,i,rev=0;
      System.out.println("enter n value");
      n=sc.nextInt();
      for(i=0;i<=n;i++)
        {
          rem= n%10;
          rev=rev*10+rem;
          n= n/10;
        }
      System.out.println("revers given number:"+rev);
    }
  }