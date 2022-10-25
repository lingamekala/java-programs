import java.io.*;
class newreading
  {
    public static void main(String args[])
    {
      try{
        BufferedReader br= new BufferedReader(new FileReader("D:\\New folder (2)\\akila.txt"));
        String s;
        while((s=br.readLine()) !=null)
          {
            System.out.println(s);
          }
        br.close();
      }
        catch(Exception ex){
        return;
        }
      }
    }
  