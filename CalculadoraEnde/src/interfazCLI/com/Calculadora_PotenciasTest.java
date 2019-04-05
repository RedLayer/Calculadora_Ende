package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Calculadora_Potencias_PotenciasTest {

	/**
	 * Clase para crear pruebas sobre los metodos de la Calculadora_Potencias.
	 * Cada metodo tendra dos pruebas minimo
	 * @author Pablo
	 *
	 */

	class Calculadora_PotenciasTest {
		
		/**
		 * Primera prueba para pasar a binario sin dar fallo
		 */
		@Test
		@DisplayName("Test de pasar un numero a binario y no da fallo")
		void testPasarABinario1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals("101101", calc.pasarABinario(45));
		}

		/**
		 * Segunda prueba para pasar a binario dando fallo
		 */
		@Test
		@DisplayName("Test de pasar un numero a binario y da fallo")
		void testPasarABinario2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals("101110", calc.pasarABinario(45));
		}
		
		/**
		 * Primera prueba del valor absoluto sin dar fallo
		 */
		@Test
		@DisplayName("Test de valor abosulto y no da fallo")
		void testValorAbsoluto1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(3, calc.valorAbsoluto(-3));
		}

		/**
		 * Segunda prueba del valor absoluto dando fallo
		 */
		@Test
		@DisplayName("Test de valor abosulto y da fallo")
		void testValorAbsoluto2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(-4, calc.valorAbsoluto(4));
		}
		
		/**
		 * Primera prueba de la suma sin dar fallo
		 */
		@Test
		@DisplayName("Test de suma y no da fallo")
		void testSuma1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(10, calc.suma(6,4));
		}
		
		/**
		 * Segunda prueba de la suma dando fallo
		 */
		@Test
		@DisplayName("Test de suma y da fallo")
		void testSuma2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(12, calc.suma(6,4));
		}

		/**
		 * Tercera prueba de la suma parametrizada
		 * @param num1 Primer numero de la suma
		 * @param num2 Segundo numero de la suma
		 * @param resul Resultado de la suma
		 */
		@DisplayName("Test de suma parametrizada")
		@ParameterizedTest(name = "{index} => num1={0}, num2={1}, resul={2}")
		@CsvSource({"6,4,10","5,5,10","1,0,0", "85,41,126","-4,8,15"}) 
		void testSuma3(int num1, int num2, int resul) {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(resul, calc.suma(num1,num2));
		}
		
		/**
		 * Primera prueba de division que da fallo
		 * @param num1 Primer numero de la division
		 * @param num2 Segundo numero de la division
		 * @param resul cociente
		 * @author Aketza
		 */
		@Test
		@DisplayName("Test de división da fallo")
		void testdivision1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(0, calc.division(1,0));
		}
		
		/**
		 * Segunda prueba de division que no da fallo
		 * @param num1 Primer numero de la division
		 * @param num2 Segundo numero de la division
		 * @param resul cociente
		 */
		@Test
		@DisplayName("Test de división no da fallo")
		void testdivision2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(87, calc.division(87,1));
		}
		
		/**
		 * Primera prueba de resta que da fallo
		 * @param num1 Primer numero de la resta
		 * @param num2 Segundo numero de la resta
		 * @param resul resultado de la resta
		 * @author Aketza
		 */
		@Test
		@DisplayName("Test de resta da fallo")
		void testresta1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(87, calc.resta(87,1));
		}
		
		/*TO_DO
		 
		 potencia con fallo
		 potencia sin fallo
		 */
		
		/**
		 * Segunda prueba de resta que da fallo
		 * @param num1 Primer numero de la resta
		 * @param num2 Segundo numero de la resta
		 * @param resul resultado de la resta
		 * @author Aketza
		 */
		@Test
		@DisplayName("Test de resta no da fallo")
		void testresta2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(86, calc.resta(87,1));
		}
		
		/**
		 * Primera prueba de potencia que da fallo
		 * @param num1 Base de la potencia
		 * @param num2 Exponente de la potencia
		 * @param resul resultado de la potencia
		 * @author Aketza
		 */
		@Test
		@DisplayName("Test de potencia da fallo")
		void testpotencia1() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(9, calc.potencia(2,3));
		}
		
		/**
		 * Segunda prueba de potencia que no da fallo
		 * @param num1 Base de la potencia
		 * @param num2 Exponente de la potencia
		 * @param resul resultado de la potencia
		 * @author Aketza
		 */
		@Test
		@DisplayName("Test de potencia no da fallo")
		void testpotencia2() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(8, calc.potencia(2,3));
		}
		
		
		
		/**
		 * Prueba bien de multiplicacion
		 * @author Aaron
		 */
		@Test
		@DisplayName("Test de multiplicacion sin fallo")
		void testMulti() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(20, calc.multi(20,1));
		}
		
		/**
		 * Prueba bien de raiz
		 * @author Aaron
		 */
		@Test
		@DisplayName("Test de raiz sin fallo")
		void testRaiz() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(5, calc.raiz(25));
		}
		/**
		 * Prueba bien de logaritmo
		 * @author Aaron
		 */
		
		@Test
		@DisplayName("Test de logaritmo sin fallo")
		void testLog() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(3, calc.log(8,2));
		}
		/**
		 * Prueba mal de multiplicacion
		 * @author Aaron
		 */
		@Test
		@DisplayName("Test de multiplicacion fallo")
		void testMultiMal() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(53, calc.resta(20,1));
		}
		
		/**
		 * Prueba mal de raiz
		 * @author Aaron
		 */
		@Test
		@DisplayName("Test de raiz fallo")
		void testRaizMal() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(2.4, calc.raiz(25));
		}
		
		/**
		 * Prueba mal de logaritmo
		 * @author Aaron
		 */
		@Test
		@DisplayName("Test de logaritmo fallo")
		void testLogMal() {
			Calculadora_Potencias calc = new Calculadora_Potencias();
			assertEquals(33, calc.log(1,1));
		}

	}
}
