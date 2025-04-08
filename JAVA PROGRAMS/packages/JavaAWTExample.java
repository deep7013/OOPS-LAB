import java.awt.*; 
   
class JavaAWTExample { 
   // Declaring constructor 
   public JavaAWTExample() { 
      Frame fm = new Frame(); //Creating a frame 
      Label lb = new Label(" Welcome to refresh java"); //Creating a label 
      fm.add(lb); //adding label to the frame 
      fm.setSize(300, 200); //setting frame size 
      fm.setVisible(true); //setting frame visibility as true 
    } 
   public static void main(String args []) { 
      JavaAWTExample awt = new JavaAWTExample(); 
   } 
} 
