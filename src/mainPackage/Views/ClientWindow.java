package mainPackage.Views;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClientWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientWindow window = new ClientWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 183, 563);
		lblNewLabel.setIcon(new ImageIcon(ClientWindow.class.getResource("/mainPackage/Views/istockphoto-1459235752-1024x1024.jpg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBounds(180, 112, 606, 451);
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.setForeground(Color.PINK);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("            BIENVENUE DANS EMIA !");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(144, 5, 294, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Numero De Telphone");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3.setBounds(110, 218, 143, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nom");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_4.setBounds(110, 103, 156, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prenom");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_5.setBounds(110, 164, 49, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Code Postale");
		lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_7.setBounds(110, 278, 112, 14);
		panel_1.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(413, 367, 156, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("En arrière");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(226, 367, 156, 23);
		panel_1.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(326, 84, 212, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(326, 145, 212, 34);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(326, 199, 212, 34);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(326, 267, 212, 34);
		panel_1.add(passwordField);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 frame.dispose();
				 View view = new View(); // Create a new instance of View
				 view.frame.setVisible(true); // Show the View frame
				 
			 }
			
		});
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(ClientWindow.class.getResource("/mainPackage/Views/istockphoto-1459235752-1024x1024.jpg")));
		lblNewLabel_6.setBounds(180, 0, 606, 112);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(384, 49, 49, 14);
		panel.add(lblNewLabel_2);
	}
	
	public Window getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
	
	
	public String getNom() {
		return textField.getText();
	}
	
	public String getPrenom() {
		return textField_1.getText();
	}
	
	public String getNumeroTelephone() {
		return textField_2.getText();
	}
	
	public String getCodePostale() {
		return new String(passwordField.getPassword());
	}

	
}
