import java.util.Scanner;
class maxi
  {
    public static void main(String args [])
    {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      System.out.println("enter values a,b,c:");
      a= sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b&&b>c)
        System.out.println("a is big value:"+a);
      if(b>a&&b>c)
        System.out.println("b is big:"+b);
      if(c>a&&c>b)
        System.out.println("c is big :"+c);
    }
    
  }