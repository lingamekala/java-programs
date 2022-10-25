class Encap
  {
    private String stname;

    private int stnum;
    public String getName()
    {
      return stname;
    }
    public int getAge()
    {
      return stnum;
    }
    public void setAge(int number)
    {
      stnum=number;
      
    }
    public void setName(String name )
    {
      stname=name;
    }
    
    class Runencap
      {
      public  static void main(String args[])
        {
          Encap c= new Encap();
          c.setName("linga");
          c.setAge(321);
          System.out.println("name"+c.getName()+" Age"+c.getAge());
        }
      }
    }
  