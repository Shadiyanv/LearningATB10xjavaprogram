package ex_09_switch;

public class lab094_IQ {
    public static void main(String[] args) {
         char ch='A';
         switch(ch){
             case 65:
                 System.out.println("A");

                 //is this a valid syntax---->yes
                 //boolean is not valid
                 //long is valid

                 int a=98;
                 switch(a){
                     case  98:
                         System.out.println("98");
                    // case 98:'98'
                         //System.out.println("98");
                         //same case are not allowed
                 }
         }
    }
}
