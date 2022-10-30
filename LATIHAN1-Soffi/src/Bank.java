/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFFIAH AI NURJANAH
 */
public class Bank {

int SaldoSaya;
int total;
int jumlah;
Bank(int saldo){
SaldoSaya = saldo;
}
    void GetSaldo(){
        System.out.println("Selamat datang di Bank BJB");
        System.out.println("Saldo saat ini : Rp "+SaldoSaya);
    }
    void SimpanUang(int simpan){
        System.out.println("Simpan uang : Rp");
        System.out.println("Saldo saat ini : Rp "+total);
    }
    void AmbilUang(int ambil){
        System.out.println("Ambil uang : Rp ");
        System.out.println("Saldo saat ini : Rp "+jumlah);
    }
}
