import java.util.*;
class Arry
  {
    public static void main(String args[])
    {
      double [] num={10,20,30,40,50};
      double [] denum={2,0,6,5,4};
      for(int i=0;i<num.length;i++)
        {
          try{
            System.out.println(num[i]/denum[i]);
          }
          catch(ArithmeticException ex){
            System.out.println("linga");
          }
        
        }
          
        }
    }
  