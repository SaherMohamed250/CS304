/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceballgame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MARAM
 */
public class instructuionsButton extends JFrame  implements ActionListener {
    
     private JButton backButton =new JButton("Back");
     
      public instructuionsButton() {
         super("Instructions menu ");
         this.setSize(380,440);
         this.setVisible(true);
         this.setLayout(null);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backButton.setBackground(Color.white);
        backButton.setBounds(260, 370, 100, 35);
        backButton.addActionListener(this);
        this.add(backButton);   
         
//           //add backgroud image 
         ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/instructions.jpg"));
         Image image2 =image1.getImage().getScaledInstance(380, 440, Image.SCALE_DEFAULT);
         ImageIcon image3 = new ImageIcon(image2);
        
          JLabel displayField = new JLabel(image3);
        displayField.setBounds(0,0,380,440);
        this.add(displayField);
   
         
          this.setResizable(false);
         this.setLocationRelativeTo(null);
    
}

    @Override
    public void actionPerformed(ActionEvent a) {
         if(a.getSource()==backButton){ // to return to the start menu
            new Menu();
            this.dispose(); // it's means give up resources of the frame 
        }
    }
}