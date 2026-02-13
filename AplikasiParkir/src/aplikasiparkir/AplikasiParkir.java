/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasiparkir;
import  aplikasiparkir.koneksi;

public class AplikasiParkir {
    public static void main(String[] args) {
         koneksi.getConnection();
         new LoginPanel().setVisible(true);
    }
    
}
