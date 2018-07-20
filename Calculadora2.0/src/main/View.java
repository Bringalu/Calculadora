package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class View {

	private JFrame frmCalculadora;
	private JTextField txtResultado;
	private JTextField txtNum1;
	
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

	Double num1, num2;
	String operacao;
	Boolean press = false;
	Cred cred = new Cred();
	
	
	private void initialize() {		
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/img/gorilao.jpg")));
		frmCalculadora.setResizable(false);
		frmCalculadora.setBounds(100, 100, 469, 683);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("1");									//1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtResultado.setText(txtResultado.getText() + "1");
			}
		});
		
		txtNum1 = new JTextField();
		txtNum1.setEditable(false);
		txtNum1.setBackground(Color.WHITE);
		txtNum1.setBounds(342, 3, 86, 20);
		frmCalculadora.getContentPane().add(txtNum1);
		txtNum1.setColumns(100);
		btn1.setBounds(39, 147, 70, 70);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");									//2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btn2.setBounds(148, 147, 70, 70);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");									//3
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});
		btn3.setBounds(257, 147, 70, 70);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");									//4
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});
		btn4.setBounds(39, 249, 70, 70);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");									//5
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});
		btn5.setBounds(148, 249, 70, 70);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");									//6
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		btn6.setBounds(257, 249, 70, 70);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");									//7
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btn7.setBounds(39, 349, 70, 70);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");									//8
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});
		btn8.setBounds(148, 349, 70, 70);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");									//9
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});
		btn9.setBounds(257, 349, 70, 70);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");									//0
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});
		btn0.setBounds(39, 446, 179, 70);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnEqual = new JButton("=");								//=
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(press == true) {
					Double resultado;
					num2 = Double.parseDouble((txtResultado.getText()));
					switch(operacao) {
						case "+":
							resultado = num1 + num2;
							txtResultado.setText(resultado.toString());
							break;
						case "-":
							resultado = num1 - num2;
							txtResultado.setText(resultado.toString());
							break;
						case "*":
							resultado = num1 * num2;
							txtResultado.setText(resultado.toString());
							break;
						case "/":
							resultado = num1 / num2;
							txtResultado.setText(resultado.toString());
							break;
					}
					press = false;
					txtNum1.setText(null);
				}
			}
		});
		btnEqual.setBounds(358, 349, 70, 167);
		frmCalculadora.getContentPane().add(btnEqual);
		
		JButton btnDot = new JButton(".");									//.
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + ".");
			}
		});
		btnDot.setBounds(257, 446, 70, 70);
		frmCalculadora.getContentPane().add(btnDot);
		
		JButton btnMai = new JButton("+");									//+
		btnMai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(press == false) {
				num1 = Double.parseDouble(txtResultado.getText());
				txtNum1.setText(num1.toString() + "+");
				txtResultado.setText(null);
				operacao = "+";
				press = true;
				}
			}
		});
		btnMai.setBounds(39, 537, 70, 70);
		frmCalculadora.getContentPane().add(btnMai);
		
		JButton btnMen = new JButton("-");									//-
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(press == false) {
				num1 = Double.parseDouble(txtResultado.getText());
				txtNum1.setText(num1.toString() + "-");
				txtResultado.setText(null);
				operacao = "-";
				press = true;
				}
			}
		});
		
		btnMen.setBounds(148, 537, 70, 70);
		frmCalculadora.getContentPane().add(btnMen);
		
		JButton btnVez = new JButton("*");									//*
		btnVez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(press == false) {
				num1 = Double.parseDouble(txtResultado.getText());
				txtNum1.setText(num1.toString() + "*");
				txtResultado.setText(null);
				operacao = "*";
				press = true;
				}
			}
		});
		btnVez.setBounds(257, 537, 70, 70);
		frmCalculadora.getContentPane().add(btnVez);
		
		JButton btnDiv = new JButton("/");									//(/)
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(press == false) {
				num1 = Double.parseDouble(txtResultado.getText());
				txtNum1.setText(num1.toString() + "/");
				txtResultado.setText(null);
				operacao = "/";
				press = true;
				}
			}
		});
		btnDiv.setBounds(358, 537, 70, 70);
		frmCalculadora.getContentPane().add(btnDiv);
		
		JButton btnDel = new JButton("C");									//C
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = (double) 0;
				num2 = (double) 0;
				txtNum1.setText(null);
				txtResultado.setText(null);
				press = false;
			}
		});
		btnDel.setBounds(358, 249, 70, 70);
		frmCalculadora.getContentPane().add(btnDel);
		
		JButton btnCleAll = new JButton("CE");								//CE
		btnCleAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(null);
			}
		});
		btnCleAll.setBounds(358, 147, 70, 70);
		frmCalculadora.getContentPane().add(btnCleAll);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 527, 443, 10);
		frmCalculadora.getContentPane().add(separator);
		
		txtResultado = new JTextField();
		txtResultado.setBackground(Color.WHITE);
		txtResultado.setEditable(false);
		txtResultado.setBounds(43, 22, 385, 102);
		frmCalculadora.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculadora.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mnuRei = new JMenuItem("Fechar");
		mnuRei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mnMenu.add(mnuRei);
		
		JMenuItem mnuCred = new JMenuItem("Cr\u00E9ditos");
		mnuCred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cred.pisca();
			}
		});
		mnMenu.add(mnuCred);
	}
}
