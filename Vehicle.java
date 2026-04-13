public abstract class Vehicle {
    // Data of my choice
    String brand;
    String color;

    // Constructor to set the data
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Abstract methods 
    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
}