import java.util.Scanner;
class natural
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int i=1,n;
      System.out.println("n value:");
      n=s.nextInt();
      while(i<=n)
        {
        System.out.println("\t"+i);
           i++;
      }
  }
}