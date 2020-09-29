package com.company;

public class Main {

    // n = 5, 5 -> 16 -> 8 -> 4 -> 2 -> 1

    public static void main(String[] args) {
        long sayi = 0;
        long enUzunDongu = 0;
        int enUzunDonguSayisi = 0;
        int donguSayisi = 0;

        for (int i = 2; i < 1000000; i++){
            sayi = i;
            donguSayisi = 0;
            System.out.println(sayi);
            while(sayi != 1){
                sayi = sonrakiSayi(sayi);
                donguSayisi++;
            }
            if (donguSayisi > enUzunDonguSayisi){
                enUzunDonguSayisi = donguSayisi;
                enUzunDongu = i;
            }
        }

        System.out.println("En uzun dongu sayisi: " + enUzunDonguSayisi);
        System.out.println("En uzun dongu: " + enUzunDongu);
    }

    public static long sonrakiSayi(long sayi){
        long sonrakiSayi = 0;
        if (sayi % 2 == 0){
            sonrakiSayi = sayi / 2;
        } else {
            sonrakiSayi = (sayi * 3) + 1;
        }
        return sonrakiSayi;
    }
}
