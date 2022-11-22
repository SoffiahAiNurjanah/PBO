/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SOFFIAH AI NURJANAH
 */
import java.io.*;
public class InputMerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader (
                new InputStreamReader(System.in));
        String merk;
        System.out.print("Masukan merk : ");
        merk = input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
        
    }
    
}
