package interfazGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import interfazGUI.*;
import interfazCLI.com.*;

public class ListenerBoton implements ActionListener {
		
		private String simbolo;
		
		ListenerBoton(String simbolo){
			this.simbolo=simbolo;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			//añadir numero o simbolo correspondiente al boton en la pantalla
			
			if(simbolo.equals("=")) {

				try {
					pantalla.setText(Double.toString(realizarOperacion()));
				} catch (ArithmeticException e1) {
					pantalla.setText(e1.getMessage());
				}
				
			}else {
				
				if(simbolo.equals("C")){
					pantalla.setText("");
				}else {
			
					pantalla.append(hashBotones.get(simbolo).getText());
				}
				
			}
			
		}
		
		
		
	}

/**
 * Método que separa en un array de longitud 3 el texto en pantalla
 * @author Aaron
 */
private String[] separar() {
	
	String instruccion = .getText();
	String primnum;
	
	if(instruccion.charAt(0) == ' ')
		primnum="0";
	else {
		primnum=instruccion.substring(0,instruccion.indexOf(' ')); 
	}
	String operacion=instruccion.substring(instruccion.indexOf(' ')+1,instruccion.indexOf(' ',instruccion.indexOf(' ')+1));;
	String segnum;
	
	
	
	if(instruccion.length()==instruccion.indexOf(operacion+1)) {
		

		segnum=" ";
		
	}else {
		
	
		
			segnum = instruccion.substring(instruccion.indexOf(' ',instruccion.indexOf(' ')+1), instruccion.length());
		
		
	}
	
	
	String[] arrayoperacion = {primnum,operacion,segnum};
	
	return arrayoperacion;
	
}



	
	/**
	 * Metodo que hace las operaciones
	 * @author Aaron
	 */
	private double realizarOperacion() {

		String[] arrayoperacion = separar();
		
		int num1 = Integer.parseInt(arrayoperacion[0]);
		int num2=0;
		

		
		if(!arrayoperacion[2].equals(" "))
			num2 = Integer.parseInt(arrayoperacion[2]);
		
		switch (arrayoperacion[1]) {
		
		case "+":
			
			return Calculadora_Potencias.suma(num1,num2);
			
			
		case "-":
			
			return Calculadora_Potencias.resta(num1,num2);
			
			
		case "x":
			return Calculadora_Potencias.multi(num1,num2);
			
		case "/":
			try {
			return Calculadora_Potencias.division(num1,num2);
			}
			catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Math error");
			}
			return-1;
		case "^":
			return CalculadoraCLI.Elevar(num1,num2);
			
		case "log":
			
			return CalculadoraCLI.Logaritmo(num1,num2);
			
		case "bin":
			
			return CalculadoraCLI.binario(num1);
		
		case "sqr":
			
			return CalculadoraCLI.raizCuadrada(num1);
		
		case "!":
			
			return CalculadoraCLI.factorial(num1);
		
		case "abs":

			return CalculadoraCLI.absoluto(num1);
			
		}
		
		return 0;
		
		
		
	}


	}
