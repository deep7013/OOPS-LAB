
class A {

    
    public static int Multiply(int a, int b)
    {
        
        return a * b;
    }
    public static double Multiply(double a, double b)
    {
        
        return a * b;
    }
}
public class Overload
{
    
    public static void main(String[] args) {
     A n=new A();
      System.out.println(n.Multiply(2, 4));
        System.out.println(n.Multiply(5.5, 6.3));
    }
}
