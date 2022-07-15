import java.util.Scanner;
class a
  {
    public static void main (String args[])

    {
      Scanner sc= new Scanner (System.in);
      int n,s=0,d,t,i;
      System.out.println("enter n value:");
      n=sc.nextInt();
      t=n;
      for(i=n;i>0;i++)
        {
          d= n%10;
          s= s+(d*d*d*d);
          n= n/10;
        }
      if(t==s)
      {
        System.out.println("its armstrong number:"+s);
      }
      else
      {
        System.out.println("not armstrong number:");
      }
    }
  }