import javax.swing.*;
import java.awt.*;

class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name , String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;

    }
    public String getName(){
        return  name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        return name + " - " + phoneNumber;
    }

}

class MyFrame extends JFrame{
    private DefaultListModel <String> listModel;




    private JList <String> contactList;
    JPanel inputPanel , buttonPanel;
    JScrollPane scrollPane;
    JButton addButton , deleteButton;
    JLabel nameLable1 , phoneLable2;
    JTextField nameField , phoneField;

    MyFrame(){

        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel );

        Contact dummyContact = new Contact("Kamal","0774342801");
        listModel.addElement(dummyContact.toString());

        inputPanel = new JPanel(new GridLayout(2,2));
        buttonPanel = new JPanel(new FlowLayout());

        nameLable1 = new JLabel("Name : ");
        phoneLable2 = new JLabel("Phone Number : ");
        nameField = new JTextField();
        phoneField = new JTextField();
        scrollPane = new JScrollPane(contactList);
        scrollPane.setBackground(Color.BLACK);

        inputPanel.add(nameLable1);     inputPanel.add(nameField);
        inputPanel.add(phoneLable2);    inputPanel.add(phoneField);

        addButton = new JButton("Add Contact");
        deleteButton = new JButton("Delete Contact");

        buttonPanel.add(addButton);     buttonPanel.add(deleteButton);

        this.add(inputPanel,BorderLayout.NORTH);
        this.add(scrollPane,BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);

    }

}


class Main{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setTitle("Contact Manager");
        frame.setSize(400,350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}