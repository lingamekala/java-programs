//import java.util.Scanner;
class name
  {
    String st="linga";
    String st2="gayatri";
    int idnum=321;
    int num=310;
     
    void inhe()
    {
    
    System.out.println("name:"+st2);
      System.out.println("name:"+st);
    }
    }
class number extends name
  {
  void pandi()
    {
    int idnum=321;
  num=310;
      System.out.println("number :"+num);
    System.out.println("number :"+idnum);
    
    }
  }
  class singleinher
    {
      public static void main (String args [])
      {
        number s=new number();
        s.inhe();
        s.pandi();
      }
    }
      
    
  
  