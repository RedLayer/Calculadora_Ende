package interfazCLI.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Es la clase que se encarga de crear la calculadora en modo CLI
 * @author Pablo,Aketza,Aaron
 *
 */
public class CalculadoraCLI {
	
/**
 * Es el programa principal de linea de comandos
 * nuestra labor será extraer los métodos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gráfico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 */
private static void LanzarMenu() {
	int seleccion=999;
	System.out.println("Bienvenido a la calculadora");
	while(seleccion!=0)
	{
		System.out.println("1- Suma			2- Resta		 	3- Multiplicacion");
		System.out.println("4- Division		5- Valor absoluto		6- potencia");
		System.out.println("7- Binario		8- Raiz				9- Logaritmo");
		System.out.println("\t\t\t0- Salir");
		System.out.print("Por favor seleccione una operacion insertando uno de los numeros de arriba: ");
		seleccion=leeInt();
		switch(seleccion) {
		  case 1:
		    System.out.println(sumar());
		    break;
		  case 2:
			System.out.println(restar());
		    break;
		  case 3:
		    System.out.println(multiplicar());
		    break;
		  case 4:
			System.out.println( dividir());
		    break;
		  case 5:
			System.out.println(abs());
		    break;
		  case 6:
		    System.out.println(pot());
		    break;
		  case 7:
		    System.out.println(bin());
		    break;
		  case 8:
		    System.out.println(rz());
		    break;
		  case 9:
		    System.out.println(log());
		    break;
		  case 0:
			break;
		  default:
			System.out.println("Numero no valido");
			break;
		}
	}
	System.out.println("Adios!");
	
}

/**
 * Devuelve el numero que introduce el usuario por teclado
 * @return Numero introducido por el usuario en forma de entero
 */
public static int leeInt() {
	
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int x = 0;
		try {
			x = Integer.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return x;

}

private static int sumar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.suma(num1,num2);
}

private static int restar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.resta(num1,num2);
}

private static int multiplicar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.multi(num1,num2);
}

private static double dividir() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.division(num1,num2);
}

private static int abs() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el numero para pasar al valor absoluto: ");
	int num1 = leeInt();
	return calc.valorAbsoluto(num1);
}

private static int pot() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.potencia(num1,num2);
}

private static String bin() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	
	return calc.pasarABinario(num1);
}

private static float rz() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	
	return calc.raiz(num1);
}

private static double log() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer numero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo numero: ");
	int num2 = leeInt();
	
	return calc.log(num1,num2);
}

}
