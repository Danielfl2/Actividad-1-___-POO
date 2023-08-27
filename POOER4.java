//Ejercicio resuelto número 4 POO
//Daniel David Florez Bocanegra
import java.util.Scanner;

public class  POOER4 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Se lee la edad de Juan como input del usuario.
		System.out.println("Ingrese la edad de Juan: ");
		int edad_juan = entrada.nextInt(); 

		int edad_alberto = 2*(edad_juan/3); //Calculamos la edad de alberto
		int edad_ana = 4*(edad_juan/3); //Calculamos la edad de ana
		int edad_mama = edad_juan + edad_alberto + edad_ana; //Se calcula la edad de la madre en base a los otros datos

		System.out.println("La edad de Alberto es: " + edad_alberto);
		System.out.println("La edad de Juan es: " + edad_juan);
		System.out.println("La edad de Ana es: " + edad_ana);
		System.out.println("La edad de la mamá es: " + edad_mama);	

	}

}