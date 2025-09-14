//// File: DowncastingDemo.java
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends AnimalCls {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//
//    void run() {
//        System.out.println("Dog runs fast");
//    }
//}
//
//public class DowncastingDemo {
//    public static void main(String[] args) {
//        AnimalCls a = new Dog();  // Upcasting
//        a.sound();             // Runtime → Dog’s sound()
//        Dog d   = (Dog) a;       // Downcasting
//        d.sound();             // Dog’s sound()
//        d.run();               // Extra method from Dog
//
//    }
//}
