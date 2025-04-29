package ex_16_Arrays;

public class lab146 {
    public static void main(String[] args) {
        //first method
        String[] name={"amit","suresh","lucky"};

        //second mathod
        String[] names=new String[3];
        names[0]="amit";
        names[1]="suresh";
        names[2]="lucky";
        System.out.println(names.length);
        System.out.println(name[1]);


        //boolean array
        boolean[] is_male_data=new boolean[2];
        is_male_data[0]=true;
        is_male_data[1]=false;
        System.out.println(is_male_data[1]);
        System.out.println(is_male_data[0]);




    }
}
