package capitulo.pkg10.ejercicio.pkg9;

public class Vehicle {
    private Integer numberOfWheels;
    private Integer milesPerGalon;
    
    public Vehicle(Integer numberOfWheels, Integer milesPerGalon) {
        this.numberOfWheels = numberOfWheels;
        this.milesPerGalon = milesPerGalon;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "numberOfWheels=" + numberOfWheels + ", milesPerGalon=" + milesPerGalon + '}';
    }
    
    
    
}
