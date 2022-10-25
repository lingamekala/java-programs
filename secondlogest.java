import java.util.Scanner;
class secondlogest
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
        int n;
      System.out.println("enter n value:");
      n=sc.nextInt();
      int a[]= new int [n];
      System.out.println("enter elements:");
      for(int i=0;i< n;i++)
        {
          a[i]=sc.nextInt();
        }
     System.out.println("maxmimu:");
      int max=a[0];
      for(int i=0;i<n;i++)
        { 
            if(a[i]>max)
            
              max=a[i];
              
        }
              System.out.println(""+max);
      int min=a[0];
      for(int i=0;i<n;i++)
        {
          if(a[i]<min)
            min=a[i];
        }
      System.out.println("minimum:"+min);
            
        }
    }
  
  