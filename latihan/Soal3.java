package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil;

        System.out.println("Masukkan angka pertama");
        int a = input.nextInt();

        System.out.println("Masukkan angka kedua");
        int b = input.nextInt();

        System.out.println("Masukkan operand\n1.Kali\n2.Bagi\n3.Tambah\n4.Kurang\n5.Modulus");
        int x = input.nextInt();
        switch (x){
            case 1:
                hasil = a + b;
                break;
        }
    }
}
