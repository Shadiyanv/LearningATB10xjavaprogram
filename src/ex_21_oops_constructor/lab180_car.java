package ex_21_oops_constructor;

public class lab180_car {
    public static void main(String[] args) {
        car tesla=new car();
        tesla.name="tesla model3";
        tesla.year=2025;
        tesla.model="model3";
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        System.out.println("--------------------------------------");
        car nano=new car();
        nano.name="tata nano";
        System.out.println(nano.name);
    }
}
