abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow Meow");
    }
}

public class day20 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        Animal a = new Cat();
        a.sound();
    }
}
