/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ppert1_51422335;
import java.util.Scanner;
/**
 *
 * @author rafli
 */
public class PPert1_51422335 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
        if (nilai >= 60) {
            System.out.println("Selamat, Anda LULUS!");
    } else {
        System.out.println("Maaf, Anda TIDAK LULUS.");
        }
    }
}
