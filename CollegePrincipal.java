/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class
class Teacher 
  {
    String st = "IIT";
  }
  

    class MathTeacher extends Teacher
      {
      void work()
      {
      System.out.println("math Teacher "+st);
      }
      }

    class EnglishTeacher extends Teacher
      {
      void work()
      {
      System.out.println("English teacher "+st);
      }
  }

class musicteacher extends Teacher
  {
    void work()
  {
     System.out.println("music teacher "+st);
  }
}
class CollegePrincipal 
{
  public static void main(String args[])
  {
    MathTeacher d1= new MathTeacher();
    EnglishTeacher d2= new EnglishTeacher();
    musicteacher d3= new musicteacher();
    d1.work();
    d2.work();
    d3.work();
    
  }

 

}
