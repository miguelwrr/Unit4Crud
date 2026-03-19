package ej1;

import java.util.ArrayList;

public class GestionAlumnos {

	//Atributo
	private ArrayList<Alumno> alumnos;
	
	//Constructor
	GestionAlumnos() {
		this.alumnos = new ArrayList<>();
	}
	
	//Getters y Setters
	ArrayList<Alumno> getAlumnos(){
		return alumnos;
	}
	void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
	//Métodos
	
	boolean addAlumno(Alumno alumno) {
		boolean res = !buscarAlumno(alumno);
		if(res) alumnos.add(alumno);	
		return res;
	}
	
	private boolean buscarAlumno(Alumno alumno) {
		boolean res = false;
		for(Alumno al : alumnos) {
			if(al.equals(alumno)) {
				res = true;
				break;
			}
		}
		return res;
	}
	boolean buscarAlumno(String nombre) {
		boolean res = false;
		for(Alumno al : alumnos) {
			if(al.getNombre().equalsIgnoreCase(nombre)) {
				res = true;
				break;
			}
		}
		return res;
	}
	
	boolean modifyAlumno(String nombre, double nota) {
		boolean res = false;
		for(Alumno al : alumnos) {
			if(al.getNombre().equalsIgnoreCase(nombre)) {
				al.setNota(nota);
				if(al.getNota() == nota) res = true;
			}
		}
		return res;
	}
	
	boolean deleteAlumno(String nombre) {
		boolean res = false;
		for(Alumno al : alumnos) {
			if(al.getNombre().equalsIgnoreCase(nombre)) {
				alumnos.remove(al);
				res = true;
				break;
			}
		}
		return res;
	}
	
	
	@Override
	public String toString() {
		String res = "";
		for(Alumno al : alumnos) {
			res += al + "\n";
		}
		return res;
	}
}
