package Assignment7;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");

        String S = scanner.nextLine();
        String[] sotu = S.split("//s+");
        int demtu = sotu.length;

        System.out.println(" So tu trong chuoi la" +  demtu);
    }

}
