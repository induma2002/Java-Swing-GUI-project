import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interface extends JFrame implements ActionListener {

    JCheckBox check1 , check2;
    JTextField textField;

    Interface() {
        check1 = new JCheckBox("Bold");
        check2 = new JCheckBox("Italic");

        textField = new JTextField(20);

        this.setLayout(new FlowLayout());
        this.add(check1);
        this.add(check2);
        this.add(textField);

        check1.addActionListener(this);
        check2.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int bold = Font.PLAIN;
        int italic = Font.PLAIN;

        if (check1.isSelected()){
            bold = Font.BOLD;
        }
        if(check2.isSelected()){
            italic = Font.ITALIC;
        }
        textField.setFont(new Font("",bold|italic,12)) ;


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