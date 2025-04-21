package ex_15_string_functions2;

public class lab141_string_functions {
    public static void main(String[] args) {

        String name="sonal";
        System.out.println(name.charAt(3));

        System.out.println(name.length());

        System.out.println(name.concat("patel"));

        System.out.println(name.contains("sona"));

        System.out.println(name.contains("du"));

        System.out.println(name.equals("sonal"));

        System.out.println(name.equalsIgnoreCase("SONAL"));

        System.out.println(name.indexOf("a"));

        System.out.println(name.replace('n','N'));

        String name4="sonal harish";
         // String[] split=name4.split(" ");
         //System.out.println(split[0]);
        //System.out.println(split[1]);



        String s1="shadiya@rashiid";
        String[] split=s1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);


        String s2="niagara o my god!";
        String s3=s2.substring(5,9);
        System.out.println(s3);


        String ss="hamburger";
        System.out.println(ss.substring(4,9));

        System.out.println(ss.toUpperCase());
        System.out.println(ss.replace('b','B'));
        System.out.println("SONAL".toLowerCase());
        System.out.println(ss.startsWith("s"));
        System.out.println(ss.endsWith("r"));
        System.out.println("rashid".compareTo("rashid"));
        System.out.println("rashid".compareToIgnoreCase("RASHID"));
    }
}
