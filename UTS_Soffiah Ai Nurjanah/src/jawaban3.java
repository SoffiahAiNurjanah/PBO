/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFFIAH AI NURJANAH
 */
public class jawaban3 {
    public static void main(String[] args) {
        
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Eko", values);
        
        sayCongrats("Budi", 80, 90, 76, 80);
        
    }
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;
        
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
