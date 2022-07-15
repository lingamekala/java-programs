  import java.util.Scanner;
  class revers
    {
      public static void main(String args[])
      {
        Scanner sc= new Scanner(System.in);
        int  a,r,i,revers=0;
        System.out.println("print value");
        a=sc.nextInt();
        while(a!=0)
          {
            r=a%10;
            revers= revers*10+r;
            a=a/10;
          }
        System.out.println("the revers:"+revers);
          }
        
      }
    