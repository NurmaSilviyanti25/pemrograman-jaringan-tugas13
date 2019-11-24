/*
 * pemrograman-jaringan-tugas13

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Nov 19, 2019 10:08:35 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pemrograman.jaringan.tugas13;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author od3ng
 */
public class PemrogramanJaringanTugas13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedImage capture = null;
        int width = 400;
        int height = 400;
        try {
            Robot robo = new Robot();
            // delay untuk mengatur layar
            robo.delay(1000);
            // mulai capture
            capture = robo.createScreenCapture(new Rectangle(100, 100, width, height));
            if (capture != null) {
                Canvas panel = new Canvas(capture);
                JFrame frame = new JFrame("Test Capture");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        } catch (AWTException ex) {
        }
    }
}
