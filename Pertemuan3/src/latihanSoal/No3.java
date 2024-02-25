/*
Menghitung lama dalam jam dan menit berdasarkan selisih waktu dalam menit
berdasarkan jam mulai (jam,menit) dan jam selesai (jam menit) yang diinput.
 */

package latihanSoal;

import java.util.Scanner;

public class No3{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            // Meminta pengguna untuk memasukkan jam mulai
            System.out.print("Masukkan jam mulai (jam.menit)   : ");
            String jamMulaiStr = scanner.next();
            String[] jamMulaiParts = jamMulaiStr.split("\\.");
            int jamMulai = Integer.parseInt(jamMulaiParts[0]);
            int menitMulai = Integer.parseInt(jamMulaiParts[1]);

            // Meminta pengguna untuk memasukkan jam selesai
            System.out.print("Masukkan jam selesai (jam.menit) : ");
            String jamSelesaiStr = scanner.next();
            String[] jamSelesaiParts = jamSelesaiStr.split("\\.");
            int jamSelesai = Integer.parseInt(jamSelesaiParts[0]);
            int menitSelesai = Integer.parseInt(jamSelesaiParts[1]);

            // Menghitung selisih waktu dalam menit
            int waktuMulaiDalamMenit = jamMulai * 60 + menitMulai;
            int waktuSelesaiDalamMenit = jamSelesai * 60 + menitSelesai;
            int selisihDalamMenit = waktuSelesaiDalamMenit - waktuMulaiDalamMenit;

            // Menampilkan lama waktu dalam menit
            System.out.println("Lama waktu (menit)     : " + selisihDalamMenit);

            // Menghitung lama waktu dalam jam dan menit
            int lamaJam = selisihDalamMenit / 60;
            int lamaMenit = selisihDalamMenit % 60;

            // Menampilkan lama waktu dalam jam dan menit
            System.out.println("Lama waktu (jam.menit) : " + lamaJam + " jam " + lamaMenit + " menit");
        }
    }
}
