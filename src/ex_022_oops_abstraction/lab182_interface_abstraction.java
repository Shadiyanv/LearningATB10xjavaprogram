package ex_022_oops_abstraction;

public class lab182_interface_abstraction {
    public static void main(String[] args) {
        Car car=new Car();
        car.drive();
    }
}
class Car implements Engine1,Break {

    void drive() {
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("apply break");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine");

    }
}
interface Engine1{
    void startEngine();
    void stopEngine();
}
interface Break{
    void applyBreak();
}