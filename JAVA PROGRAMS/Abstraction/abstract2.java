abstract class Shape { protected String color; 
public Shape(String color) { 
    this.color = color; 
} 
 
public void setColor(String color) { 
    this.color = color; 
} 
 
abstract double calculateArea(); 
abstract double calculatePerimeter(); 
 
public void displayInfo() { 
    System.out.println("Color: " + color); 
    System.out.println("Area: " + calculateArea()); 
    System.out.println("Perimeter: " + calculatePerimeter()); 
} 
  
} 
class Circle extends Shape { private double radius; 
public Circle(String color, double radius) { 
    super(color); 
    this.radius = radius; 
} 
 
@Override 
public double calculateArea() { 
    return Math.PI * radius * radius; 
} 
 
@Override 
public double calculatePerimeter() { 
    return 2 * Math.PI * radius; 
} 
  
} 
class Rectangle extends Shape { private double length; private double width; 
public Rectangle(String color, double length, double width) { 
    super(color); 
    this.length = length; 
    this.width = width; 
} 
 
@Override 
public double calculateArea() { 
    return length * width; 
} 
 
@Override 
public double calculatePerimeter() { 
    return 2 * (length + width); 
} 
  
} 
public class abstract2{ public static void main(String[] args) { Circle circle = new Circle("Red", 5.0); Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0); 
   circle.displayInfo(); 
    System.out.println(); 
     
    rectangle.displayInfo(); 
    System.out.println(); 
     
    rectangle.setColor("Green"); 
    rectangle.displayInfo(); 
} 
  
} 
