class Hello{ 
    private String name; 
  
  
    public String getName() { return name; } 
    public void setName(String name) { this.name = name; } 
} 
  
public class Encap1{ 
    public static void main(String[] args) { 
        Hello p = new Hello(); 
        p.setName("abc");  
        System.out.println(p.getName()); 
    } 
} 
