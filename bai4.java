package Assignment7;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String S = scanner.nextLine();
        String result = S.replaceAll("//s+", " ").trim();

        System.out.println("So tu trong chuoi la: " + S);
        System.out.println("So tu trong chuoi la: " + S.trim());
    }
}