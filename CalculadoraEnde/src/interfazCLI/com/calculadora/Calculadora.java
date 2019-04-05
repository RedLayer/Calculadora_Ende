package com.calculadora;

import java.util.ArrayList;
 

/**
 * Clase Calculadora con los metodos para la misma.
 * @author Pablo
 *
 */
public class Calculadora {
	
	/**
	 * Metodo para pasar un numero a binario
	 * @param num Numero decimal que se pasa a binario
	 * @return Devuelve un String con el numero en binario
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
	 * Metodo para sacar el valor absoluto de un numero
	 * @param num Numero que se pasa como parametro para el valor absoluto
	 * @return Devuelve un int con el valor absoluto
	 */
	public int valorAbsoluto(int num)
	{
		int abs = Math.abs(num);
		return abs;
	}
	
	/**
	 * Metodo que realiza la suma de los dos numeros pasados como parametros
	 * @param num1 Primer numero pasado como parametro
	 * @param num2 Segundo numero pasado como parametro
	 * @return Devuelve la suma de ambos numeros
	 */
	public int suma(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	/**
	 * Metodo que realiza la resta de dos numeros pasados como parametros
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
	 * Metodo que realiza la division de dos numeros pasados como parametros
	 * @param num1
	 * @param num2
	 * @return Devuelve el cociente de la division
	 * @author Aketza
	 */
	public double division(int num1, int  num2) {
		try {
			float div=num1/num2;
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
	 * Metodo que realiza la raiz cuadrada de un numero que se pasa por parametro
	 * @param num
	 * @return Devuelve el resultado de hacer la raiz cuadrada de el numero pasado por el parametro
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
	 * Devuelve el logaritmo en base al numero pasado
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
