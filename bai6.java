
package lab;

import java.util.ArrayList;
import java.util.Random;

public class bai6 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 0; i < 15; i++) {
            int num = rand.nextInt(50) + 1; 
            numbers.add(num);

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Danh sach so: " + numbers);
        System.out.println("So chan: " + evenCount);
        System.out.println("So le: " + oddCount);
    }
}


