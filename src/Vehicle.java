import java.sql.SQLOutput;

abstract public class Vehicle {
    public abstract void drive();
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Implement drive");
        }
        }