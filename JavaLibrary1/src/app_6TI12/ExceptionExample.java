package app_6TI12;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        
        System.out.println("Nama : Rafli Asari \nKelas : 2IA04 \nNPM : 51422335");
        
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            try {
                System.out.print("Masukkan angka pertama: ");
                int num1 = scanner.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int num2 = scanner.nextInt();

                int result = divide(num1, num2);
                System.out.println("Hasil pembagian: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            } finally {
                System.out.println("Apakah Anda ingin menjalankan program lagi? (y/n)");
                String choice = scanner.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    isRunning = false;
                }
            }
        }
        System.out.println("Program selesai.");
        scanner.close();
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return num1 / num2;
    }
}