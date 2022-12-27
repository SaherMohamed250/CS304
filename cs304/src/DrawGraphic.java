
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawGraphic extends JPanel implements KeyListener, ActionListener {
    private int score = 0;
    private int ballx,bally,bounds=30;
    private boolean move_up,move_left,move_dawn,move_right;
    private Timer timer;
    private int delay =1;
    private int hockx =300;
    private int ballxd = -1;
    private int ballyd = -4;
    private int totalBricks = 40;
    private boolean play=false;
    private Blocks mapPlay;
    public DrawGraphic()
    {
        mapPlay = new Blocks(5, 10);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer=new Timer(delay,this);
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

        //Border
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, 3, 592);
        g2.fillRect(0, 0, 692, 3);
        g2.fillRect(680, 0, 3, 592);


        //hock
        g3.setColor(Color.green);
        g3.fillRect(hockx,550,100,8);

        //colored the blocks
        mapPlay.draw((Graphics2D) g, Color.white);

        //ball
        g1.setColor(Color.blue);
        g1.fillOval(ballx,bally,bounds,bounds);

        //score
        g4.setColor(Color.white);
        g4.setFont(new Font("script",Font.BOLD, 25));
        g4.drawString(""+score, 590,30);

        //won
        if(totalBricks == 0) {
            play = false;
            ballxd = 0;
            ballyd = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("script", Font.BOLD, 30));
            g.drawString("YOU WON,Score: "+score, 260, 300);
        }

        //Game Over
        if(bally > 570) {
            play = false;
            ballxd = 0;
            ballyd = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("script",Font.BOLD, 30));
            g.drawString("YOU LOST,LOOSER , Score: "+score, 130,300);


        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_6) {
            if (hockx > 580) {
                hockx =580;
            } else {
                play = true;
                hockx += 10;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            if (hockx < 10) {
                hockx = 10;
            } else {
                play = true;
                hockx -= 10;
            }
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (hockx > 580) {
                hockx = 580;
            } else {
                play = true;
                hockx += 10;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (hockx < 10) {
                hockx = 10;
            } else {
                play = true;
                hockx -= 10;
            }
        }

        if (e.getKeyCode() == (KeyEvent.VK_P)) {
            play=false;
        }
            repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play)
        {
            if(new Rectangle(ballx, bally, 20, 20).intersects(new Rectangle(hockx, 550, 30, 8)))
            {
                ballyd = -ballyd;
            }
            else if(new Rectangle(ballx, bally, 20, 20).intersects(new Rectangle(hockx + 70, 550, 30, 8)))
            {
                ballyd = -ballyd;
            }

            else if(new Rectangle(ballx, bally, 20, 20).intersects(new Rectangle(hockx + 30, 550, 40, 8)))
            {
                ballyd = -ballyd;
            }

            // check map collision with the ball
            A: for(int i = 0; i<mapPlay.map.length; i++)
            {
                for(int j =0; j<mapPlay.map[0].length; j++)
                {
                    if(mapPlay.map[i][j] > 0)
                    {
                        //scores++;
                        int brickX = j * mapPlay.brickWidth + 80;
                        int brickY = i * mapPlay.brickHeight + 50;
                        int brickWidth = mapPlay.brickWidth;
                        int brickHeight = mapPlay.brickHeight;

                        Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballx, bally, 20, 20);


                        if(ballRect.intersects(brickRect))
                        {
                            mapPlay.setBrickValue(0, i, j);
                            score+=5;
                            totalBricks--;

                            // when ball hit right or left of brick
                            if(ballx + 19 <= brickRect.x || ballx + 1 >= brickRect.x + brickRect.width)
                            {
                                ballxd = -ballxd;
                            }
                            // when ball hits top or bottom of brick
                            else
                            {
                                ballyd = -ballyd;
                            }

                            break A;
                        }
                    }
                }
            }

            ballx += ballxd;
            bally += ballyd;

            if(ballx < 0)
            {
                ballxd = -ballxd;
            }
            if(bally < 0)
            {
                ballyd = -ballyd;
            }
            if(ballx > 650)
            {
                ballxd = -ballxd;
            }

            repaint();
        }
    }
}
