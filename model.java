class model
  {
    public static void main(String args[])
    {
      int i,len=0;
   String st1= "lingaiah";
   String st2=st1+'\0';
      String st3=String.valueOf(st1);
    for(i=0;st2.charAt(i)!='\0';i++)
       len=len+1;
{
  System.out.println(" length of String:"+len);
  
}
      System.out.println(st2);
  }
  }