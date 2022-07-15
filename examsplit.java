import java.util.Scanner;
class examsplit
  {
    public void splitword(String str)
    {
      String[] word = str .split(" ");
      int count=0;

      System.out.println("the words is the string are seperated by space: ");

      for(int i=0;i<word.length;i++)
        {
          System.out.println(word[i]);
          count++;
          
        }
    }


    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
    
      System.out.println("enter string:");
      String str=sc.nextLine();

      examsplit es = new examsplit();
      
      
      
    }
    
    
  }