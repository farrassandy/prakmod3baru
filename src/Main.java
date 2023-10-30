import java.util.Scanner;

/**
 * Dokumentasi :
 * Program Kalkulator BMI
 * Kalkulator Indeks Massa Tubuh (BMI) adalah program yang menghitung dan
 * mengkategorikan BMI berdasarkan berat badan dan tinggi badan yang dimasukkan.
 *
 * @author Farras Sandy Harsoyo
 */
public class Main {
    /**
     * Metode utama (main) program Kalkulator BMI. Metode ini meminta pengguna
     * untuk memasukkan berat badan dalam kilogram dan tinggi badan dalam sentimeter,
     * menghitung BMI, dan mengkategorikannya.
     *
     * Hasil kategorisasi BMI adalah sebagai berikut:
     *
     * - Kurus jika BMI kurang dari 18.5
     * - Normal jika BMI antara 18.5 dan 24.9
     * - Kelebihan Berat Badan jika BMI antara 25.0 dan 29.9
     * - Obesitas jika BMI 30.0 atau lebih
     *
     * Jika berat badan atau tinggi badan yang dimasukkan tidak valid (bernilai
     * negatif), program akan memberikan pesan kesalahan.
     *
     * @param args untuk berat badan gunakan kg dan tinggi badan gunakan cm
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nama;

        System.out.println("Nama : ");
        nama = input.nextInt();


        System.out.println("Kalkulator Indeks Massa Tubuh (BMI)");
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadanCm = input.nextDouble();
        double tinggiBadanM = tinggiBadanCm / 100.0; // Konversi tinggi badan ke meter

        if (beratBadan > 0 && tinggiBadanM > 0) {
            double bmi = beratBadan / (tinggiBadanM * tinggiBadanM);
            System.out.printf("BMI Anda adalah: %.2f%n", bmi);

            if (bmi < 18.5) {
                System.out.println("Anda termasuk dalam kategori Kurus.");
            } else if (bmi < 24.9) {
                System.out.println("Anda termasuk dalam kategori Normal.");
            } else if (bmi < 29.9) {
                System.out.println("Anda termasuk dalam kategori Kelebihan Berat Badan.");
            } else {
                System.out.println("Anda termasuk dalam kategori Obesitas.");
            }
        } else {
            System.out.println("Masukkan berat badan dan tinggi badan yang valid (bernilai positif).");
        }

        input.close();
    }
}
