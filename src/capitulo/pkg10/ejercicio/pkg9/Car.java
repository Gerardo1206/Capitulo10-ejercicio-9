package capitulo.pkg10.ejercicio.pkg9;

public class Car extends Vehicle {
    public Car(Integer milesPerGalon){
        super(4,milesPerGalon);
    }

    @Override
    public String toString() {
        return "Car:"+super.toString(); 
    }
    
}
