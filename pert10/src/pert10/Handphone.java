/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert10;

/**
 *
 * @author Asus
 */
class Handphone extends Telepon implements Kamera, Radio
{
    private String gelombang;
    private float pixel;
    public void ambilGambar()
    {
        System.out.println("Gambar terambil...");
    }
    public void setGelombang(String gel)
    {
        this.gelombang=gel;
    }
    public void setPixel(float pixel)
    {
        this.pixel=pixel;
    }
    public void setNomor(long no)
    {
        this.nomer=no;
    }
}
