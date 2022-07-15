import java.util.Scanner;

class so
  
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
          
      System.out.println("enter before sorting the elements :");
      for(i=0;i<n;i++)
        {
                System.out.println(" "+a[i]);
          }
    
      
    
      for(i=0;i<n-1;i++)
        {
          for(j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                }
              }
                System.out.println("after sorting is");
                for(i=0;i<n;i++)
                  {
                  System.out.println(" "+a[i]);
                
              }
            
        
      }
  }
  }
