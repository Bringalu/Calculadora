package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import main.Calculos;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;


public class View {

	private JFrame frmCalculadora;
	private JTextField tbNum1;
	private JTextField tbNum2;
	private JTextField tbOpera;
	private JLabel txtOpera;
	private JLabel tvtNum2;
	private JLabel lblTiraFerrugem;
	private JLabel tbResult;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		initialize();
		
	}

	Credits creditos = new Credits();
	Calculos oper = new Calculos();
	private JButton btnCred;
	
	public void calculadoraa() {
		int num1 = Integer.parseInt(tbNum1.getText());
		int num2 = Integer.parseInt(tbNum2.getText());
		String operString = tbOpera.getText();
		int operInt = 0;
		switch(operString) {
			case "+":
				operInt = 1;
				break;
			case "adição":
				operInt = 1;
				break;
			case "mais":
				operInt = 1;
				break;
			case "-":
				operInt = 2;
				break;
			case "subtração":
				operInt = 2;
				break;
			case "menos":
				operInt = 2;
				break;
			case "*":
				operInt = 3;
				break;
			case "multiplicação":
				operInt = 3;
				break;
			case "vezes":
				operInt = 3;
				break;
			case "/":
				operInt = 4;
				break;
			case "divisão":
				operInt = 4;
				break;
			default:
				alerta("Erro!");
				alerta("Operação Inválida");
				break;
		}
		switch(operInt) {
			case 1:
				tbResult.setText(Integer.toString(oper.soma(num1, num2)));
				break;
			case 2:
				tbResult.setText(Integer.toString(oper.menos(num1, num2)));
				break;
			case 3:
				tbResult.setText(Integer.toString(oper.vezes(num1, num2)));
				break;
			case 4:
				tbResult.setText(Integer.toString(oper.div(num1, num2)));
				break;
			case 0:
				tbResult.setText("Operação Inválida!");
				break;
		}
	}
	
	public void alerta(String a) {
		JOptionPane.showMessageDialog(null, a);
	}
	
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/img/gorilao.jpg")));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 500, 400);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		tbNum1 = new JTextField();
		tbNum1.setBounds(82, 143, 55, 43);
		frmCalculadora.getContentPane().add(tbNum1);
		tbNum1.setColumns(10);
		
		tbNum2 = new JTextField();
		tbNum2.setBounds(356, 143, 55, 43);
		frmCalculadora.getContentPane().add(tbNum2);
		tbNum2.setColumns(10);
		
		tbOpera = new JTextField();
		tbOpera.setBounds(219, 143, 55, 43);
		frmCalculadora.getContentPane().add(tbOpera);
		tbOpera.setColumns(10);
		
		JButton btnGo = new JButton("Matem\u00E1gica");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadoraa();			
			}
		});
		btnGo.setBounds(156, 250, 164, 57);
		frmCalculadora.getContentPane().add(btnGo);
		
		JLabel txtResultado = new JLabel("Resultado:");
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResultado.setBounds(174, 215, 100, 20);
		frmCalculadora.getContentPane().add(txtResultado);
		
		JLabel txtNum1 = new JLabel("N\u00FAmero 1:");
		txtNum1.setBounds(82, 121, 66, 14);
		frmCalculadora.getContentPane().add(txtNum1);
		
		txtOpera = new JLabel("Opera\u00E7\u00E3o:");
		txtOpera.setBounds(219, 121, 71, 14);
		frmCalculadora.getContentPane().add(txtOpera);
		
		tvtNum2 = new JLabel("N\u00FAmero 2:");
		tvtNum2.setBounds(356, 121, 55, 14);
		frmCalculadora.getContentPane().add(tvtNum2);
		
		lblTiraFerrugem = new JLabel("Calculadora");
		lblTiraFerrugem.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTiraFerrugem.setBounds(148, -2, 242, 97);
		frmCalculadora.getContentPane().add(lblTiraFerrugem);
		
		tbResult = new JLabel("");
		tbResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tbResult.setBounds(273, 213, 25, 25);
		frmCalculadora.getContentPane().add(tbResult);
		
		btnCred = new JButton("Cr\u00E9ditos");
		btnCred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creditos.pisca();
			}
		});
		btnCred.setBounds(10, 337, 89, 23);
		frmCalculadora.getContentPane().add(btnCred);
	}
}
