class Animal {

  
  public void eat() {
    System.out.println("I can eat");
  }
}


class Dog extends Animal {

  
  
  public void eat() {
    System.out.println("I eat dog food");
  }

  
  public void bark() {
    System.out.println("I can bark");
  }
}

class Override{
  public static void main(String[] args) {

 
    Dog a= new Dog();

      a.eat();
    a.bark();
  }
}