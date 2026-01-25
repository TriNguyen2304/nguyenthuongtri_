
package lab;

import java.util.ArrayList;
import java.util.Random;

public class bai5 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1; 
            list.add(num);
        }

        System.out.println("Danh sach ban dau: " + list);

       
        list.remove(3);

        System.out.println("Danh sach sau khi xoa index 3: " + list);
    }
}


    

