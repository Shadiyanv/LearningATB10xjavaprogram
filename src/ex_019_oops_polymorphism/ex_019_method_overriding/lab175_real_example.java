package ex_019_oops_polymorphism.ex_019_method_overriding;

public class lab175_real_example {
    public static void main(String[] args) {
        TC t1=new TC();
        t1.openBrowser();
    }
}
     class CommonToAllTC{
        void openBrowser(){
            System.out.println("open the browser in 5 sec");
        }
     }

     class TC extends CommonToAllTC{
         void startTC(){
             openBrowser();
         }
     }

     class TC2 extends CommonToAllTC{
          void openBrowser(){
              System.out.println("open the browser in 5 sec ");
          }
     }