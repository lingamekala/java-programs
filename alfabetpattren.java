//import java.util.Scanner;
class alfabetpattren
  {
    public static void main(String args[])
    {
      for(int k=1;k<=2;k++)
        {
         char ch='A';
           
           for(int i=1;i<5;i++)
             {
               for(int j=1;j<3;j++)
                 {
                   System.out.print(ch+"");
                   
                 ch++;
               if(ch=='E'||ch=='I')
               {
                 System.out.println();
                 break;
               }
             }
           }
          ch++;
        }
    }
  }
  