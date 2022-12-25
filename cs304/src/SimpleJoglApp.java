

import com.sun.opengl.util.FPSAnimator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.media.opengl.*;
import javax.swing.Timer;


public class SimpleJoglApp {

    public static void main(String[] args) {
         JFrame j = new JFrame();
        DrawGraphic draw =new DrawGraphic();

        j.setBounds(10,10,700,600);
        j.setTitle("BOUNCE BALL");
        j.setResizable(false);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(draw);
        j.setVisible(true);
    }

   
