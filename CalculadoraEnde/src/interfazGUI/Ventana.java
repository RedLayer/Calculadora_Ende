package com.calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * Clase Ventana, interfaz grafica de la calculadora.
 * @author Aketza
 */


public class Ventana extends JFrame {
	
	private JButton bt1 =new JButton("1");
	private JButton bt2 =new JButton("2");
	private JButton bt3 =new JButton("3");
	private JButton bt4 =new JButton("4");
	private JButton bt5 =new JButton("5");
	private JButton bt6 =new JButton("6");
	private JButton bt7 =new JButton("7");
	private JButton bt8 =new JButton("8");
	private JButton bt9 =new JButton("9");

	private JButton bt_mult =new JButton("*");
	private JButton bt_sum =new JButton("+");
	private JButton bt_res =new JButton("-");
	private JButton bt_div =new JButton("/");
	private JButton bt_raiz =new JButton("R");
	private JButton bt_exp =new JButton("^");
	private JButton bt_log = new JButton("LOG");
	private JButton bt_bin = new JButton("BIN");
	private JButton bt_abs = new JButton("ABS");
	
	private JButton bt_supr =new JButton("C");
	private JButton bt_eq =new JButton("=");
	private static JTextField res= new JTextField(20);


	/**
	 * Constructor de la ventana, que la dibuja.
	 * @param ninguno
	 * @return void
	 */
	public Ventana() {

		dibujar();
		escuchar();
		
	
	
	public static void dibujar(){
		 
		//opciones por defecto
		setTitle("Calculadora Gráfica");
		setLayout(new BorderLayout());;
		setSize(620, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel resultado (Norte)
		JPanel panelResultado = new JPanel();
		panelResultado.setLayout(new GridLayout(1,1));
		panelResultado.setPreferredSize(new Dimension(600, 250));
		panelResultado.add(res);
		
		
		//panel de botones (Medio)
		JPanel panelOperaciones = new JPanel();
		panelOperaciones.setLayout(new GridLayout(2,1));
		panelOperaciones.setPreferredSize(new Dimension(30, 20));
		panelOperaciones.setBackground(Color.white);
		
		panelOperaciones.add(bt_sum);
		panelOperaciones.add(bt_res);
		panelOperaciones.add(bt_mult);
		panelOperaciones.add(bt_div);
		panelOperaciones.add(bt_exp);
		panelOperaciones.add(bt_raiz);
		panelOperaciones.add(bt_log);
		panelOperaciones.add(bt_abs);
		panelOperaciones.add(bt_bin);
		panelOperaciones.add(bt_supr);
		panelOperaciones.add(bt_eq);
	
		
		//panel de botones (Sur)
		JPanel panelNums = new JPanel();
		panelNums.setLayout(new GridLayout(3,3));
		panelNums.setPreferredSize(new Dimension(30, 250));
		
		panelNums.add(bt1);
		panelNums.add(bt2);
		panelNums.add(bt3);
		panelNums.add(bt4);
		panelNums.add(bt5);
		panelNums.add(bt6);
		panelNums.add(bt7);
		panelNums.add(bt8);
		panelNums.add(bt9);
		
		
		//ESTILO DE VENTANA
		
		setBackground(Color.white);
		bt1.setBackground(Color.white);
		bt2.setBackground(Color.white);
		bt3.setBackground(Color.white);
		bt4.setBackground(Color.white);
		bt5.setBackground(Color.white);
		bt6.setBackground(Color.white);
		bt7.setBackground(Color.white);
		bt8.setBackground(Color.white);
		bt9.setBackground(Color.white);
		bt_sum.setBackground(Color.white);
		bt_res.setBackground(Color.white);
		bt_mult.setBackground(Color.white);
		bt_div.setBackground(Color.white);
		bt_exp.setBackground(Color.white);
		bt_raiz.setBackground(Color.white);
		bt_log.setBackground(Color.white);
		bt_bin.setBackground(Color.white);
		bt_abs.setBackground(Color.white);
		bt_supr.setBackground(Color.white);
		bt_eq.setBackground(Color.white);
		
		
		res.setFont(res.getFont().deriveFont ( 60f ));
		
		bt1.setFont(bt1.getFont().deriveFont ( 60f ));
		bt2.setFont(bt2.getFont().deriveFont ( 60f ));
		bt3.setFont(bt3.getFont().deriveFont ( 60f ));
		bt4.setFont(bt4.getFont().deriveFont ( 60f ));
		bt5.setFont(bt5.getFont().deriveFont ( 60f ));
		bt6.setFont(bt6.getFont().deriveFont ( 60f ));
		bt7.setFont(bt7.getFont().deriveFont ( 60f ));
		bt8.setFont(bt8.getFont().deriveFont ( 60f ));
		bt9.setFont(bt9.getFont().deriveFont ( 60f ));
		
		bt_sum.setFont(bt_sum.getFont().deriveFont ( 30f ));
		bt_res.setFont(bt_res.getFont().deriveFont ( 30f ));
		bt_mult.setFont(bt_mult.getFont().deriveFont ( 30f ));
		bt_div.setFont(bt_div.getFont().deriveFont ( 30f ));
		bt_exp.setFont(bt_exp.getFont().deriveFont ( 30f ));
		bt_raiz.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		bt_log.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		bt_bin.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		bt_abs.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		bt_supr.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		bt_eq.setFont(bt_raiz.getFont().deriveFont ( 30f ));
		
		
		//Aniadir los paneles
		getContentPane().add(panelNums,BorderLayout.SOUTH);
		getContentPane().add(panelOperaciones,BorderLayout.CENTER);
		getContentPane().add(panelResultado, BorderLayout.NORTH);
	}
	
	public static void escuchar() {
		//Respuesta de los botones
				bt1.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 1
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
						
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"1");
				}});
				
				bt2.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 2
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
						
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"2");
				}});
				
				bt3.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 3
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
						
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"3");
				}});
				
				bt4.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 4
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"4");
				}});			
				
				bt5.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 5
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"5");
				}});	
				
				bt6.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 6
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"6");
				}});
				
				bt7.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 7
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"7");
				}});	
				bt8.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 8
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"8");
				}});
				
				bt9.addActionListener(new ActionListener() {
					@Override
					/**
					 * acción de  escritura del botón 9
					 * @param e un evento que representa una acción en el botón
					 * @return void 
					 */
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"9"
								+ "");
				}});
				
				
				
				
				//botones operador
				bt_sum.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"+");
				}});
				
				bt_res.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					
						res.setText(res.getText()+"-");
				}});
				
				bt_mult.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					
						res.setText(res.getText()+"*");
				}});
				
				bt_div.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						res.setText(res.getText()+"/");
				}});
				
				bt_exp.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						res.setText(res.getText()+"^");
				}});
				
				bt_raiz.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						res.setText(res.getText()+"R");
				}});
				
				bt_supr.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						res.setText("");
				}});
				
				bt_bin.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"BIN");
				}});
				
				bt_log.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"LOG");
				}});
				
				bt_abs.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						res.setText(res.getText()+"ABS");
				}});
				
				
			}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		new Ventana(); 

	}
	
	
	

	
	
}
