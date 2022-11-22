/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFFIAH AI NURJANAH
 */
import javax.swing.*;
public class segitiga {
    String alas,tinggi;
    public void input(){
        JOptionPane.showInputDialog("Masukkan Alas : ");
        JOptionPane.showInputDialog("Masukkan Tinggi : ");
    }
    public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }
    public void hasil(){
        JOptionPane.showMessageDialog(null,"0.5 * " + alas + " * " + tinggi + " = " + luas );
    }
}
class luas_segitiga{
    public static void main(String[] args) {
        
    }
}