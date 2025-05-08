package ex_022_oops_abstraction;

public class lab181_abstraction {
    public static void main(String[] args) {
        WagonR wagonR=new WagonR();
        wagonR.drive();
    }
}
class WagonR extends Engine {
    @Override
    void startEngine() {
        System.out.println("start");
    }
    @Override
    void stopEngine(){
        System.out.println("stop");
    }
    void drive() {
        startEngine();
        System.out.println("I am driving ");
        stopEngine();
    }
}
abstract class Engine{
    Engine(){
    }
    abstract void startEngine();
     void stopEngine(){

    }
}