package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        int a = input.nextInt();

        System.out.println("Masukkan angka kedua");
        int b = input.nextInt();

        System.out.println("Masukkan angka ketiga");
        int c = input.nextInt();

        if(a > b){
            if(a > c){
                System.out.println("Angka pertama adalah angka maksimum");
            }
            else {
                System.out.println("Angka ketiga adalah angka maksimum");
            }
        }

        else {
            if(b > c){
                System.out.println("Angka kedua adalah angka maksimum");
            }
            else {
                System.out.println("Angka ketiga adalah angka maksimum");
            }
        }
    }
}
