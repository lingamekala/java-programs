import java.util.Scanner;
class factorial
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n,f=1;
      System.out.println("n value");
      n=s.nextInt();
      while(n>0)
        {
          f=f*n;
          n++;
          }
          
      System.out.println("factorial value:"+f);
          
      }
  }
      
      
      