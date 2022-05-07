import java.util.Scanner;
class leapyear
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a;
      System.out.println("the value is=");
      a=s.nextInt();
      if(a%4==0)
      {
        System.out.println("leapyear");
        }
      else
      {
        System.out.println("not leapyear");
        }
      }
  }
      
  