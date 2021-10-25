import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("this title goes here"); // sets title of frame
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit of application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420,420); // sets the x-dimension, and y-dimension of frame
        this.setVisible(true);  // make frame visible

        ImageIcon imageIcon = new ImageIcon("logo.png"); // Create an ImageIcon
        this.setIconImage(imageIcon.getImage()); // change icon of Frame
//        this.getContentPane().setBackground(Color.green); // Change color of background using set values
        this.getContentPane().setBackground(new Color(255,255,255)); // Change color of background using Color
    }
}
