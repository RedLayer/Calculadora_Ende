package interfazGUI;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import interfazCLI.com.Calculadora_Potencias;


/**
 * Clase Ventana, interfaz grafica de la calculadora.
 * @author Aketza
 */


public class Ventana extends JFrame implements ActionListener {
	
	boolean segundo=false;
	private char operador='?';
	private int num1=-0,num2=0;
	private Calculadora_Potencias calc= new Calculadora_Potencias(); 
	
	private static JButton bt0 =new JButton("0");
	private static JButton bt1 =new JButton("1");
	private static  JButton bt2 =new JButton("2");
	private static  JButton bt3 =new JButton("3");
	private static  JButton bt4 =new JButton("4");
	private static  JButton bt5 =new JButton("5");
	private static  JButton bt6 =new JButton("6");
	private static JButton bt7 =new JButton("7");
	private static JButton bt8 =new JButton("8");
	private static JButton bt9 =new JButton("9");

	private static JButton bt_mult =new JButton("*");
	private static JButton bt_sum =new JButton("+");
	private static JButton bt_res =new JButton("-");
	private static JButton bt_div =new JButton("/");
	private static JButton bt_raiz =new JButton("R");
	private static JButton bt_exp =new JButton("^");
	private static JButton bt_log = new JButton("LOG");
	private static JButton bt_bin = new JButton("BIN");
	private static JButton bt_abs = new JButton("ABS");
	
	private static JButton bt_supr =new JButton("C");
	private static JButton bt_eq =new JButton("=");
	private static JTextField res= new JTextField(20);

	public JPanel panelResultado ;
	public JPanel panelOperaciones;
	public JPanel panelNums;
	
	/**
	 * Constructor de la ventana, que la dibuja.
	 * @param ninguno
	 * @return void
	 */
	public Ventana() {

		dibujar();

	}	
	
	/**
	 * Metodo dibujar el cual implementa todas las ventanas y botones de la calculadora
	 * @param no recibe ningun parametro
	 * @author todos
	 * 
	 */

	public void dibujar(){
		 
		//opciones por defecto
		setTitle("Calculadora Grafica");
		setLayout(new BorderLayout());;
		setSize(620, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel resultado (Norte)
		panelResultado = new JPanel();
		panelResultado.setLayout(new GridLayout(1,1));
		panelResultado.setPreferredSize(new Dimension(600, 250));
		panelResultado.add(res);
		
		
		//panel de botones (Medio)
		panelOperaciones = new JPanel();
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
	
		bt_sum.addActionListener(this);
		bt_res.addActionListener(this);
		bt_mult.addActionListener(this);
		bt_div.addActionListener(this);
		bt_exp.addActionListener(this);
		bt_raiz.addActionListener(this);
		bt_log.addActionListener(this);
		bt_abs.addActionListener(this);
		bt_bin.addActionListener(this);
		bt_supr.addActionListener(this);
		bt_eq.addActionListener(this);
		
		//panel de botones (Sur)
		panelNums = new JPanel();
		panelNums.setLayout(new GridLayout(2,2));
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
		panelNums.add(bt0);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		bt0.addActionListener(this);
		
		//ESTILO DE VENTANA
		
		setBackground(Color.white);
		bt0.setBackground(Color.white);
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
		
		bt0.setFont(bt0.getFont().deriveFont ( 60f ));
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
	
	/**
	 * En este metodo estan implementados todos los Listener de la calculadora
	 * @param no utiliza ningun metodo
	 * @author todos
	 */
		
	@Override
	public void actionPerformed(ActionEvent e) {

		
		
		
		
		if (e.getSource()==bt_sum){
			
			if(segundo==false){
			num1=parsearInt(res.getText());
			res.setText("");
			segundo=true;
			operador='+';
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Dale a el botón '=' ");
			}
		}
		if (e.getSource()==bt_res){
			if(segundo==false){
			num1=parsearInt(res.getText());
			res.setText("");
			segundo=true;
			operador='-';
			}
			else {
				JOptionPane.showMessageDialog(null, "Dale a el botón '=' ");
			}
		}
		if (e.getSource()==bt_mult){
			if(segundo==false){
			num1=parsearInt(res.getText());
			res.setText("");
			segundo=true;
			operador='*';
			}
			else {
				JOptionPane.showMessageDialog(null, "Dale a el botón '=' ");
			}
		}
		if (e.getSource()==bt_div){
			if(segundo==false){
			num1=parsearInt(res.getText());
			res.setText("");
			operador='/';
			segundo=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Dale a el botón '=' ");
			}
		}
		if (e.getSource()==bt_exp){
				if(segundo==false){
					num1=parsearInt(res.getText());
					res.setText("");
					operador='^';
					segundo=true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Dale a el botón '=' ");
				}
		}
		if (e.getSource()==bt_raiz){
			num1=parsearInt(res.getText());
			
			res.setText(calc.raiz(num1)+"");
		}
		if (e.getSource()==bt_bin){
			num1=parsearInt(res.getText());
			
			res.setText(calc.pasarABinario(num1)+"");
		}
		if (e.getSource()==bt_log){
			num1=parsearInt(res.getText());
			
			res.setText(calc.log(num1,10)+"");		}
		if (e.getSource()==bt_abs){
			
			num1=parsearInt(res.getText());
			
			res.setText(calc.valorAbsoluto(num1)+"");
		}
		if (e.getSource()==bt_supr){
			res.setText("");
			segundo=false;
			num1=0;
			num2=0;
		}
		if (e.getSource()==bt_eq){
			
			if(segundo) {
			num2=parsearInt(res.getText());
			
			if(operador=='+') {
				res.setText(calc.suma(num1, num2)+"");
			}
			if(operador=='-') {
				res.setText(calc.resta(num1, num2)+"");
			}
			if(operador=='*') {
				res.setText(calc.multi(num1, num2)+"");
			}
			if(operador=='/') {
				res.setText(calc.division(num1, num2)+"");
			}
			if(operador=='^') {
				res.setText(calc.potencia(num1, num2)+"");
			}

			
			if(operador=='?') {
				res.setText("no hay resultado (" + operador+ ")" );
			}
		}
		else {
			num1=parsearInt(res.getText());
			res.setText(num1+"");
		}
		
				
			segundo=false;
		
			
			
			
			
			
		}
				
		
		if (e.getSource()==bt1){
			res.setText(res.getText()+"1");
			
		}
		if (e.getSource()==bt2){
			res.setText(res.getText()+"2");
		}
		if (e.getSource()==bt3){
			res.setText(res.getText()+"3");
		}
		if (e.getSource()==bt4){
			res.setText(res.getText()+"4");
		}
		if (e.getSource()==bt5){
			res.setText(res.getText()+"5");
		}
		if (e.getSource()==bt6){
			res.setText(res.getText()+"6");
		}
		if (e.getSource()==bt7){
			res.setText(res.getText()+"7");
		}
		if (e.getSource()==bt8){
			res.setText(res.getText()+"8");
		}
		if (e.getSource()==bt9){
			res.setText(res.getText()+"9");
		}
		
		
		
	}
	
	public static int parsearInt(String num) {
		int result=-1;
		try {
			result=Integer.parseInt(num);
		} catch (NumberFormatException e) {
			 res.setText("MATH ERROR");
		}
		
		
		return result;
	}
	
	
	
	
	/**
	 * Metodo main que solo crea una nueva ventana
	 * @param args
	 * @author todos
	 */
	public static void main(String[] args) {

		new Ventana(); 

	}


	
	

	
	
}
