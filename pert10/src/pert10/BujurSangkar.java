/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert10;

/**
 *
 * @author Asus
 */
public class BujurSangkar extends Bangun2D{
    private int sisi;
    public BujurSangkar(int sisi)
    {
        this.sisi = sisi;
        System.out.println("Sisi Bujur Sangkar : "+sisi);
    }
    public void cetakLuas()
    {
        int luas = sisi * sisi;
        System.out.println("Luas Bujur Sangkar : "+luas);
    }
    public void cetakKeliling()
    {
        int keliling = 4 * sisi;
        System.out.println("Keliling Bujur Sangkar : "+keliling);
    }
}
