class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class day16 {
    public static void main(String[] args) {
        Student s1 = new Student("Bhumika", 19);
        Student s2 = new Student("Aastha", 20);

        s1.display();
        s2.display();
    }
}
