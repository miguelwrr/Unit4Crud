package ej2;

class Articulo {
	
	//Atributos
	private String nombre = "Unnamed";
	private double precio;
	private final int IVA = 21;
	private int cuantosQuedan;
	
	//Constructor
	Articulo(String nombre, double precio, int cuantosQuedan){
		setNombre(nombre);
		setPrecio(precio);
		setCuantosQuedan(cuantosQuedan);
	}
	Articulo(String nombre){
		this(nombre, 0, 0);
	}
	
	Articulo(String nombre, double precio){
		this(nombre, precio, 0);
	}
	
	//Getters y Setters
	void setNombre(String nombre) {
		nombre = nombre.trim();
		if(checkNombre(nombre))
			this.nombre = nombre;
	}
	String getNombre() {
		return nombre;
	}
	
	void setPrecio(double precio) {
		if(precio>0)
			this.precio = precio;
	}
	double getPrecio() {
		return precio;
	}
	
	int getIVA() {
		return IVA;
	}
	
	void setCuantosQuedan(int cantidad) {
		if(cantidad>=0)
			cuantosQuedan = cantidad;
	}
	int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	//Métodos
	double getPVP() {
		return precio * 1 + (double) IVA/100;
	}
	
	double getPVPDescuento(int descuento) {
		return getPVP() - getPVP() * (100 - descuento)/100;
	}
	
	boolean vender(int cantidad) {
		boolean res = false;
		if(cuantosQuedan>=cantidad) {
			cuantosQuedan -= cantidad;
			res = true;
		}
		return res;
	}
	
	void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
	}
	
	
	
	private boolean checkNombre(String nombre) {
		boolean res = false;
		for(char character : nombre.toCharArray()) {
			if(character != ' ') {
				res = true;
				break;
			}
		}
		return res;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Precio: %.2f€ - IVA: %d%% - PVP: %.2f€", nombre, precio, IVA, getPVP());
	}
	
	public boolean equals(Articulo a) {
		boolean res = false;
		if(nombre.equalsIgnoreCase(a.nombre)) {
			res = true;
		}
		return res;
	}

}
