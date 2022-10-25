import java.io.*;
class filecreating
  {
    public static void main(String args[])
    {
      try
        {
          BufferedWriter bw=new BufferedWriter (
            new FileWriter(" C:\\Users\\Linga\\Desktop\\abi\\ouput.txt"));
          bw.write("linga");
          bw.write("linga");
          bw.write("linga");
          bw.close();
           
          
        }
      catch(Exception ex)
        {
        return;
      }
    }
  }