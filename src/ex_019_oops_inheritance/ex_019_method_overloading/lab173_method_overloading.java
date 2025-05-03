package ex_019_oops_inheritance.ex_019_method_overloading;

public class lab173_method_overloading {
    public static void main(String[] args) {
        Math m1 = new Math();
        int r1 = m1.add(3, 4); // Calls add(int, int)
        double r2 = m1.add(3.5, 4.5); // Calls add(double, double)
        int r3 = m1.add(3, 4, 5); // Calls add(int, int, int)

        System.out.println("Sum of two ints: " + r1);
        System.out.println("Sum of two doubles: " + r2);
        System.out.println("Sum of three ints: " + r3);
    }
}

class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}










