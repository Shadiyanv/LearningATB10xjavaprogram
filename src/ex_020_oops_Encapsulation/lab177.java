package ex_020_oops_Encapsulation;

public class lab177 {
    public static void main(String[] args) {
        ICICBank amit=new ICICBank("Amit",100);
        System.out.println(amit.getBal());

        boolean isCashier=true;
        amit.setBal(1000, isCashier);
        System.out.println(amit.getBal());
    }
}
         class ICICBank{
            private String Name;
            private long Bal;

            public ICICBank(String Name,long bal){
                 this.Name=Name;
                 this.Bal=Bal;
            }

             public String getName() {
                 return Name;
             }

             public void setName(String name) {
                this.Name = name;
             }

             public long getBal() {
                 return Bal;
             }

             public void setBal(long Bal,boolean isCashier) {
                 if(isCashier){
                     this.Bal = Bal;
                 }else{
                     System.out.println("nit allowed to change balance");
                 }
             }
         }