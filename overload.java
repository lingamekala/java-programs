import java.util.Scanner;
class factorial
  {
    int f=1,n=5,i;
  
    void Linga()
  
    {
      for(i=0;i<n;i++)
        {
          f=f*i;
          System.out.println(" "+f);
        }
    }
    void Linga(int x)
    {
      f=1;
      for(i=0;i<n;i++)
        {
         f= f*i;
          System.out.println(" "+f);
        }
    }
    class overload
      {
        public static void main(String args[])
        {
          factorial f1= new factorial();
          f1.Linga();
          f1.Linga(6);
        }
      }
  }
  
    
      
    
  