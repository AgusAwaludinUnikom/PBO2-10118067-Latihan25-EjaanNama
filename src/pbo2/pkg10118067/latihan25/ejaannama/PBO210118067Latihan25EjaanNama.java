/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana canya mengeja nama yang diinputkan
 */
public class PBO210118067Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Ejaan untuk \""+nama + "\" adalah : ");
        for (int i=0; i<nama.length(); i++){
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.substring(i,i+1));
        }
        
    }
    
}
