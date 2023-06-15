package design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("CONSULTAR VOTAÇÕES");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Votacoes_Anteriores_1 v1 = new Votacoes_Anteriores_1();
				v1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setOpaque(true);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		btnNewButton_1_1.setBackground(new Color(225, 81, 96));
		btnNewButton_1_1.setBounds(57, 284, 380, 300);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("VOTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Votar1 votar1 = new Votar1();
				votar1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.setBounds(506, 284, 400, 300);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Selecione uma opção:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 52));
		lblNewLabel.setBounds(203, 110, 536, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnMenuAdm = new JButton("Menu Adm.");
		btnMenuAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMenuAdm.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenuAdm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMenuAdm.setBackground(new Color(148, 189, 235));
		btnMenuAdm.setBounds(10, 11, 144, 33);
		contentPane.add(btnMenuAdm);
	}
}