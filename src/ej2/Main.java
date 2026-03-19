package ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GestionArticulos articulos = new GestionArticulos();
		run(scanner, articulos);
		scanner.close();

	}
	
	
	private static void run(Scanner scanner, GestionArticulos articulos) {
		int opcion;
		String nombre;
		int num;
		double precio;
		
		do {
			menu();
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(articulos);
				break;
			case 2:
				
			}
			
		}while(opcion != 7);
		
	}
	
	
	
	private static void menu() {
		System.out.println("GESTISIMAL");
		System.out.println("=============");
		System.out.println();
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
		System.out.println();
	}

}
