/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Scanner;


public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        //Deklarasi
        Double a, b, c;
        
        //membuat scanner baru
        Scanner baca = new
    Scanner(System.in);
        
        //input
        System.out.println("Program Kalkulator");
        System.out.print("Input Angka pertama: " );
        a = baca.nextDouble();
        System.out.print("Input Angka kedua: " );
        b = baca.nextDouble();
        System.out.println("Pilih Salah Satu Operasi " + 
                "\n1. Penjumlahan" +
                "\n2. Pengurangan" +
                "\n3. Perkalian" +
                "\n4. Pembagian" );
        System.out.print("Masukkan salah satu angka operator diatas: ");
        
        //Program
        double somethin = baca.nextDouble();
        double Penjumlahan = 1;
        double Pengurangan = 2;
        double Perkalian = 3;
        double Pembagian = 4;
        
    if (somethin == Penjumlahan) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c); }
    else if (somethin == Pengurangan) {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c); }
    else if (somethin == Perkalian) {
            c = a * b;
            System.out.println(a + " x " + b + " = " + c); }
    else if (somethin == Pembagian) {
            c = a / b;
            System.out.println(a + " : " + b + " = " + c); }        
        
         
     
    }
    
}
