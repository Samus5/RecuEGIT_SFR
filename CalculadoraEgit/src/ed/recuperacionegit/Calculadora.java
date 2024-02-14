package ed.recuperacionegit;

import java.util.Scanner;

public class Calculadora {
public static void suma() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca un numero");
	Double numero1 = sc.nextDouble();
	System.out.println("Introduzca el segundo numero");
	Double numero2 = sc.nextDouble();
	Double suma = numero1 + numero2;
	System.out.println("El resultado es " +suma);
}
public static void resta() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca un numero");
	Double numero1 = sc.nextDouble();
	System.out.println("Introduzca el segundo numero");
	Double numero2 = sc.nextDouble();
	Double resta = numero1 - numero2;
	System.out.println("El resultado es " +resta);
}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("-----------");
		System.out.println("Elija una opción");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		int opcion = sc.nextInt();
	
	if(opcion == 1) {
	suma();
	}
	if(opcion == 2) {
		resta();
	}
	
	}

}
