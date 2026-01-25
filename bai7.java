
package lab;


import java.util.ArrayList;
import java.util.Collections;

public class bai7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Danh sach ban dau: " + list);

        Collections.reverse(list);

        System.out.println("Danh sach sau khi dao nguoc: " + list);
    }
}

