import java.util.Scanner;
class reverseword123
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String st;
      System.out.println("enter string:");
      st=sc.nextLine();
      String []words= st.split("");
      String revrse="";
      for(int i=0;i<words.length;i++)
        {
          String word= words[i];
          String revrseword="";
          for(int j=word.length()-1;j>=0;j--)
            {
              revrseword=revrseword+word.charAt(j);
            }
          revrse=revrse+revrseword+" ";
        }
      System.out.println("words revrse:"+revrse);
    }
  }
