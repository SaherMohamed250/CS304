
import com.sun.opengl.util.FPSAnimator;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.media.opengl.*;
import javax.swing.Timer;


public class SimpleJoglApp throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        DrawGraphic draw = new DrawGraphic(5,5);

        j.setBounds(10, 10, 700, 600);
        j.setTitle("BOUNCE BALL");
        j.setResizable(false);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(draw);
        j.addKeyListener(draw);
        j.addMouseMotionListener(draw);
        j.setVisible(true);
        Scanner scanner = new Scanner(System.in);
        File file = new File("file_example_WAV_2MG.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        clip.loop(10000);
        String response = scanner.next();
    }

}
