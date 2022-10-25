import java.io.*;
class readerfile
  {
    public static void main(String args[])
    {
      try{
      //  BufferedWriter bw= new BufferedWriter(new FileWriter("C:\Users\Linga\Desktop\abi\ouput-copy.txt"));
      BufferedReader br= new BufferedReader(new  
                  FileReader("   D:\\Rajesh\\output.txt"));
      String s;
      while((s=br.readLine())!=null )
        {
          System.out.println(s);
        }
      
      br.close();
    }
      catch(Exception ex)
        {
          return;
        }
    
    
  }
  }