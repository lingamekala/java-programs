import java.util.Scanner;
  class Simple
    {
      public static void main(String args[])
      {
        Scanner s= new Scanner(System.in);
          int m,i,t,p;
        System.out.println("enter money ");
          m=s.nextInt();
        System.out.println("enter intrest ");
        i=s.nextInt();
        System.out.println("enter time ");
         t=s.nextInt();
        p=m*i*t/100;
        System.out.println("the prime cost:"+p);
        }
    }
            
