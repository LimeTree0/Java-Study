import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("logo.png");
        Image image = icon.getImage();
        Image changedImage = image.getScaledInstance(50,60,Image.SCALE_SMOOTH);
        icon = new ImageIcon(changedImage);


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(750,750);
        jFrame.setVisible(true);
        greenPanel.add(label);
        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);


    }
}
