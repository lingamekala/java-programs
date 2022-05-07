import java.util.Scanner;
class voter
  {
    public static void main(String args[])
    {
      Scanner s =new Scanner(System.in);
      int a;
      System.out.println("enter value a");
      a=s.nextInt();
      if(a>18)
      {
        System.out.println("eligible voter");
        }
      else
      {
        System.out.println("not eligible voter");
        }
      }
  }
          