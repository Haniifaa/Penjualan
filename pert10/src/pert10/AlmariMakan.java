/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert10;

/**
 *
 * @author Asus
 */
public class AlmariMakan extends Almari implements Discountable{
    int jmlRoda;float disk;
    public void discount(int harga){
        disk=harga*0.1f;
        System.out.println("diskon: "+disk);
    }
    public float getDiskon(){
        return disk;
    }
    
}
