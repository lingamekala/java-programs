import java.util.Scanner;
 class leap
   {
     public static void main(String args[])
     {
       Scanner s=new Scanner(System.in);
       int year;
       System.out.println("enter year");
       year=s.nextInt();
       if(year%4==0)
       {
         System.out.println("leap year");
         }
       else
       {
         System.out.println("not leap year");
         }
       }
   }