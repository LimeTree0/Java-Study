import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        // JLabel = a GUI display area for a string of text, and image, or both


        ImageIcon imageIcon = new ImageIcon("logo.png"); // create ImageIcon instance
        Image image = imageIcon.getImage(); // extract image from imageIcon
        Image changedImg = image.getScaledInstance(100,150,Image.SCALE_SMOOTH); // resize imageIcon
        imageIcon = new ImageIcon(changedImg); // create new ImageIcon instance with resized image
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-25);// set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set Horizontal position of icon+text within label
//        label.setBounds(0,0,250,250); // set x,y position within frame as well as dimensions

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(500,500);
//        jFrame.setLayout(null);
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.add(label);
        jFrame.pack();

    }
}
