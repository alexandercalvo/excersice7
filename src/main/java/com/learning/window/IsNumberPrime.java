package com.learning.window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.learning.numbers.PrimeNumbers;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IsNumberPrime extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber;
	private JLabel lblOutcome;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IsNumberPrime frame = new IsNumberPrime();
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
	public IsNumberPrime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 12, 428, 183);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCalculadoraDeNumeros = new JLabel("Calculadora de Numeros Primos");
		lblCalculadoraDeNumeros.setFont(new Font("Georgia", Font.BOLD, 18));
		lblCalculadoraDeNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeNumeros.setForeground(SystemColor.activeCaption);
		lblCalculadoraDeNumeros.setBackground(Color.GRAY);
		lblCalculadoraDeNumeros.setBounds(12, 12, 416, 29);
		panel.add(lblCalculadoraDeNumeros);
		
		JLabel lblDigiteElNumero = new JLabel("Digite el numero");
		lblDigiteElNumero.setBounds(12, 93, 140, 15);
		panel.add(lblDigiteElNumero);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(172, 85, 140, 25);
		panel.add(txtNumber);
		txtNumber.setColumns(10);
		
	    lblOutcome = new JLabel("");
		lblOutcome.setBounds(12, 109, 366, 29);
		panel.add(lblOutcome);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtNumber.getText());
				if(PrimeNumbers.checkPrimeNumber(number)) {
					lblOutcome.setText("el numero: ["+number+"] es primo\"");
				}else {
					lblOutcome.setText("el numero: ["+number+"] es compuesto");
				}
				
				txtNumber.setText("");
			}
		});
		btnCalculate.setBounds(12, 150, 117, 25);
		panel.add(btnCalculate);
	}
}
