//Ejercicio propuesto número 17
//Daniel David Florez Bocanegra
import java.util.Scanner;

public class POOEP17 {

	public static void main ( String [] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el radio del circulo: ");
		double radio = entrada.nextDouble();

		System.out.println("El area del circulo es: " + (Math.pow(radio,2) * Math.PI));
		System.out.println("La longitud del circulo es: " + (2 * Math.PI * radio));


	}

}