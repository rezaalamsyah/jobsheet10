/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg10;

import java.util.Scanner;

/**
 *
 * @author santuy
 */
public class latihan4 {
 public static void main(String []args ){
        Scanner input = new Scanner(System.in);
        String cari;
        System.out.print("masukkan sebuah kata/kalimat:");
        cari = input.nextLine();
        
        int a = 0;
        for (int i = 0; i < cari.length(); i++){
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat diatas adalah "+a);
    }
 } 
