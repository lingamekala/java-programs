import java.util.Scanner;
class du
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j;
      System.out.println("enter array size:");
      n=sc.nextInt();
      int a[]= new int[n];
      System.out.println("enter elements ");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
      
        }
      System.out.println("print elements to array:");
      int c=0;
      for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              {
                c++;
                System.out.println(a[j]);
                break;
                
              }
            }
        }
      System.out.println("duplicate numbers:"+c);
    }
  }