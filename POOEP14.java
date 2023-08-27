//Ejercicio propuesto número 14
// Daniel David Florez Bocanegra
import java.util.Scanner;

public class POOEP14{

	public static void main( String[] args) {

		Scanner entrada = new Scanner(System.in);

		//Lee un número ingresado por el ususario
		System.out.println("Ingrese un número: ");
		double x = entrada.nextDouble();

		//Imprime el cuadrado y el cubo del número ingresado
		System.out.println("El cuadrado del número ingresado es: " + Math.pow(x,2));
		System.out.println("El cubo del número ingresado es: " + Math.pow(x,3));

	}

}