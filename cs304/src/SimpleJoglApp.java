

import javax.swing.*;


public class SimpleJoglApp {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        DrawGraphic draw = new DrawGraphic(5,5);

        j.setBounds(10, 10, 700, 600);
        j.setTitle("BOUNCE BALL");
        j.setResizable(false);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(draw);
        j.setVisible(true);
    }

}
