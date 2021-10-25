import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //JFrame = a GUI window to add components to

        /*
        JFrame jFrame = new JFrame(); //creates a frame. there is nothing in JFrame constructor so, you can make your own Frame
        jFrame.setTitle("JFrame title goes here"); // sets title of frame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit of application
        jFrame.setResizable(false); // prevent frame from being resized
        jFrame.setSize(420,420); // sets the x-dimension, and y-dimension of frame
        jFrame.setVisible(true);  // make frame visible

        ImageIcon imageIcon = new ImageIcon("logo.png"); // Create an ImageIcon
        jFrame.setIconImage(imageIcon.getImage()); // change icon of Frame
//        jFrame.getContentPane().setBackground(Color.green); // Change color of background using set values
        jFrame.getContentPane().setBackground(new Color(255,255,255)); // Change color of background using Color instance
        */
         MyFrame myFrame = new MyFrame();
    }
}
