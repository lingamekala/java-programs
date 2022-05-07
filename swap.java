import java.util.Scanner;
class swap
{
  public static void main(String args[])
    {
      Scanner s=new Scanner (System.in);
      int a,b;
      System.out.println("value a is");
      a=s.nextInt();
      System.out.println("value b is");
      b=s.nextInt();
      a= (a+b);
      b= (a-b);
      a= (a-b);
      System.out.println("value a:"+a);
      System.out.println("value b:"+b);
       
      }
}
      
    