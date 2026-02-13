/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiparkir;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class insertlog {
    public static void tambahLog(int idUser, String aktivitas) {
    String sql = "INSERT INTO tb_log_aktivitas (id_user, aktivitas, waktu_aktivitas) VALUES (?, ?, NOW())";

    try {
        Connection conn = koneksi.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setInt(1, idUser);
        pst.setString(2, aktivitas);
        pst.executeUpdate();

        pst.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menyimpan log: " + e.getMessage());
    }
    }}