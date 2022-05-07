import java.util.Scanner;
class current
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int cusno,pmr,lmr,tu;
      String cusname;
      float curbill;
      System.out.println("cusno");
      cusno=s.nextInt();
      System.out.println("cus name");
      cusname=s.next();
      System.out.println("pmr");
      pmr=s.nextInt();
      System.out.println("lmr");
      lmr=s.nextInt();
      tu=(pmr-lmr);
       curbill=(tu*f);
      if(tu<=50)
      curbill=(50*1.45f);
      {
        System.out.println("curbill:"+curbill);
        }
      
         if(tu<=100)
     curbill=((50*1.45f)+((tu-50)*3.20f));
      {
        System.out.println("curbill:"+curbill);
        }
    if(tu<=200)
     curbill=((50*1.45f)+50*3.20f+(tu-100)*3.56f);
      {
        System.out.println("curbill:"+curbill);
        }
    if(tu<=300)
    curbill=((50*1.45f)+50*3.20f+100*3.56f+tu-200*4.87f);
      {
        System.out.println("curbill:"+curbill);
        }
      
      if(tu>=401)
        curbill=(50*1.45f+50*3.20f+100*3.56f+200*4.87f+(tu+1*5.35f));
      {
        System.out.println("curbill:"+curbill);
        }
      
        
      System.out.println("cusno:"+cusno);
      System.out.println("cus name:"+cusname);
      System.out.println("pmr"+pmr);
      System.out.println("lmr:"+lmr);
      System.out.println("tu:"+tu);
    System.out.println("curbill:"+curbill);
      
      
     
  }
  }
     
      
  
      
      
      
      
      
      