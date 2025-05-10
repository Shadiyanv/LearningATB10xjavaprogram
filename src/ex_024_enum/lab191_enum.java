package ex_024_enum;

public class lab191_enum {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if(URLS.katalon.equals("katalon")){
            System.out.println("i want to do something ");
        }
    }
}
enum URLS{
    google,restassured,katalon,VWO
}