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
public class latihan2 {
 public static void main(String []args){
        int cari;
        boolean found = false;
        int[] data = new int[] {8,90,56,90,87,76,42};
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan data yang ingin dicari:");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++){
            if(cari == data[i]){
                found = true;
                System.out.println("Data ditemukan pada indeks ke-" + i);
            }
        }
        if (found != true){
            System.out.println("Data tidak ditemukan!");
        }
    }
 }   

