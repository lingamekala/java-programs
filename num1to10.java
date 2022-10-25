import java.util.Scanner;
class num1to10
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("enter n value:");
      n=sc.nextInt();
      //int c=0;
      for(int i=1;i<=n;i++)
      {
        if(n%i!=0)
      
        {
    //  if(c==2)
      
      System.out.println(""+i);
        
        }
      }
    }
  }
  