class Condemo
  {
    int a,b,c;
    Condemo (int x,int y)
    {
      a=x;
      b=y;
      System.out.println("vlaue is "+a);
      System.out.println("vlaue is "+b);
      c=a+b;
      System.out.println("vlaue is "+c);
    }
  }
  class Condemo1
    {
      public static void main(String args)
      {
        int m=23, n=43;
        condemo c1= new condemo(m,n);
      }
    }