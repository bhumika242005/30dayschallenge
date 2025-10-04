class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class day15 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Honda";
        c1.speed = 120;
        c1.display();

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.speed = 180;
        c2.display();
    }
}
