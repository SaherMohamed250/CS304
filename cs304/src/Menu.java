package bounceballgame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class  Menu extends JFrame implements ActionListener {
    private JButton startButton =new JButton("Start");
    private JButton instButton =new JButton("Instructions");
    private JButton exitButton =new JButton("Exit");
    JLabel displayField ;
    
     
    
    public  Menu(){
        super("Bounce Ball");
        this.setSize(350,410);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //add bouttons
        startButton.setBackground(Color.white);
       instButton.setBackground(Color.white);
        exitButton.setBackground(Color.white);
        startButton.setBounds(120, 210, 100, 35);
        instButton.setBounds(110, 260, 120, 35);
        exitButton.setBounds(120, 310, 100, 35);
        startButton.addActionListener(this);
       instButton.addActionListener(this);
       exitButton.addActionListener(this);
       this.add(startButton);
       this.add(instButton);
       this.add(exitButton);
          
         //add backgroud image 
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/menu.jpg"));
         Image image2 =image1.getImage().getScaledInstance(350, 410, Image.SCALE_DEFAULT);
         ImageIcon image3 = new ImageIcon(image2);
        
         displayField = new JLabel(image3);
        displayField.setBounds(0,0,350,410);
        this.add(displayField);
   
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
//    public void paint(Graphics g){
//        g.setFont(new Font(name,13,22));
//        g.setColor(Color.red);
//        g.drawString(name, 120, 30);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        //when this is called the button is clicked it's going to get wherever that click was from 
        if(e.getSource()==startButton){
            new DrawGraphic();
            this.dispose(); // it's means give up resources of the frame 
        }
        if(e.getSource()==exitButton){
            System.exit(score);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(e.getSource()==instButton){
             new instructuionsButton();
            this.dispose();
        }
  }
    
}
