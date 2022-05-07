import java.util.Scanner;
class grade
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int stnu,m,p,c,t,a;
      String stna;
      System.out.println("stnu");
      stnu=s.nextInt();
      System.out.println("m");
      m=s.nextInt();
      
      System.out.println("p");
        p=s.nextInt();
      System.out.println("c");
      c=s.nextInt();
      System.out.println("stna");
      stna=s.next();
      t=(m+p+c);
      a=(m+p+c)/3;
      System.out.println("STUDENT DETAILS");
      System.out.println("stnu"+stnu);
      System.out.println("stnu"+stna);
      System.out.println("mathas"+m);
      System.out.println("physics"+p);
       System.out.println("chemistry"+c); 
      System.out.println("total marks:"+t);
      System.out.println("avg marks"+a);

      if(m>=35 && p>=35 && c>=35)
      {
        System.out.println("pass");
        }
        if(a<=50)
        {
          System.out.println("garde C");
          }
          else if(a>=51 && a<=70)
          {
            System.out.println("garde B");
            }
            else if(a>=71 && a<=80)
            {
              System.out.println("grade A");
              }
              else if(a>=81 && a<=100)
              {
                System.out.println("distinction");
                }
      else
      {
        System.out.println("fail");
        }
      
        
      }
  }
        
      
  
     
  