public class Inheritance_Composition {
    
    public static void main(String[] args) {
        Cat c = new Cat();    
        Dog d = new Dog();

            d.bark();
            c.bark();
    }


}

class Animal{

    public void bark(){
        System.out.println("animal speaks");
    }
}

class Cat extends Animal{
    public void bark(){
        System.out.println("meow");
    }
}
class Dog {
    private Animal a = new Animal();

    public  void bark(){
        System.out.println("bhow");
        a.bark();
    }
}
