package Assignment7;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhập chuỗi gốc: ");
        String chuoiGoc = sc.nextLine();

        System.out.print("Nhập từ cần thay thế: ");
        String tuCu = sc.nextLine();

        System.out.print("Nhập từ thay thế: ");
        String tuMoi = sc.nextLine();

        
        String chuoiMoi = chuoiGoc.replace(tuCu, tuMoi);

        System.out.println("Output: " + chuoiMoi);
        
        sc.close();
    }
}
