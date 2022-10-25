import java.util.Scanner;
class student
  {
    int sno;
    String  sname;
    
    Scanner sc= new Scanner(System.in);
    int n;
    void read()
    {
      System.out.println("student number:");
      sno=sc.nextInt();
      System.out.println("student name:");
      sname= sc.next();
       }
  }
     class student1 extends base
       {
         int m1,m2,m3;
         void marks()
         {
           System.out.println("enter student marks:");
           m1=sc.nextInt();
          m2=sc.nextInt();
          m3=sc.nextInt();
           
         }
       }
    class Student2 extends student1
      {
        int tot;
        float aveg;
        void total()
        {
          tot= m1+m2+m3;
          aveg = tot/3;
          System.out.println("the student total is:"+tot);
          System.out.println("the student aveg is:"+aveg);
          
        }
      }
  class multilevelinheri
    {
      public static void main(String args[])
      {
         Student2 s= new Student2();
      
      s.marks();
     s.total();
    
    }

}


  