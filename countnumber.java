import java.util.Scanner;
class countnumber
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int r,n,count=0;
      System.out.println("enter number:");
      n=sc.nextInt();
      for(;n>0;)
        {
          r=n%10;
          n=n/10;
          count++;
        }
      System.out.println("the digits count in the numbers:"+count);
    }
  }
      