package ex_21_oops_constructor.access_modifier.criminal;

import ex_21_oops_constructor.access_modifier.criminal.police.cop;

public class thief {
    public static void main(String[] args) {
        cop thief=new cop(100);
        thief.canIShoot();
    }
}
