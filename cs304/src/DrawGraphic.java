
import javax.swing.*;
import java.awt.*;
import java.awt.Panel;

public class DrawGraphic extends Panel {
    private int score = 0;
    private int hockx =200;
    private int ballx=200;
    private int bally=200;

    public void paint(Graphics g){
        
        setBackground(Color.BLACK);

        //Border
        g.setColor(Color.red);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //hock
        g.setColor(Color.green);
        g.fillRect(hockx,550,100,8);

       //ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballx,bally,20,20);
        
        //score
         g.setColor(Color.white);
        g.setFont(new Font("serif",Font.BOLD, 25));
        g.drawString(""+score, 590,30);
    }
}
