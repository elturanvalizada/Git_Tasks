package Interface.Task4;

public class AmphibiousPlane implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("AmphibiousPlane is flying");
    }

    @Override
    public void swim() {
        System.out.println("AmphibiousPlane is swimming");
    }
}
