class Animal {


  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}


class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class inherit{
  public static void main(String[] args) {

   
    Dog a = new Dog();

  
    a.name = "abc";
    a.display();
    a.eat();

  }
}