package ex_15_string_functions2;

public class lab143_string_builder_string_buffer{
    public static void main(String[] args){
        StringBuilder  sb=new StringBuilder("pramod");
        sb.append("dutta");
        System.out.println(sb);


        StringBuffer stb=new StringBuffer("shadiya");
        System.out.println(stb.append("rashid"));
        System.out.println(stb.length());
        System.out.println(stb.indexOf("r") );
        stb.append("NV");
        System.out.println(stb);
        System.out.println(stb.charAt(3));

    }
}
