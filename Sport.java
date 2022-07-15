/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class  Sport 
{ 
  String st= "Football";
  void linga()
  {
    System.out.println("Sport name: "+st);
  }

// Create a member variable for Sport name 

// Set member variable for Sport name 

public static void main(String args[]) 
  {
    Sport s= new Sport();
    s.linga();
  }
}

// Create object for Sport clasposs 

// Print the value of Sport name using "this" referen