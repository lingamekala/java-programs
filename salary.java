 import java.util.Scanner;
        class salary
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int enu,esal;
      float DA,HRA,TA,PF,IT,netsalary,grosssalary;
      String ena;
      System.out.println("enu:");
      enu=s.nextInt();
      System.out.println("ena:");
      ena=s.next();
     System.out.println("esal:");
      esal=s.nextInt();
       DA= (20/100f)*esal;
      HRA=(10/100f)*esal;
      TA=(12/100f)*esal;
      PF=(8/100f)*esal;
      IT=(5/100f)*esal;
      grosssalary=(esal+HRA+DA+TA);
      netsalary=(grosssalary-(PF+IT));
      System.out.println("number:"+enu);
      System.out.println("name:"+ena);
      System.out.println("esal:"+esal);
      System.out.println("da:"+DA);
      System.out.println("hra:"+HRA);
      System.out.println("ta:"+TA);
      System.out.println("PF:"+PF);
      System.out.println("IT:"+IT);
      System.out.println("grosssal:"+grosssalary);
      System.out.println("netsala:"+netsalary);
      }
  } 
      
      
