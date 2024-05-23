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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import mainPackage.Controllers.Control;
import mainPackage.Model.Model;



public class AdminWindow {
	public Control control;
	public AdminWindow(Control control) {
        this.control = control;
    }
	public Model model;
	public AdminWindow(Model model) {
        this.model = model;
    }
	
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
        
        JButton btnNewButton_5 = new JButton("Supprimer");
        btnNewButton_5.setBounds(376, 278, 152, 78);
        panel.add(btnNewButton_5);
        
        JButton btnNewButton_4 = new JButton("Modifier");
        btnNewButton_4.setBounds(200, 278, 142, 78);
        panel.add(btnNewButton_4);
        
        JButton btnNewButton_3 = new JButton("Ajouter");
        btnNewButton_3.setBounds(42, 278, 137, 78);
        panel.add(btnNewButton_3);
        
       btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroTelephone = textField.getText();
                
                // Récupération du type de chambre correspondant au numéro de téléphone
                Model.typechambre typeChambre = model.mapClient.get(Integer.parseInt(numeroTelephone));

                // Vérification si le type de chambre est null (numéro de téléphone non trouvé)
                if (typeChambre != null) {
                    control.ajouterReservation(numeroTelephone, typeChambre.toString());
                } else {
                    System.out.println("Aucune réservation trouvée pour ce numéro de téléphone.");
                    // Afficher un message à l'administrateur indiquant que le numéro de téléphone n'est pas trouvé
                    // JOptionPane.showMessageDialog(frame, "Aucune réservation trouvée pour ce numéro de téléphone.");
                }
            }
        });
        
        JButton btnNewButton_2 = new JButton("Rufuser");
        btnNewButton_2.setBounds(288, 213, 240, 38);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_1 = new JButton("    Accepter ");
        btnNewButton_1.setBounds(45, 213, 219, 38);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Verif");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(42, 148, 486, 38);
        panel.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroTelephone = textField.getText();
                control.verifChambre(numeroTelephone);
            }
        });
        
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
