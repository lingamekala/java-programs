import java.util.Scanner;
class wordrevlinga
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      String st;
      System.out.println("enter string:");
      st=sc.nextLine();
      String []words= st.split(" ");
      String reversestring="";
      for(int i=0;i<words.length;i++)
        {
          String word= words[i];
            String reverseword="";
          for(int j=word.length()-1;j>=0;j--)
            {
              reverseword=reverseword+word.charAt(j);
            }
          reversestring= reversestring+reverseword+"";
          
        }
      
      System.out.println(""+reversestring);
    }
  }