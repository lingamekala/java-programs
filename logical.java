import java.util.Scanner;
class logical
{
  public static void main(String args[])
    {
      Scanner s=new Scanner (System.in);
      
    int a,b,c;
      System.out.println("value a is");
      a=s.nextInt();
     System.out.println("value b is");
      b=s.nextInt();
    System.out.println("value c is");
      c=s.nextInt();
      if(a==b && b==c && c==a)
      {
        System.out.println("varibles are equal");
        }
      else
      {
        System.out.println("varibles are not equal");
        }
      }
  }
        
      
      
