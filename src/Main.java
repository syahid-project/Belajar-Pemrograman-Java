import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Latihan CodeLab 1 dan 2 ===");
        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();

        System.out.print("Masukkan angka favorit kamu (1-5): ");
        int angka = input.nextInt();

        System.out.println("\nHai " + nama + "! Ini daftar angka dari 1 sampai 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Angka ke-" + i);
        }

        if (angka == 1) {
            System.out.println("Kamu suka angka 1! Itu melambangkan awal yang baru.");
        } else if (angka == 5) {
            System.out.println("Angka 5 adalah simbol keberuntungan! Pilihan yang bagus!");
        } else {
            System.out.println("Angka " + angka + " juga keren kok, tetap semangat belajar Java!");
        }

        System.out.println("\nProgram selesai. Terima kasih sudah mencoba!");
        input.close();
    }
}
