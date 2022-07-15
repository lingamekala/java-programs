import java.util.Scanner;
class ads
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      char n;
      System.out.println("enter character:");
      n=sc.next().charAt(0);
      if(n>65&&n<90||n>97&&n<122)
      {
        System.out.println("entered charecter alphabet:");
        
      }
      else if(n>48&&n<=57)
      {
        System.out.println("entered character is digits");
        
      }
      else
      {
      System.out.println("entered character is special charecter:");
      }
    
    
    
    }
  }