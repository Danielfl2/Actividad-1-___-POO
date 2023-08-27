//Ejercicio propuesto número 12 POO
//Daniel David Florez Bocanegra

public class POOEP12 {

	public static void main ( String [] args) {

		//Se declaran las horas semanales que trabaja y cuanto se le paga por hora
		double horas_semanales = 48;
		double pago_por_horas = 5000;

		//Se calcula el salario semanal en bruto
		double salario_semanal = 48*5000;

		//Se calcula la retencion
		double retencion = salario_semanal * 0.125;

		//Se calcula el salario neto
		double salario_neto = salario_semanal - retencion;

		System.out.println("Salario en bruto: " + salario_semanal);
		System.out.println("Retencion en la fuente: " + retencion);
		System.out.println("Salario neto: " + salario_neto);

	}

}