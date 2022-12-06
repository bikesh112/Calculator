package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {
    JButton button1, button2;
    JLabel label;
    Dashboard(){
        initilize();
        hand();
    }
    public  void initilize(){
        setTitle("Registration page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,150,600,500);
        setResizable(false);
        setLayout(null);

        Color c= new Color(94, 75, 16);
        getContentPane().setBackground(c);

        label=new JLabel("Dashboard after login");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,25));
        label.setBounds(100,40,350,25);
        add(label);

        button1=new JButton("Logout");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.red);
        button1.setBounds(200,200,200,25);
        add(button1);

        button2=new JButton("DELETE");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.red);
        button2.setBounds(300,300,200,25);
        add(button2);
    }
    void hand(){
        button1.addActionListener(this::Back);
    }
    public void Back(ActionEvent e){
        if(e.getSource().equals(button1)){

            this.hide();
            new Login().setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);

    }
}
