import java.util.Scanner;
class reverselinga
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      String st;
      System.out.println("enter string");
      st=sc.nextLine();
      String rev="";
      for(int i=st.length()-1;i>=0;i--)
        {
          rev=rev+st.charAt(i);
        }
      System.out.println("reversstring ="+rev);
        
    }
  }