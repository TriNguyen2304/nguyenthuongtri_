package Assignment7;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap chuoi: ");
        String S = scanner.nextLine();
        System.out.print("Nhap ky tu can dem: ");
        char c = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 0) {
                dem++;
            }
        }
        System.out.println("Ky tu " + c + "xuat hien " + dem + " lan trong chuoi ");
    }
}
