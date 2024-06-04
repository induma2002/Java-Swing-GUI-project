import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interface extends JFrame implements ActionListener {

    JRadioButton rb1 , rb2 , rb3;
    JLabel lable;

    Interface() {

        ButtonGroup grup = new ButtonGroup();
        rb1 = new JRadioButton("Orange");
        rb2 = new JRadioButton("Mango");
        rb3 = new JRadioButton("Apple");

        grup.add(rb1);
        grup.add(rb2);
        grup.add(rb3);

        lable = new JLabel("Not Select");

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(lable);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (rb1.isSelected()){
            lable.setText(rb1.getText());
        }
        if (rb2.isSelected()){
            lable.setText(rb2.getText());
        }
        if (rb3.isSelected()){
            lable.setText(rb3.getText());
        }


    }
}


class main {

    public static void main(String[] args) {
        Interface frame = new Interface();

        frame.setTitle("Test");
        frame.setSize(400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);


    }
}