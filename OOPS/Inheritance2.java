class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class AirCrafts extends PowerVehicle{
    int rotors;
}
// Multilevel Inheritance

class Animal{
    int size;
    boolean isVegetarian;
}
class Birds extends Animal{
    int maximumAltitude;
}
class AquaticAnimals extends Animal{
    int fins;
}
class Insects extends Animal{
    int feets;
}
//hierarchial inheritance

public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();
        PowerVehicle bike = new PowerVehicle();
    }
}
