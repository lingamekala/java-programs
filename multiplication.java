import java.util.Scanner;
class multiplication
  {
    public static void main(String args[])
    
    {
      Scanner sc= new Scanner(System.in);
      int n;
      System.out.println("enter number:");
      n=sc.nextInt();
      for(int i=1;i<=50;i++)
        {
          System.out.println(""+n*i);
        }
    }
  }