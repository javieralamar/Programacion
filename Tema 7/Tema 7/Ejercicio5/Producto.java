package Ejercicio5;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 5 Tema 7- Herencia
 * 
 */
public class Producto {

	private String Nombre;
	private double Precio;
	
	
	
	public Producto() {
		
	}
	public Producto (String nombre,double precio) {
		this.Nombre= nombre;
		this.Precio= precio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	/**
	 * Mediante el método toString devolveremos en una linea los datos de los atributos Nombre y precio para así
	 * poder verlo de manera más visual.
	 * 
	 */
	
	public String toString() {
		return "Nombre:"+ Nombre +" "+ "Precio:"+ Precio +".";
	}
	
	public double calcular(int Cantidad) {
		return Precio*Cantidad;
		
	}
}
