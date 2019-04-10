package interfazCLI.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Es la clase que se encarga de crear la calculadora en para la interfaz de linea de comandos (CLI)
 * El programa dara unas opciones y segun la opcion ejecutara una ecuacion u otra.
 * @author Pablo
 *
 */
public class CalculadoraCLI {
	
/**
 * Es el programa principal de linea de comandos
 * nuestra labor ser� extraer los m�todos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gr�fico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un men� de linea de comando con diferentes opciones
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
		System.out.print("Por favor seleccione una operacion insertando uno de los n�meros de arriba: ");
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
			System.out.println("N�mero no valido");
			break;
		}
		System.out.println("------------------------------------------------------------------------");
	}
	System.out.println("Adios!");
	
}

/**
 * Devuelve el n�mero que introduce el usuario por teclado
 * @return N�mero introducido por el usuario en forma de entero
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

/**
 * Pide dos n�meros al usuario para realizar una suma entre ellos
 * @return Devuelve un String con toda la ecuacion de la suma, para sacarlo por pantalla en la linea de comandos
 */
private static String sumar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo n�mero: ");
	int num2 = leeInt();
	
	return num1 + "+" + num2 + "=" + calc.suma(num1,num2);
}

/**
 * Pide dos n�meros al usuario para realizar una resta entre ellos
 * @return Devuelve un String con toda la ecuacion de la resta, para sacarlo por pantalla en la linea de comandos
 */
private static String restar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo n�mero: ");
	int num2 = leeInt();
	
	return num1 + "+" + num2 + "=" + calc.resta(num1,num2);
}

/**
 * Pide dos n�meros al usuario para realizar una multiplicaci�n entre ellos
 * @return Devuelve un String con toda la ecuacion de la multiplicaci�n, para sacarlo por pantalla en la linea de comandos
 */
private static String multiplicar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo n�mero: ");
	int num2 = leeInt();
	
	return num1 + "x" + num2 + "=" + calc.multi(num1,num2);
}

/**
 * Pide dos n�meros al usuario para realizar una divisi�n entre ellos
 * @return Devuelve un String con toda la ecuacion de la divisi�n, para sacarlo por pantalla en la linea de comandos
 */
private static String dividir() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo n�mero: ");
	int num2 = leeInt();
	
	return num1 +"/"+num2+"="+calc.division(num1,num2);
}

/**
 * Pide un n�mero al usuario para sacar el valor absoluto del mismo
 * @return Devuelve el valor absoluto del entero en un String, para sacarlo por pantalla en la linea de comandos
 */
private static String abs() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el n�mero para pasar al valor absoluto: ");
	int num1 = leeInt();
	return "Valor absoluto de " + num1 + "="+calc.valorAbsoluto(num1);
}

/**
 * Pide dos n�mero (n�mero y potencia) y realiza la ecuaci�n
 * @return Devuelve un String con la pontencia del numero introducido, para sacarlo por pantalla en la linea de comandos
 */
private static String pot() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta la potencia: ");
	int num2 = leeInt();
	
	return num1+"^"+num2+"="+calc.potencia(num1,num2);
}

/**
 * Pide un n�mero y lo pasa a binario
 * @return Devuelve un String con el n�mero en binario, para sacarlo por pantalla en la linea de comandos
 */
private static String bin() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el n�mero que pasar a binario: ");
	int num1 = leeInt();
	
	return "Numero " + num1 + " en binario="+calc.pasarABinario(num1);
}

/**
 * Pide un n�mero y devuelve la raiz del mismo
 * @return Devuelve la raiz del n�mero en un String, para sacarlo por pantalla en la linea de comandos
 */
private static String rz() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el n�mero al que hacerle la raiz: ");
	int num1 = leeInt();
	
	return "Raiz de "+num1+"="+calc.raiz(num1);
}

/**
 * Pide un n�mero y una base y saca el logaritmo
 * @return Devuelve el logaritmo del n�mero en base a la pedida por teclado en un String, para sacarlo por pantalla en la linea de comandos
 */
private static String log() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el n�mero: ");
	int num1 = leeInt();
	System.out.print("Inserta la base: ");
	int num2 = leeInt();
	
	return "Logaritmo de " + num1 + " en base " + num2 + "=" + calc.log(num1,num2);
}

}
