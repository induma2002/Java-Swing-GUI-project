import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Interface extends JFrame implements ActionListener {
    JButton bt1 , bt2 , bt3 , bt4 , bt5 , pbt6 , pbt7 , pbt1 , pbt2 , pbt3;
    JPanel panel1 , panel2;


    Interface() {
        bt1 = new JButton("North");
        bt2 = new JButton("South");
        bt3 = new JButton("East");
        bt4 = new JButton("West");
        bt5 = new JButton("Center");

        pbt1 = new JButton("panelButtonOne");
        pbt2 = new JButton("panelButtonTwo");
        pbt3 = new JButton("panelButtonThree");
        pbt6 = new JButton("panelButtonThree");
        pbt7 = new JButton("panelButtonThree");



        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,1));
        panel1.setBackground(Color.darkGray);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,1));
        panel2.setBackground(Color.BLUE);

        panel1.add(pbt1);
        panel1.add(pbt2);
        panel1.add(pbt3);

       panel2.add(pbt6);
       panel2.add(pbt7);


        this.add(bt1,BorderLayout.NORTH);
        this.add(bt2,BorderLayout.SOUTH);
        //this.add(bt3,BorderLayout.EAST);
        this.add(bt4,BorderLayout.WEST);
        this.add(panel1,BorderLayout.CENTER);
        this.add(panel2,BorderLayout.EAST);





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