package mainPackage.Views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminWindow {

    private JFrame frame;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminWindow window = new AdminWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminWindow() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        
        JButton btnNewButton = new JButton("Verif");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(42, 148, 486, 23);
        panel.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(288, 91, 240, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Numero De Telephone Du Client  :");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_2.setBounds(42, 88, 202, 25);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_1 = new JLabel("        ADMINISTRATEUR ");
        lblNewLabel_1.setBounds(134, 11, 323, 31);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(0, 0, 584, 411);
        lblNewLabel.setIcon(new ImageIcon(AdminWindow.class.getResource("/mainPackage/Views/james-lee-YpDkIh137ws-unsplash.jpg")));
        panel.add(lblNewLabel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
