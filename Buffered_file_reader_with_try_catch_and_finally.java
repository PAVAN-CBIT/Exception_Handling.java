import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 
 
 
 
 Public class Application
 {
 
 
  public static void main(String[]args)
  {
  
  
      File file= new File("myfile.txt");
         try
            {
  
                 FileReader fileReader = new FileReader(file);
      
                 BufferedReader bufferedReader =new BufferedReader(fileReader);
                 String line = bufferedReader.readline();
                 
                 
                 while(line!=null)
                 {
                   System.out.println(line);
                   line = bufferedReader.readline();
                   
                 
                 
                 
                 }
            } 
            
            
              catch(FileNotFoundException e)
                {
            
                System.out.println("File Not Found);
            
                }
            Catch(IOException e)
            {
            
             System.out.println("Problem reading the file"file.getname());
            
            }
            finally
            {
             try 
                {
                  bufferedReader.close();
            
                  
            }
            
            catch(IOException)
            {
              System.out.println("unable to close file+file.getname());
              
              
            }
            catch(NullPointerException ex)
            {
            
              System.out.println("file was probably never opened"+ex);
            
            }
            
            
            
            }
            
            
            
  
  }
  
  
  
  
  
  } 
 
 
 
 
 
 
 
 
 
 
 }
