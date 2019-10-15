import java.net.*;
import java.io.*;

public class client {

  
    public static void main(String[] args)throws IOException  {
     
        Socket s = new Socket("localhost",5001);
		
		PrintWriter pr= new PrintWriter(s.getOutputStream());
		pr.println("merhabalar");
		pr.flush();
        
        
    }
    
}