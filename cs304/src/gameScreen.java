package bounceballgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JFrame;

public class gameScreen {

    public gameScreen(){
        JFrame j =new JFrame();
        thegameH game= new thegameH();
        j.setBounds(10,10,700,600);
        j.setTitle("Bounce Ball");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(game);
        j.addKeyListener(game);
        j.addMouseMotionListener(game);
        j.setResizable(false);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}
