package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credits {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits window = new Credits();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Credits() {
		initialize();
	}

	public void pisca() {
		if(frame.isVisible() == true) {
			frame.setVisible(false);
		}else if (frame.isVisible() == false) {
			frame.setVisible(true);
		}
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 53));
		lblCalculadora.setBounds(84, 12, 290, 71);
		frame.getContentPane().add(lblCalculadora);
		
		JLabel lblFeitaPorLucca = new JLabel("Feita por: Lucca Bringhenti");
		lblFeitaPorLucca.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFeitaPorLucca.setBounds(73, 94, 307, 49);
		frame.getContentPane().add(lblFeitaPorLucca);
		
		JLabel lblJava = new JLabel("Java (JRE8.0)");
		lblJava.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJava.setBounds(169, 140, 94, 30);
		frame.getContentPane().add(lblJava);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOk.setBounds(169, 186, 94, 41);
		frame.getContentPane().add(btnOk);
	}
}
