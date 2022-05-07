import java.util.Scanner;
class Weekday
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int i;
      System.out.println("i value is");
      i=s.nextInt();
      if(i==1)
      {
      System.out.println("sunday");
        }
          if(i==2)
          {
            System.out.println("monday");
            }
      if(i==3)
      {
        System.out.println("thuseday");
        }
      if(i==4)
      {
        System.out.println("wednessday");
        }
      if(i==5)
      {
        System.out.println("thursday");
        }
      if(i==6)
      {
        System.out.println("friday");
        }
      if(i==7)
      {
        System.out.println("saturday");
        }
      
        
      else
      {
          System.out.println("wrong chioce");
        }
      }
  }