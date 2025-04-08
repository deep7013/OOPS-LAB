import java.io.Console; 
  
class pack1 { 
   public static void main(String args []) { 
      Console cs = System.console(); 
      System.out.println("Enter your name : "); 
      String name = cs.readLine(); 
      System.out.println("Welcome : "+name); 
    } 
} 
