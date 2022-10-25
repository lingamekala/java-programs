import java.util.Scanner;


class arraypositivenagative
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n;
      int t;
      System.out.println("enter array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements:");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
    
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                }
              }
                System.out.println("after sorting is");
                for( i=0;i<n;i++)
                  {
                  System.out.println(" "+a[i]);
                
              }
            
        
      }
  }
  }
