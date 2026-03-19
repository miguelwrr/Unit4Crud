package ej2;

import java.util.ArrayList;

class GestionArticulos {
	
	private ArrayList<Articulo> articulos;
	
	GestionArticulos(){
		articulos = new ArrayList<>();
	}
	
	void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}
	ArrayList<Articulo> getArticulos(){
		return articulos;
	}
	
	boolean altaArticulo(Articulo articulo) {
		boolean res = false;
		if(!existeArticulo(articulo)) {
			articulos.add(articulo);
			res = true;
		}
		return res;
	}
	
	boolean bajaArticulo(String nombre) {
		boolean res = false;
		Articulo articulo = buscarArticuloPorNombre(nombre);
		if(articulo != null) {
			articulos.remove(articulo);
			res = true;
		}
		
		return res;
	}
	
	boolean modificarArticulo(String nombre, double precio) {
		boolean res = false;
		Articulo articulo = buscarArticuloPorNombre(nombre);
		if(articulo != null) {
			articulo.setPrecio(precio);
			if(articulo.getPrecio() == precio) {
				res = true;
			}
		}
		return res;
	}
	
	boolean entradaMercancia(String nombre, int cantidad) {
		boolean res = false;
		Articulo articulo = buscarArticuloPorNombre(nombre);
		if(articulo != null) {
			articulo.almacenar(cantidad);
			res = true;
		}
		return res;
	}
	
	boolean salidaMercancia(String nombre, int cantidad) {
		boolean res = false;
		Articulo articulo = buscarArticuloPorNombre(nombre);
		if(articulo != null && articulo.vender(cantidad)) {
			res = true;
		}
		return res;
	}
	
	boolean existeArticulo(Articulo articulo) {
		boolean res = false;
		for(Articulo art : articulos) {
			if(art.equals(articulo)) {
				res = true;
				break;
			}
		}
		return res;
	}
	boolean existeArticulo(String nombre) {
		Articulo articulo = new Articulo(nombre);
		return existeArticulo(articulo);
	}
	
	private Articulo buscarArticuloPorNombre(String nombre) {
		Articulo res = null;
		for(Articulo art : articulos) {
			if(art.getNombre().equalsIgnoreCase(nombre)) {
				res = art;
				break;
			}
		}
		return res;
	}
	
	
	
	@Override
	public String toString() {
		String res = "";
		for(Articulo art : articulos) {
			res += art + "\n";
		}
		return res;
	}

}
