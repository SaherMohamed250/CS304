
package bounceballgame;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

// you must write the drow graphics class to run the gameplay

public class gameScreen extends JFrame {
    JLabel label = new JLabel("Hello Bounce Ball");
    public gameScreen(){
        super("Game Screen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(700,600);
         this.setLocationRelativeTo(null);
         this.setVisible(true);
             
         label.setBounds(100,100,100,50);
         label.setFont(new Font(null,Font.PLAIN,25));
         this.add(label);
    }
}
