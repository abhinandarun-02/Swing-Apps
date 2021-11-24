package IPFinder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder extends JFrame implements ActionListener {

    JLabel label;
    JTextField textField;
    JButton button;

    public IPFinder(String title) {

        super(title);

        label = new JLabel("Enter URL:");
        label.setBounds(100, 50, 150, 25);

        textField = new JTextField();
        textField.setBounds(100, 80, 300, 25);

        button = new JButton("Submit");
        button.setBounds(200, 175, 100, 30);
        button.addActionListener(this);

        add(label);
        add(textField);
        add(button);

        setBounds(400, 150, 500, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        String url = textField.getText();
        try {
            InetAddress address = InetAddress.getByName(url);
            String ip = address.getHostAddress();
            JOptionPane.showMessageDialog(this, ip);
        } catch (UnknownHostException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }

    public static void main(String[] args) {
        new IPFinder("IP FINDER");
    }
}
