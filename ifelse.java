import java.util.Scanner;
class ifelse
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner s=new Scanner(System.in);
      System.out.println("the value a=");
        a=s.nextInt();
      System.out.println("the value b is=");
      b=s.nextInt();
        System.out.println("the value c is=");
      c=s.nextInt();
      
      if(a>b)
      {
        System.out.println("a is big");
          }
    else if(b>c)
      {
        System.out.println("b is big");
         }
      
   else if(c>a)
      {
        System.out.println("c is big");
         }
      
        
      }
    
  }
          