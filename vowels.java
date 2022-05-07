import java.util.Scanner;
class vowels
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char ch;
      System.out.println("character");
      ch=s.next().charAt(0);
      if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
      {
        System.out.println("its vowel");
        }
    else
      {
        System.out.println("its concents");
        }
      }
  }