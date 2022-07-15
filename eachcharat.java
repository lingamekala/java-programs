import java.util.Scanner;
class eachcharat
  {
    public static void main(String args [])
    {
      Scanner sc=new Scanner (System.in);

      System.out.println("enter String");
      String str= sc.next();
      System.out.println("enter string charat");
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          
          System.out.println(str.charAt(i));
          count++;
          
        }
      System.out.println(" "+count);
      
    }
  }