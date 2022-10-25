import java.io.*;
class newfile
  {
    public static void main(String args[])
    {
      try{
      BufferedWriter bw= new BufferedWriter(new FileWriter(
        "D:\\New folder (2)\\akila.txt"));
      bw.write("linga");
      bw.write("akila");
      bw.write("amma");
      bw.write("abi");
      bw.write("wife");
      bw.close();
      
    }
      catch(Exception ex){
        return ;
      }
  }
  }