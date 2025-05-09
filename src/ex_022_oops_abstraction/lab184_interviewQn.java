package ex_022_oops_abstraction;

public class lab184_interviewQn {
}
interface I11{}  //valid-->yes
interface I12{}  //valid-->yes

class A1{}  //possible-->yes
class B1{}   //possible-->yes
class test1 extends A1{}   //possible-->yes
//class test2 extends A1,B1{}  //not possible

class test3 implements I11{}  //possible
class test4 implements I12,I11{}  //possible
//class test5 implements I11 extends A{}  //not possible
interface I3{}
//interface I3 extends A1{} //not possible