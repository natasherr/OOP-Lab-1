public class Bus extends Vehicle {

    public Bus(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void accelerate() {
        System.out.println("The bus accelerates slowly.");
    }

    @Override
    public void stop() {
        System.out.println("The bus applies heavy air brakes to stop.");
    }

    @Override
    public void gas() {
        System.out.println("The bus fills up with diesel.");
    }
}