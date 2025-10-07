import java.io.*;

class Greeting {
    void sayHello() {
        System.out.println("Hello Bhumika Intelligent! Welcome to Day 32 of Java Challenge!");
        System.out.println("You are learning how to use Java packages!");
    }

    void motivation() {
        System.out.println("Keep going! Great things take time and consistency!");
    }
}

public class day32 {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello();
        g.motivation();

        System.out.println("\n Package concept demonstrated successfully!");
    }
}
