/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert9;

/**
 *
 * @author D2A
 */
public class TesBank {
    public static void main (String[] args){
        int i;
        Account [] accounts = new Account[100];
        accounts[0] = new Account(2000000);
        accounts[1] = new Account(0);
        for (i = 0; i<2; i++) {
            double b = accounts[i].getBalance();
            System.out.println("Saldo akhir account ke " + i +" = " +b);
            try
            {
                accounts[i].withdraw(1000000);
            }
            catch(OverdraftException ode)
            {
                System.err.println("" +ode);
            }
        }
    } 
    
}
