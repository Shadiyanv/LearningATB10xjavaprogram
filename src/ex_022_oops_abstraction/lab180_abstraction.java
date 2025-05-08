package ex_022_oops_abstraction;

public class lab180_abstraction {
    public static void main(String[] args) {
        child c=new child();
        c.loan50k();
        c.loan25k();
    }
}
  abstract class father {
      abstract void loan50k();
      void loan25k () {
              System.out.println("given 25k");
      }
  }

  class child extends father{

      @Override
      void loan50k() {
          System.out.println("child will pay the loan");
      }
  }