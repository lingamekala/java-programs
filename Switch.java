  import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n;
      System.out.println("n value");
      n=s.nextInt();
      Switch(n);
        {
         case1:
          System.out.println("sunday");
          break;
          case2:
            System.out.println("monday");
          break;
          case3:
          System.out.println("tueseday");
          break;
          case4:
          System.out.println("wednessday");
          break;
          case5:
          System.out.println("thurseday");
          break;
          case6:
          System.out.println("friday");
          break;
          case7:
          System.out.println("saturday");
          break;
        default:  
          
            System.out.println("wrong choice");
            
            
         }
    }
  }
      
  
      