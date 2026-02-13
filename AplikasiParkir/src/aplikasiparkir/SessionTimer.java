/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiparkir;

import javax.swing.JLabel;
import javax.swing.Timer;


/**
 *
 * @author Lenovo
 */
public class SessionTimer {
     private Timer timer;

    public void start(JLabel lblSession, JLabel lblDateTime) {

        timer = new Timer(1000, e -> {

            long sekarang = System.currentTimeMillis();
            long durasi = sekarang - Session.loginTime;

            long detik = durasi / 1000 % 60;
            long menit = durasi / (1000 * 60) % 60;
            long jam   = durasi / (1000 * 60 * 60);

            lblSession.setText(
                String.format("Session: %02d:%02d:%02d", jam, menit, detik)
            );

            java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("EEEE, dd MMMM yyyy | HH:mm:ss");

            lblDateTime.setText(sdf.format(new java.util.Date()));
        });

        timer.start();
    }

    public void stop() {
        if (timer != null) {
            timer.stop();
        }
    }
}
