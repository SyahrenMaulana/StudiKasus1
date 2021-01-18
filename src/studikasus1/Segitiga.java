/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    int luas, alas, tinggi;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("=========");
        System.out.println("Masukan Panjang Alas Segitiga :");
        alas = input.nextInt();
        System.out.println("Masukan Tinggi Segitiga :");
        tinggi = input.nextInt();
        
    }
    
    void hitung(){
        System.out.println("=========");
        System.out.println("Masukan Panjang Alas Segitiga :"+alas);
        System.out.println("Masukan Tinggi Segitiga :"+tinggi);
        luas = (alas * tinggi) / 2;
        
    }
    int hasil(){
        System.out.println("=========");
        System.out.println("Hasil nya :");
        return luas;
        
        
        
    }
}
