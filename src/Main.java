import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interface extends JFrame implements ActionListener {



    Interface() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {



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