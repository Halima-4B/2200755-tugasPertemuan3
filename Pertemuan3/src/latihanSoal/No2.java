/*
Buatlah algoritma dalam bahasa Java, berupa menu yang dapat memasukan pilihan jika
menginputkan karakter operator aritmatika ‘+’ akan melakukan penjumlahan, jika ‘-‘
pengurangan sampai karakter ‘*’, ‘/’ dan ‘%’ dua bilangan integer.
*/

package latihanSoal;

import java.util.Scanner;
public class No2{
    public static void main(String[] args){
        // Meminta pengguna untuk memasukkan dua bilangan
        try (Scanner scanner = new Scanner(System.in)){
            // Meminta pengguna untuk memasukkan dua bilangan
            System.out.print("Masukkan bilangan pertama : ");
            int bil1 = scanner.nextInt();
            
            System.out.print("Masukkan bilangan kedua   : ");
            int bil2 = scanner.nextInt();
            
            // Meminta pengguna untuk memasukkan operator aritmatika
            System.out.print("Masukkan operasi aritmatika (+, -, *, /, %) : ");
            char operator = scanner.next().charAt(0);
            
            // Melakukan operasi aritmatika sesuai dengan operator yang dimasukkan pengguna
            int hasil = 0;
            switch (operator){
                case '+':
                    hasil = bil1 + bil2;
                    System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                    break;
                case '-':
                    hasil = bil1 - bil2;
                    System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                    break;
                case '*':
                    hasil = bil1 * bil2;
                    System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                    break;
                case '/':
                    if (bil1 != 0 && bil2 != 0){
                        hasil = bil1 / bil2;
                        System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                    } else{
                        System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                    }
                    break;
                case '%':
                    if (bil1 != 0 && bil2 != 0){
                        hasil = bil1 % bil2;
                        System.out.println("Hasil modulus " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                    } else{
                        System.out.println("Modulus dengan nol tidak dapat dilakukan.");
                    }
                    break;
                default:
                    System.out.println("Operator aritmatika tidak valid.");
            }
        }
    }
}
