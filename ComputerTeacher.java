/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher
  {
  String st1="IIT";
    String st2= "collegeName";
}
class Designation extends Teacher
  {
    void linga()
    {
      System.out.println("Designation   " +     st2);
    }
  }
class Computerteacher extends Teacher
  {
    void linga()
    {
      System.out.println(" Computer Teacher   "+     st1);
    }
  }

class ComputerTeacher 
{
  public static void main(String args[])
  {
    Designation d1= new Designation();
      Computerteacher d2= new Computerteacher();
      d1.linga();
      d2.linga();
  }


}

