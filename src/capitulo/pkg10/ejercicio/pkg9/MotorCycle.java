package capitulo.pkg10.ejercicio.pkg9;

public class MotorCycle extends Vehicle{
    public MotorCycle(Integer milesPerGalon){
        super(2,milesPerGalon);
    }
    @Override
     public String toString() {
        return "Motor Cycle:"+super.toString(); 
    }
}
