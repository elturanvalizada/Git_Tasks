package Interface.Task3;

public class Car extends Vehicle implements Drivable{
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}
