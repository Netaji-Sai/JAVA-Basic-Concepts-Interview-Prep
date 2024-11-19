class Calculator{
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bow Bow!!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow Meow..:)");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Compile Time Polymorphism");
        Calculator obj = new Calculator();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3)+"\n");
        
        System.out.println("Run Time Polymorphism");
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
        Animal a1 = new Animal();
        a1.makeSound();
        Animal d2 = new Dog();
        d2.makeSound();
    }
}
