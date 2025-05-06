package ex_18_oops_inheritance.ex_18_oops_single_inheritance;

public class testcase_2 extends common_To_All_Test {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("running TC 2");
        closeBrowser();
    }
}
