import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("logo.png");
        Image image = icon.getImage();
        Image changedImage = image.getScaledInstance(50,60,Image.SCALE_SMOOTH);
        icon = new ImageIcon(changedImage);

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this); // original expression if you use this expression, you must use  [implements ActionListener] and [actionPerformed(ActionEvent e)]
//        button.addActionListener(e-> System.out.println("Poo")); // use lambda Expression
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-10);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
//            System.out.println("Poo");
//            button.setEnabled(false); // it make button click once.
            label.setVisible(true);
        }
    }
}
