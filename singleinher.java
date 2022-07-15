import java.util.Scanner;
class addition
  {
    int a,b;
    
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("values a,b:");
      a=sc.nextInt();
      b=sc.nextInt();
    }
    void add()
    {
      int c;
      c=a+b;
      System.out.println("the addition value:"+c);
    }
    }
class subtract extends addition 
  {
  void sub()
    {
    int d;
    d=a-b;
    System.out.println("the subtraction value is :"+d);
    
    }
  }
  class singleinher
    {
      public static void main (String args [])
      {
        subtract s=new subtract();
        s.add();
        s.sub();
      }
    }
      
    
  
  