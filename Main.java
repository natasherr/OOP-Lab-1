public class Main {
    public static void main(String[] args) {
        
        // an instance of class Sedan
        Sedan mySedan = new Sedan("Toyota Camry", "Silver");
        
        // Demonstrating method overriding
        mySedan.accelerate(); 
        
        // Demonstrating method overloading
        mySedan.accelerate(120); 

        // Testing the other methods
        mySedan.stop();
        mySedan.gas();
        mySedan.turnOnRadio();
        mySedan.openTrunk();
    }
}
