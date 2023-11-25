/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert10;

/**
 *
 * @author Asus
 */
public class MebelDemo {
    public static void main(String[] args) {
        AlmariMakan am = new AlmariMakan();
        am.bahan="jati";
        am.harga=3000000;
        am.roda=true;
        am.jmlRoda=4;
        System.out.println("---Almari Makan---");
        System.out.println("Bahan : "+am.bahan);
        System.out.println("Harga : "+am.harga);
        System.out.println("Roda : "+am.jmlRoda);
        System.out.println("harga : "+am.harga);
        am.discount(am.harga);
        System.out.println("bayar :"+(am.harga-am.disk));
        
        
        AlmariPakaian ap = new AlmariPakaian();
        ap.bahan="stainless";
        ap.harga=2500000;
        ap.roda=true;
        ap.jmlPintu=4;
        System.out.println("---Almari Pakaian---");
        System.out.println("Bahan : "+ap.bahan);
        System.out.println("Harga : "+ap.harga);
        System.out.println("pintu : "+ap.jmlPintu);
        System.out.println("harga : "+ap.harga);
        ap.discount(ap.harga);
        System.out.println("bayar :"+(ap.harga-ap.disk));
        
        
        MejaMakan mm = new MejaMakan();
        mm.bahan="mahoni";
        mm.harga=4000000;
        mm.jmlKursi=4;
        System.out.println("---Meja Makan---");
        System.out.println("Bahan : "+mm.bahan);
        System.out.println("Harga : "+mm.harga);
        System.out.println("kursi : "+mm.jmlKursi);
        System.out.println("bayar : "+mm.harga);
        
        
        MejaTamu mt = new MejaTamu();
        mt.bahan="bengkirai";
        mt.harga=5000000;
        mt.bentukKaca="oval";
        System.out.println("---Meja Tamu---");
        System.out.println("Bahan : "+mt.bahan);
        System.out.println("Harga : "+mt.harga);
        System.out.println("bentuk : "+mt.bentukKaca);
        System.out.println("harga : "+mt.harga);
        mt.discount(mt.harga);
        System.out.println("bayar :"+(mt.harga-mt.disk));
    }
}
