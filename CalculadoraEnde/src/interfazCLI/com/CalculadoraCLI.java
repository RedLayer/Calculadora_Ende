package interfazCLI.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Es la clase que se encarga de crear la calculadora en modo CLI
 * @author Pablo
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
		System.out.print("Por favor seleccione una operacion insertando uno de los números de arriba: ");
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
			System.out.println("Número no valido");
			break;
		}
	}
	System.out.println("Adios!");
	
}

/**
 * Devuelve el número que introduce el usuario por teclado
 * @return Número introducido por el usuario en forma de entero
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
 * Pide dos números al usuario para realizar una suma entre ellos
 * @return Devuelve un entero con la suma de los números
 */
private static int sumar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer número: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo número: ");
	int num2 = leeInt();
	
	return calc.suma(num1,num2);
}

/**
 * Pide dos números al usuario para realizar una resta entre ellos
 * @return Devuelve el resultado de la resta de los números en un entero
 */
private static int restar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer número: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo número: ");
	int num2 = leeInt();
	
	return calc.resta(num1,num2);
}

/**
 * Pide dos números al usuario para realizar una multiplicación entre ellos
 * @return Devuelve el resultado de la multiplicación de los números en un entero
 */
private static int multiplicar() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer número: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo número: ");
	int num2 = leeInt();
	
	return calc.multi(num1,num2);
}

/**
 * Pide dos números al usuario para realizar una división entre ellos
 * @return Devuelve el resultado de la división de los números en un entero
 */
private static double dividir() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el primer número: ");
	int num1 = leeInt();
	System.out.print("Inserta el segundo número: ");
	int num2 = leeInt();
	
	return calc.division(num1,num2);
}

/**
 * Pide un número al usuario para sacar el valor absoluto del mismo
 * @return Devuelve el valor absoluto en un entero
 */
private static int abs() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el número para pasar al valor absoluto: ");
	int num1 = leeInt();
	return calc.valorAbsoluto(num1);
}

/**
 * Pide dos número (número y potencia) y realiza la ecuación
 * @return Devuelve el número resultante de la potencia en un entero
 */
private static int pot() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el número: ");
	int num1 = leeInt();
	System.out.print("Inserta la potencia: ");
	int num2 = leeInt();
	
	return calc.potencia(num1,num2);
}

/**
 * Pide un número y lo pasa a binario
 * @return Devuelve un String con el número en binario
 */
private static String bin() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el número que pasar a binario: ");
	int num1 = leeInt();
	
	return calc.pasarABinario(num1);
}

/**
 * Pide un número y devuelve la raiz del mismo
 * @return Devuelve la raiz del número
 */
private static float rz() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el número al que hacerle la raiz: ");
	int num1 = leeInt();
	
	return calc.raiz(num1);
}

/**
 * Pide un número y una base y saca el logaritmo
 * @return Devuelve el logaritmo del número en base a la pedida por teclado
 */
private static double log() {
	Calculadora_Potencias calc = new Calculadora_Potencias();
	System.out.print("Inserta el número: ");
	int num1 = leeInt();
	System.out.print("Inserta la base: ");
	int num2 = leeInt();
	
	return calc.log(num1,num2);
}

}
