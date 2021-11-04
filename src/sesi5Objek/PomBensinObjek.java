/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi5Objek;
import java.util.Scanner;
/**
 *
 * @author riseloka
 */

public class PomBensinObjek {
    public int getHargaBahanBakar(int bahanBakar) {
        switch (bahanBakar) {
            case 1:
                return 7650;
            case 2:
                return 9000;
            case 3:
                return 12000;
            case 4:
                return 9500;
            case 5:
                return 11150;
            default:
                return 0;
        }
    }
    
    public void metodeLiteran(int bahanBakar, int liter) {
        int harga = getHargaBahanBakar(bahanBakar);
        int total = liter * harga;
        
        System.out.println("Total yang harus dibayar: Rp." + total);
    }
    
    public void metodeNominal(int bahanBakar, int nominal) {
        int harga = getHargaBahanBakar(bahanBakar);
        float liter = (float)nominal / harga;
        System.out.println("Untuk pembelian dengan nominal Rp." + nominal + " Mendapatkan " + liter + " Liter.");
    }
    
    public void bahanBakar() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== Selamat Datang di Pom Bensin ====");
        System.out.println("Silahkan Pilih Bahan Bakar:");
        System.out.println("(1)-> Pertalite \n(2)-> Pertamax \n(3)-> Pertamax Turbo \n(4)-> Dexlite \n(5)-> Pertamina Dex");
        String bahanBakar = input.nextLine();
        
        if (Integer.parseInt(bahanBakar) > 5 || Integer.parseInt(bahanBakar) < 1) {
           System.out.println("Bahan bakar tidak tersedia!");
           return;
        }
        
        System.out.println("Masukan Jumlah Liter (1, 2,...), atau (A) Untuk memasukan Nominal.");
        String metode = input.nextLine();
        
        if ("A".equals(metode))  {
            System.out.println("Masukan nominal (Rp.)");
            int nominal = input.nextInt();
            metodeNominal(Integer.parseInt(bahanBakar), nominal);
        } else if (metode.matches("\\d+")) {
            metodeLiteran(Integer.parseInt(bahanBakar), Integer.parseInt(metode));
        } else {
            System.out.println("Kode yang kamu masukan tidak sesuai!");
        }
    }
 }
