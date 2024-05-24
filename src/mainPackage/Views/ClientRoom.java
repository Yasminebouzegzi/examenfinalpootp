package mainPackage.Views;
import java.sql.*;
import java.util.Map.Entry;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import mainPackage.Controllers.Control;
import mainPackage.Model.Model;
import mainPackage.Model.Model.typechambre;


public class ClientRoom {

	private JFrame frame;
	private JTextField textField;
	private Control control;
	private Model model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientRoom window = new ClientRoom(new Control(new Model()));
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
	/*public ClientRoom() {
		initialize();
	}
	
	public ClientRoom(Control control2) {
		// TODO Auto-generated constructor stub
	}*/
	
	public Model getModel() {
	    return model;
	}
	
	public ClientRoom(Control control) {
        this.control = control;
        this.model = control.getModel();
        initialize();
    }
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(226, 187, 152));
		panel_1.setForeground(new Color(210, 180, 140));
		panel_1.setBounds(367, 32, 369, 481);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("                      Votre Numero de telphone ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(41, 11, 318, 31);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(27, 47, 332, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("                                     Chambres          ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(24, 91, 335, 26);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chambre Simple", "Chambre double", "Chambre Twin", "Suite"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(27, 128, 332, 31);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("                      Date Entrée et Date Sortie");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(27, 182, 332, 31);
		panel_1.add(lblNewLabel_4);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(27, 224, 151, 32);
		panel_1.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(202, 224, 157, 32);
		panel_1.add(formattedTextField_1);
		
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroTelephone = textField.getText();
                String typeChambre = (String) comboBox.getSelectedItem();
                if (numeroTelephone.isEmpty() || typeChambre == null) {
                    JOptionPane.showMessageDialog(frame, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
                } else {
                    control.ajouterReservation(numeroTelephone, typeChambre);
                    JOptionPane.showMessageDialog(frame, "Réservation avec succès, veillez attendre une confirmation.", "Succès", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
		
		btnNewButton.setBounds(202, 334, 157, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(
			            frame, // La fenêtre parente
			            "Êtes-vous sûr de vouloir annuler ?", // Le message de confirmation
			            "Confirmation", // Le titre de la boîte de dialogue
			            JOptionPane.YES_NO_OPTION, // Le type d'options (Oui / Non)
			            JOptionPane.QUESTION_MESSAGE // Le type de message
			        );
			        
			        // Gérer la réponse de l'utilisateur
			        if (response == JOptionPane.YES_OPTION) {
			            frame.dispose(); // Fermer la fenêtre actuelle si l'utilisateur confirme
			        }
			}
		});
		btnNewButton_1.setBounds(27, 334, 157, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voire ma reservation ");
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showReservations();
            }
        });
		btnNewButton_2.setBounds(27, 413, 332, 31);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("ENTREZ VOTRE RESERVATION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBounds(0, 0, 558, 43);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ClientRoom.class.getResource("/mainPackage/Views/stock-photo--d-rendering-modern-bedroom-suite-in-hotel-with-tv-and-work-table-1537688963.jpg")));
		lblNewLabel.setBounds(-115, 0, 851, 513);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 0, 46, 14);
		panel.add(lblNewLabel_5);}
		
		 private void showReservations() {
		        StringBuilder reservations = new StringBuilder();
		        for (Entry<Integer, typechambre> entry : model.mapClient.entrySet()) {
		            reservations.append("Téléphone: ").append(entry.getKey())
		                        .append(", Chambre: ").append(entry.getValue())
		                        .append("\n");
		        }

		        JTextArea textArea = new JTextArea(reservations.toString());
		        JScrollPane scrollPane = new JScrollPane(textArea);
		        scrollPane.setPreferredSize(new Dimension(350, 200));

		        JOptionPane.showMessageDialog(frame, scrollPane, "Liste des Réservations", JOptionPane.INFORMATION_MESSAGE);
		    }
		
		
	
}
