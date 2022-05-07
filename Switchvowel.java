import java.util.Scanner;
class Switchvowel
  {
     public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n;
       System.out.println("enter n value");
      n=s.nextInt();
      Switch(n%2==0);
      { 
      case 0:
          System.out.println("its even number");
          break;
        }
      {
          case 1:
          System.out.println("its odd number");
          break;
        }
          
      }
  }
      
        
            
      