/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SOFFIAH AI NURJANAH
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank saldo = new Bank(100000);
        
        saldo.GetSaldo();
        saldo.SimpanUang(500000);
        saldo.AmbilUang(150000);
    }
    
}
