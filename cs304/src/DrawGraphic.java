
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawGraphic extends JPanel implements KeyListener, ActionListener {
    private int score = 0;
    private int ballx,bally,x1,y1,bounds=30;
    private boolean move_up,move_left,move_dawn,move_right;

    private int hockx =200;

    private boolean play=false;
    private Blocks mapPlay;
    public DrawGraphic(int a, int b) {
        Timer timer = new Timer(5, new ActionListener() {
            //bouncing ball
            @Override
            public void actionPerformed(ActionEvent e) {
                Math.random();
                if (ballx > getWidth() - bounds-10) {
                    move_left = true;
                }
                if (ballx < 0) {
                    move_left = false;
                }
                if (move_left) {
                    ballx -= a;
                } else {
                    ballx += a;
                }
                if (bally > getHeight() - bounds-10) {
                    move_up = true;
                }
                if (bally < 0) {
                    move_up = false;
                }
                if (move_up) {
                    bally -= b;
           }

                else {
                    bally += b;
                }


                repaint();
            }


        });
        timer.start();
    }


    public void paint(Graphics g){
            setBackground(Color.black);
            Graphics2D g1= (Graphics2D) g;
            Graphics2D g2 = (Graphics2D) g;
            Graphics2D g3 = (Graphics2D) g;
        Graphics2D g4 = (Graphics2D) g;
        Graphics2D g5 = (Graphics2D) g;

            super.paint(g1);
        //create blocks
        mapPlay = new Blocks(5, 10);
        //Border
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, 3, 592);
        g2.fillRect(0, 0, 692, 3);
        g2.fillRect(680, 0, 3, 592);


        //hock
        g3.setColor(Color.green);
        g3.fillRect(hockx,550,100,8);

        //coloerd the blocks
        mapPlay.draw((Graphics) g, Color.white);

        //ball
        g1.setColor(Color.blue);
        g1.fillOval(ballx,bally,bounds,bounds);

        //score
        g4.setColor(Color.white);
        g4.setFont(new Font("script",Font.BOLD, 25));
        g4.drawString(""+score, 590,30);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (play) {

            //to show the blocks
            for (int i = 0; i < mapPlay.map.length; i++) {
                for (int j = 0; j < mapPlay.map[i].length; j++) {
                    if (mapPlay.map[i][j] > 0) {
                    }
                }
            }
        }
    }
}
