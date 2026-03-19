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
				System.out.println();
				break;
			case 2:
				System.out.print("Introduce nombre del artículo a dar de alta: ");
				nombre = scanner.nextLine();
				System.out.print("Introduce su precio: ");
				precio = scanner.nextDouble();
				scanner.nextLine();
				if(articulos.altaArticulo(new Articulo(nombre, precio))) 
					System.out.println("%s con precio %.2f€ ha sido registrado exitosamente.");
				else System.out.println("No se ha podido dar de alta el artículo.");
				System.out.println();
				break;
			case 3:
				System.out.print("Introduce nombre del artículo a dar de baja: ");
				nombre = scanner.nextLine();
				if(articulos.bajaArticulo(nombre))
					System.out.println("El producto se ha dado de baja exitosamente.");
				else System.out.println("No se ha podido dar de baja el artículo");
				System.out.println();
				break;
			case 4:
				System.out.print("Introduce nombre del artículo cuyo precio deseas modificar: ");
				nombre = scanner.nextLine();
				if(!articulos.existeArticulo(nombre)) {
					System.out.println("El artículo indicado no existe.\n");
					break;
				}
				System.out.print("Introduce nuevo precio: ");
				precio = scanner.nextDouble();
				scanner.nextLine();
				if(articulos.modificarArticulo(nombre, precio))
					System.out.println("El artículo se ha modificado correctamente.");
				else System.out.println("El artículo no se ha podido modificar.");
				System.out.println();
				break;
			case 5:
				System.out.print("Introduce nombre de la mercancía: ");
				nombre = scanner.nextLine();
				if(!articulos.existeArticulo(nombre)) {
					System.out.println("El artículo indicado no existe.\n");
					break;
				}
				
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
