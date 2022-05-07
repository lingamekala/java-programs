import java.util.Scanner;
class Tri
{
   public static void main(String args[])
{ 
      Scanner sc=new Scanner(System.in);
     int l,b,area,cr;
    System.out.println("enter the length of rec:");
      l=sc.nextInt();
     System.out.println("enter the bredth of rec:");
 b=sc.nextInt();
        area= l*b;
       cr= 2*(l+b);
      System.out.println("the area of rectagle:"+area);
     System.out.println("the circemfrence of rectagle:"+cr);
     }
}
     
