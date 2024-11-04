package pertemuan5new;

/**
 *
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 *  PProgram membandingkan dua nilai yang diinputkan 
 *  pengguna dan mengecek apakah pengguna ingin 
 *  mengulangi proses perbandingan atau tidak.
 */

  import java.util.Scanner;
public class latihan24 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("====Program Perbandingan Nilai====");
            System.out.print("Masukkan nilai pertama: ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int nilai2 = input.nextInt();

            if (nilai1 > nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil: " + nilai1 + " sama dengan " + nilai2);
            }

            System.out.print("Ulangi Aktivitas? (Y/T): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');

        input.close();
    }
}
  

