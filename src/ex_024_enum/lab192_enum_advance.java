package ex_024_enum;

public class lab192_enum_advance {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexcode());
        System.out.println(Locators.page_button.getLocator());
        System.out.println(APIURLS.katelon.geturl());
    }
}
enum colors{
    RED("#FF0000"),
    GREEN("61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;
    colors(String hexcode){
        this.hexcode=hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }
}
enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String Locators;
    Locators(String locators){
        this.Locators=locators;
    }
    String getLocator(){
        return this.Locators;
    }
}
enum APIURLS{
    katelon("https://katelon.com"),
    google("https:google.com");

    private String url;
    APIURLS(String url){
        this.url=url;
    }
    String geturl(){
        return this.url;
    }
}