/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karkulator;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Karkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Karkulator Sederhana");
        System.out.println("---------------------------------------");
        Scanner inputUser;
        //input angka
        inputUser = new Scanner(System.in);
        float a, b, hasil;
        String operator;
        System.out.println("Masukkan Angka Pertama = ");
        a = inputUser.nextFloat();
        System.out.println("Masukkan Angka Kedua = ");
        b = inputUser.nextFloat();
        System.out.println("Masukkan Simbol = ");
        operator = inputUser.next();
        //pilihan
        switch (operator){
            case "+":
                //operator penjumlahan
                hasil = a + b;
                System.out.println(a+" + "+b+" = "+hasil);
                break;
            case "-":
                //operator pengurangan
                hasil = a - b;
                System.out.println(a+" - "+b+" = "+hasil);
                break;
            case "*":
                //operator perkalian
                hasil = a * b;
                System.out.println(a+" * "+b+" = "+hasil);
                break;
            case "/":
                //operator pembagian
                hasil = a / b;
                System.out.println(a+" / "+b+" = "+hasil);
                break;
            case "%":
                //operator sisa bagi
                hasil = a % b;
                System.out.println(a+" % "+b+" = "+hasil);
                break;
        }
    }
    
}
