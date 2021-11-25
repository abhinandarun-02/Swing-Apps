package MarkCalculator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainScreen extends JFrame implements ActionListener {

    JLabel mark1, mark2, mark3, mark4, mark5, total, avg, totalLabel, avgLabel;
    JTextField text1, text2, text3, text4, text5;
    JButton calculate;

    public MainScreen() {

        setBounds(400, 100, 800, 700);


        mark1 = new JLabel("Mark 1 : ");
        mark1.setFont(new Font("Arial", Font.BOLD, 24));
        mark2 = new JLabel("Mark 2 : ");
        mark2.setFont(new Font("Arial", Font.BOLD, 24));
        mark3 = new JLabel("Mark 3 : ");
        mark3.setFont(new Font("Arial", Font.BOLD, 24));
        mark4 = new JLabel("Mark 4 : ");
        mark4.setFont(new Font("Arial", Font.BOLD, 24));
        mark5 = new JLabel("Mark 5 : ");
        mark5.setFont(new Font("Arial", Font.BOLD, 24));

        mark1.setBounds(200, 30, 150, 30);
        mark2.setBounds(200, 100, 150, 30);
        mark3.setBounds(200, 170, 150, 30);
        mark4.setBounds(200, 240, 150, 30);
        mark5.setBounds(200, 310, 150, 30);

        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();

        text1.setBounds(400, 30, 150, 30);
        text2.setBounds(400, 100, 150, 30);
        text3.setBounds(400, 170, 150, 30);
        text4.setBounds(400, 240, 150, 30);
        text5.setBounds(400, 310, 150, 30);

        total = new JLabel("TOTAL : ");
        avg = new JLabel("AVERAGE : ");
        total.setFont(new Font("Arial", Font.BOLD, 24));
        avg.setFont(new Font("Arial", Font.BOLD, 24));
        total.setBounds(200, 430, 150, 30);
        avg.setBounds(200, 500, 150, 30);

        calculate = new JButton("Calculate");
        calculate.setBounds(300, 370, 100, 30);
        calculate.addActionListener(this);

        totalLabel = new JLabel();
        avgLabel = new JLabel();
        totalLabel.setFont(new Font("Arial", Font.BOLD, 24));
        avgLabel.setFont(new Font("Arial", Font.BOLD, 24));

        totalLabel.setBounds(400, 430, 150, 30);
        avgLabel.setBounds(400, 500, 150, 30);
        totalLabel.setBorder(BorderFactory.createLineBorder(Color.green));
        avgLabel.setBorder(BorderFactory.createLineBorder(Color.green));

        super.add(mark1);
        super.add(mark2);
        super.add(mark3);
        super.add(mark4);
        super.add(mark5);
        super.add(text1);
        super.add(text2);
        super.add(text3);
        super.add(text4);
        super.add(text5);
        super.add(total);
        super.add(avg);
        super.add(totalLabel);
        super.add(avgLabel);
        super.add(calculate);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(null);
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int m1 = Integer.parseInt(text1.getText());
            int m2 = Integer.parseInt(text2.getText());
            int m3 = Integer.parseInt(text3.getText());
            int m4 = Integer.parseInt(text4.getText());
            int m5 = Integer.parseInt(text5.getText());

            int sum = m1 + m2 + m3 + m4 + m5;
            double avg = sum / 5f;

            totalLabel.setText(Integer.toString(sum));
            avgLabel.setText(Double.toString(avg));

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }

    public static void main(String[] args) {
        new MainScreen();
    }

}
