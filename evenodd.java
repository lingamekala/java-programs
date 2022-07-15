import java.util.Scanner;

class evenodd
  
  {
    public static void main(String args[])
    {
    Scanner s=new Scanner (System.in);
      int t,i,n,j,sorting;
      
        
      System.out.println("array size:");
        n=s.nextInt();
      int a[]= new int[n];
      
            System.out.println("enter elements to array:");
      for(i=0;i<n;i++)
        
            {
         a[i]=s.nextInt();
    
          }
          
      System.out.println("print the elements :");
      for(i=0;i<n;i++)
        {
                System.out.println(" "+a[i]);
          }
      for(i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println("even numbers:-"+a[i]);
          }
          else
          
            System.out.println("odd numbers:-"+a[i]);
          
        }
    }
  }
      
    
      