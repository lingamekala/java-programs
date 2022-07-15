import java.util.Scanner;
class mami
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner (System.in);
      int i,n;
       System.out.println("size of array");
      n=sc.nextInt();
      int a[]= new int[n];
        System.out.println("enter ements in array:");
      for(i=0;i<n;i++)
        {
          a[i]= sc.nextInt();
        }
      System.out.println("print elements in array:");
      for(i=0;i<n;i++)
      {
        System.out.println(" :"+a[i]);
        }
      int max=a[0];
      for(i=0;i<n;i++)
        {
          if(a[i]>max)
          max=a[i];
        }
          System.out.println("maximum value:"+max);
        int min=a[0];
      for(i=0;i<n;i++)
        {
          if(a[i]<min)
            min=a[i];
        }
          System.out.println("mimimum valaue:"+min);
         
        
    
    }
  }