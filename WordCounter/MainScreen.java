package WordCounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {

    JFrame frame;
    JTextArea textArea;
    JLabel label;
    JButton button;
    JScrollPane scrollPane;

    public MainScreen() {

        frame = new JFrame("Word Counter");

        label = new JLabel("WORD COUNTER", SwingConstants.CENTER);
        label.setBounds(125, 45, 250, 25);

        textArea = new JTextArea("");
        textArea.setBounds(100, 100, 300, 200);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(100, 100, 500 ,500);

        button = new JButton("Submit");
        button.setBounds(200, 360, 100, 15);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (textArea.getText()=="")
                        JOptionPane.showMessageDialog(null, "Try Again!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    String [] res = textArea.getText().split("\\s");
                    label.setText("You have entered " + res.length + " words");

            }
        });


        frame.setLayout(null);
        frame.setBounds(200, 150, 500, 400);
        frame.add(label);
        frame.add(textArea);
        frame.add(button);
        frame.getContentPane().add(scrollPane);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\WINTECH\\Pictures\\Saved Pictures\\JAQL\\Light Icon.png");
        frame.setIconImage(icon);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainScreen();
    }
}
