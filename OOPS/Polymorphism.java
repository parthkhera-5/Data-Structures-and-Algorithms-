import java.util.Scanner;

public class Polymorphism{
    public static class Dog{
        void speak(){
            System.out.println("Bark");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Roar");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Lion l = new Lion();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Human h = new Human();

        d.speak();
        l.speak();
        c.speak();
        p.speak();
        h.speak();
    }
}