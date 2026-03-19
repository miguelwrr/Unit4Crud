package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		GestionAlumnos alumnos = new GestionAlumnos();
		Scanner scanner = new Scanner(System.in);
		run(alumnos, scanner);
		scanner.close();

	}
	
	static void run(GestionAlumnos alumnos, Scanner scanner) {
		int opcion;
		String nombre;
		double nota;
		
		do {
			menu();
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch(opcion) {
				case 1:
					System.out.println(alumnos);
					break;
				case 2:
					System.out.print("Introduce nombre del nuevo alumno: ");
					nombre = scanner.nextLine();
					System.out.print("Introduce nota del nuevo alumno: ");
					nota = scanner.nextDouble();
					scanner.nextLine();
					if(alumnos.addAlumno(new Alumno(nombre, nota))) {
						System.out.println("Alumno añadido con éxito");
					}else {
						System.out.println("El alumno no se ha podido añadir.");
					}
					break;
				case 3:
					System.out.print("Introduce nombre del alumno a modificar: ");
					nombre = scanner.nextLine();
					if(alumnos.buscarAlumno(nombre)) {
						System.out.print("Introduce nueva nota para el alumno: ");
						nota = scanner.nextDouble();
						scanner.nextLine();
						if(alumnos.modifyAlumno(nombre, nota)) System.out.println("Nota modificada con éxito.");
						else System.out.println("No se ha podido modificar la nota.");
					}
					break;
				case 4: 
					System.out.print("Introduce el nombre del alumno a borrar: ");
					nombre = scanner.nextLine();
					if(alumnos.deleteAlumno(nombre)) System.out.println("Alumno borrado con éxito.");
					else System.out.println("El alumno no se ha podido eliminar");
					break;
				case 5:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
			if(opcion!=5) {
				System.out.println("Pulse Enter para volver al menú.");
				scanner.nextLine();
			}
			
		}while(opcion!=5);
		
		
		
	}
	
	private static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("===================");
		System.out.println();
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
		System.out.println();
	}

}
