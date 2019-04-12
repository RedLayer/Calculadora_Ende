package interfazCLI.com;

import java.util.ArrayList;

/***
 * En esta clase se gestiona todo el sistema de cáculo de las potencias
 * y sus diferentes excepciones (si las hubiera)
 * 
 * La clase está diseñada de modo que tanto en CLI como en GUI se puede
 * llamar a sus métodos.
 * @author Pablo, Aketza, Aaron
 *
 */
public class Calculadora_Potencias {
	/**
	 * Metodo para pasar un número a binario
	 * @param num Número decimal que se pasa a binario
	 * @return Devuelve un String con el número en binario
	 * @author Pablo
	 */
	public String pasarABinario(int num){
	   ArrayList<String> arrbin = new ArrayList<String>();
	   int resto;
	   String strBin = "";

	   while(num > 2)
	   {
	      resto = num%2;
	      num = num/2;
	      arrbin.add(0, Integer.toString(resto));
	   } 

	   arrbin.add(0, Integer.toString(num%2));
	   arrbin.add(0, Integer.toString(num/2));
	   
	   for(int i = 0; i < arrbin.size(); i++){
		   strBin += arrbin.get(i);
	   }
	   return strBin;
	 }
	
	/**
	 * Metodo para sacar el valor absoluto de un número
	 * @param num Número que se pasa como parametro para el valor absoluto
	 * @return Devuelve un int con el valor absoluto
	 * @author Pablo
	 */
	public int valorAbsoluto(int num)
	{
		int abs = Math.abs(num);
		return abs;
	}
	
	/**
	 * Metodo que realiza la suma de los dos números pasados como parametros
	 * @param num1 Primer número pasado como parametro
	 * @param num2 Segundo número pasado como parametro
	 * @return Devuelve la suma de ambos números
	 * @author Pablo
	 */
	public int suma(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	/**
	 * Metodo que realiza la resta de dos números pasados como parametros
	 * @param num1
	 * @param num2
	 * @return Devuelve la resta de los parametros
	 * @author Aketza
	 */
	public int resta(int num1, int  num2) {
		int res=num1-num2;
		return res;
		
	}
	
	/**
	 * Metodo que realiza la division de dos números pasados como parametros
	 * @param num1
	 * @param num2
	 * @return Devuelve el cociente de la division
	 * @author Aketza
	 */
	public double division(int num1, int  num2) {
		try {
			double div=(double)num1/num2;
			return div;
		} catch (ArithmeticException e) {
			return -1;
		}
	}
	
	/**
	 * Metodo que realiza la potencia de un parametro al exponente que se pasa como segundo parametro
	 * @param num1
	 * @param num2
	 * @return Devuelve la potencia de el primer parametro al exponente que se pasa como segundo parametro
	 * @author Aketza
	 */
	public int potencia(int num1, int num2) {
		int pow= (int) Math.pow(num1, num2);
		return pow;
	}
	
	/**
	 * Metodo que realiza la raiz cuadrada de un número que se pasa por parametro
	 * @param num
	 * @return Devuelve el resultado de hacer la raiz cuadrada de el número pasado por el parametro
	 * @author Aaron
	 */
	public float raiz( int num) {
		
		try {
			float resultado = (float) Math.sqrt(num);
			return resultado;
		}
		catch(ArithmeticException e){
			return -1;
		}
	}
	
	/**
	 * Devuelve el logaritmo en base al número pasado
	 * @param num 
	 * @param base
	 * @return devuelce el resultado
	 * @author Aaron
	 */
	public double log(double num, int base) {
		try {
			return (Math.log10(num) / Math.log10(base));
		}catch(ArithmeticException e){
			return -1;
		}
	      
	   }
	
	/**
	 * Multiplica el prmer valor por el segundo
	 * @param num1
	 * @param num2
	 * @return devuelve el resultado
	 * @author Aaron
	 */
	public int multi(int num1, int num2) {
		int result=num1*num2;
		return result;
	}
}
