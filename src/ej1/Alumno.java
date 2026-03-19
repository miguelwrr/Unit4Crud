package ej1;

class Alumno {

	//Atributos
	private String nombre = "Sin nombre";
	private double nota = 0;
	
	//Constructores
	Alumno(String nombre, double nota){
		setNombre(nombre);
		setNota(nota);
	}
	Alumno(String nombre){
		this(nombre, 0);
	}
	
	//Getters y Setters
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		nombre = nombre.trim();
		if(!nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	double getNota() {
		return nota;
	}
	void setNota(double nota) {
		if(nota>=0 && nota<=10) {
			this.nota = nota;
		}
	}
	
	//Métodos
	@Override
	public String toString() {
		return String.format("%s %.2f", nombre, nota);
	}
	
	public boolean equals(Alumno al) {
		boolean res = false;
		
		if(nombre.equalsIgnoreCase(al.nombre)) {
			res = true;
		}
		return res;
	}
	
}
