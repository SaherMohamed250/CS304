
import javax.swing.*;
import java.awt.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawGraphic extends JPanel implements KeyListener ,ActionListener{
    private int score = 0;
    private int hockx =200;
    private int ballx=200;
    private int bally=200;
    private boolean play=false;
     private Blocks mapPlay;


    public void paint(Graphics g){
        
        setBackground(Color.BLACK);

        //create blocks 
        mapPlay = new Blocks(5, 10);
        //Border
        g.setColor(Color.red);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //hock
        g.setColor(Color.green);
        g.fillRect(hockx,550,100,8);
        
        //coloerd the blocks
        mapPlay.draw((Graphics) g, Color.white);
       //ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballx,bally,20,20);
        
        //score
         g.setColor(Color.white);
        g.setFont(new Font("script",Font.BOLD, 25));
        g.drawString(""+score, 590,30);
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
