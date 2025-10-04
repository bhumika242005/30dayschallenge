class MathOps {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class");
    }
}

public class day18 {
    public static void main(String[] args) {
        MathOps obj = new MathOps();
        System.out.println("Sum (2 numbers): " + obj.add(10, 20));
        System.out.println("Sum (3 numbers): " + obj.add(10, 20, 30));

        Parent p = new Child(); // Runtime polymorphism
        p.show();
    }
}
