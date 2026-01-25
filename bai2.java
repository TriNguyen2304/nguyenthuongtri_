package lab;

import java.util.ArrayList;

public class bai2 {

    public static void main(String[] args) {
        ArrayList<String> mau = new ArrayList<>();
        mau.add("do");
        mau.add("den");
        mau.add("xanh");
        mau.add("tim");
        mau.add("vang");
        mau.set(1, "vang");
        System.out.print(mau);
    }
}
