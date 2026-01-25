package lab;

import java.util.ArrayList;

public class bai3 {

    public static void main(String[] args) {
        ArrayList<Double> gia = new ArrayList<>();
        gia.add(12.50);
        gia.add(23.40);
        gia.add(12234.455);
        System.out.println("Danh sach gia san pham: ");
        for (int i = 0; i < gia.size(); i++) {
            System.out.println("gia" + (i + 1) + ":" + gia.get(i));
        }
    }
}
