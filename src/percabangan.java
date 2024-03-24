package percabangan;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        // Variabel
        int nilai;
        Scanner scan = new Scanner(System.in);
        
        // Input
        System.out.println("Masukkan nilai anda:");
        nilai = scan.nextInt();
        
        // Percabangan
        if (nilai > 0) {
            System.out.println("Nilai Anda positif.");
        } else if (nilai < 0) {
            System.out.println("Nilai Anda negatif.");
        } else {
            System.out.println("Nilai Anda nol.");
        }
    }
}
