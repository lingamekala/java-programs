import java.util.Scanner;
class base
  {
    Scanner sc= new Scanner(System.in);
    int n;
    void read1()
    {
      System.out.println("enter n value");
      n=sc.nextInt();
    }
    }
   class derive1 extends base
     {
     void fact()
       {
         int f=1,i;
         for(i=1;i<=n;i++)
           f=f*i;
         System.out.println("the fact value :"+f);
       }
     }
       class derive2 extends base
         {
           void sum()
           {
             int s=1,i;
             for(i=1;i<=n;i++)
               s=s+i;
             System.out.println("the sum value is:"+s);
           }
         }
class mulptipleinheri
  {
    public static void main (String args [])
    {
      derive1 d1= new derive1 ();
      derive2 d2= new derive2 ();
      d1.read1();
      d1.fact();
      d2.read1();
      d2.sum();
      
    }
  }
       

       
     
    
    
  