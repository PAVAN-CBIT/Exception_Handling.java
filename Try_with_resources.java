class myclass implements autocloseable
{ 
public void close()throws Exception
  {
     System.out.println("Closeing");
  }
}
 


Public class Application
{
  public static void main(String[]args)
  {
    try(myclass var=new myclass();)
    {
    }
    catch(Exception e)
    {
     e.PrintStackTrace();
    
    }
    
  }
  
}
