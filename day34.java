// Save as day34.java

public class day34 {

    // 🔹 Outer Class
    class Outer {
        private String message = "Hello Bhumika Intelligent!";

        // 🔸 Inner Class (Non-static)
        class Inner {
            void display() {
                System.out.println(message + " This is an Inner Class Example!");
            }
        }

        // 🔸 Static Inner Class
        static class StaticInner {
            void greet() {
                System.out.println("This is a Static Inner Class in Java!");
            }
        }

        // Method with Anonymous Class Example
        void anonymousExample() {
            Greeting greeting = new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("Anonymous Class says: You’re doing great, keep learning Java daily!");
                }
            };
            greeting.sayHello();
        }
    }

    // 🔹 Interface for Anonymous Class Example
    interface Greeting {
        void sayHello();
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        // Create Outer class instance
        day34 outerDemo = new day34();
        Outer outer = outerDemo.new Outer();

        // Create Inner class instance
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Create Static Inner class instance
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.greet();

        // Use Anonymous Class Example
        outer.anonymousExample();

        System.out.println("\nInner and Anonymous Classes executed successfully by Bhumika Intelligent!");
    }
}
