/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
 

 
class DiamondPattern { 
     
     public static void main(String[] args) { 
        
       //declaring and initializing variables 
       int ch =97; 
       int i,j,k,m; 
      // for first half portion 
      for( i=1; i <= 3; i++) { 
  
         // print space 
         for( j=3; j >= i; j--) { 
            System.out.print("  "); 
         } 
  
         // print digit 
         for( k=1; k <= 2*i-1; k++) { 
            if(k < i) 
            System.out.print((char)(ch++)+ " "); 
            else if(k == i) 
            System.out.print((char)(ch)+ " "); 
            else 
            System.out.print((char)(--ch)+ " "); 
         }
 // new line 
         System.out.println(); 
      } 
       // for second half portion 
      for( i=2; i >= 1; i--) { 
  
         // print space 
         for( j=3; j >= i; j--) { 
            System.out.print("  "); 
         } 
  
         // print digit 
         for( k=1; k <= 2*i-1; k++) { 
            if(k < i) 
            System.out.print((char)(ch++)+ " "); 
            else if(k == i) 
            System.out.print((char)(ch)+ " "); 
            else 
            System.out.print((char)(--ch)+ " "); 
         } 
  
         // new line 
         System.out.println(); 
      } 
        
    }
}

//Good Job!
 
