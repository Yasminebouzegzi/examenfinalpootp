package mainPackage.Views;
import mainPackage.Views.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.util.EventListener;
public class View {

	JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 270, 886, 193);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(153, 153, 153));
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordField.setBounds(265, 110, 611, 20);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe :");
		lblNewLabel_1.setBackground(new Color(153, 153, 153));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(45, 113, 831, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBackground(new Color(153, 153, 153));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(45, 55, 831, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 153, 153));
		textField.setForeground(Color.BLACK);
		textField.setBounds(265, 46, 611, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
		comboBox.setBackground(new Color(153, 153, 153));
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Client", "Administrateur"}));
		comboBox.setBounds(45, 22, 416, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Prénom :");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3.setBackground(new Color(153, 153, 153));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(45, 81, 831, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(153, 153, 153));
		textField_1.setForeground(Color.BLACK);
		textField_1.setBounds(265, 77, 611, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		//ajouter un evenement
		
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				   String role = (String) comboBox.getSelectedItem();
	                frame.dispose();
	                if ("Administrateur".equals(role)) {
	                    AdminWindow adminWindow = new AdminWindow();
	                    adminWindow.getFrame().setVisible(true);
	                } else if ("Client".equals(role)) {
	                    ClientWindow clientWindow = new ClientWindow();
	                    clientWindow.getFrame().setVisible(true);
	                }
			
			
				 
				 
			 }
			
		});
		
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(87, 87, 87));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(661, 144, 215, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("yasmine");
		lblNewLabel.setBounds(0, -29, 886, 492);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon(View.class.getResource("/mainPackage/Views/stock-vector-management-icon-with-white-background-vector-stock-illustration-2393939899.jpg")));
		panel.add(lblNewLabel);
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
