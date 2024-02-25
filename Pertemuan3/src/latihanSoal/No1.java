/* 
Buatlah algoritma dalam bahasa Java, menerima masukan berupa sebuah bilangan ril,
periksa apakah angka di depan koma dan angka di belakang koma adalah kelipatan 3
(angka dibelakang koma pasti 2 angka)
*/

package latihanSoal;

import java.util.Scanner;
public class No1{
    public static void main(String[] args){
        try (Scanner userInput = new Scanner(System.in)){
            // Meminta pengguna untuk memasukkan bilangan ril
            System.out.print("Masukkan bilangan ril: ");
            double bilanganRil = userInput.nextDouble();
            
            // Mengambil angka di depan koma
            int sebelumKoma = (int) bilanganRil;
            // Mengambil dua digit angka di belakang koma
            int setelahKoma = (int) ((bilanganRil - sebelumKoma) * 100);
            // Memeriksa apakah angka di depan dan di belakang koma adalah kelipatan 3
            
            if (sebelumKoma % 3 == 0 && setelahKoma % 3 == 0){
                System.out.println("Angka di depan dan di belakang koma adalah kelipatan 3.");
            } else{
                System.out.println("Angka di depan dan di belakang koma bukan kelipatan 3.");
            }
        }
    }
}