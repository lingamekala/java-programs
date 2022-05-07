import java.util.Scanner;
 class Student
   {
     public static void main(String args[])
     {
       Scanner s=new Scanner(System.in);
       int n,m,p,c,t,a;
       String na;
       System.out.println("number");
       n=s.nextInt();
       
       System.out.println("name");
       na=s.next();
       System.out.println("m");
       m=s.nextInt();
       System.out.println("p");
       p=s.nextInt();
       System.out.println("c");
       c=s.nextInt();
       
       t=m+p+c;
       a=(m+p+c)/3;
       System.out.println("total:"+t);
       System.out.println("average:"+a);
       }
   }
          
           
       
     