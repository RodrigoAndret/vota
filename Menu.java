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

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnSejaBemVindo;
	private JTextPane txtpnSelecioneAOpo;
	private JTextPane textPane;

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
		contentPane.setBackground(new Color(192, 192, 192));
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
				Votar1 v1 = new Votar1();
				v1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.setBounds(506, 284, 400, 300);
		contentPane.add(btnNewButton);
		
		txtpnSejaBemVindo = new JTextPane();
		txtpnSejaBemVindo.setText("Seja Bem Vindo!");
		txtpnSejaBemVindo.setForeground(new Color(0, 0, 0));
		txtpnSejaBemVindo.setFont(new Font("Swis721 Cn BT", Font.PLAIN, 52));
		txtpnSejaBemVindo.setEditable(false);
		txtpnSejaBemVindo.setBackground(Color.LIGHT_GRAY);
		txtpnSejaBemVindo.setBounds(289, 52, 441, 89);
		contentPane.add(txtpnSejaBemVindo);
		
		txtpnSelecioneAOpo = new JTextPane();
		txtpnSelecioneAOpo.setText("Selecione a opção desejada");
		txtpnSelecioneAOpo.setForeground(Color.BLACK);
		txtpnSelecioneAOpo.setFont(new Font("Swis721 Cn BT", Font.BOLD, 52));
		txtpnSelecioneAOpo.setEditable(false);
		txtpnSelecioneAOpo.setBackground(Color.LIGHT_GRAY);
		txtpnSelecioneAOpo.setBounds(175, 152, 611, 76);
		contentPane.add(txtpnSelecioneAOpo);
		
		textPane = new JTextPane();
		textPane.setText("____________________________________________________________________________________________________________________________________________________________");
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setEditable(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(20, 231, 964, 20);
		contentPane.add(textPane);
	}

}
