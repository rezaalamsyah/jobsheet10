/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg10;

/**
 *
 * @author santuy
 */
public class latihan3 {
   /* public static void main(String []args){
         int min = 0;
        int[] data = new int[] {-21,90,82,190,-83,74};
        System.out.println("Data pada array:");
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]+"\t");
            if(data[i] < min){
                min = data[i];
            }
        }
        System.out.println("\n Data terkecil dari array adalah " + min);
    } */
    
    public static void main(String[] args) {
        int max = 0;
        int[] data = new int[] {-21,90,82,190,-83,74};
        System.out.println("Data pada array:");
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]+"\t");
            if(data[i] > max){
                max = data[i];
            }
        }
        System.out.println("\n Data terbesar dari array adalah " + max);
    }
    }

