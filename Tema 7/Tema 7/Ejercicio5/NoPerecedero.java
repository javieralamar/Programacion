package Ejercicio5;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 5 Tema 7- Herencia
 * 
 */
public class NoPerecedero extends Producto {

	private String Tipo;
	
	
	
	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		Tipo = tipo;
	}



	public NoPerecedero (String tipo, String nombre, double precio) {
		super(nombre,precio);
		this.Tipo=tipo;
	}
	



	/**
	 * Al hacerlo de esta manera sobreescribira el método original añadiendole los atributos de esta clase a lo que 
	 * ya tiene almacenado el método.
	 */
	@Override
	public String toString() {
		return super.toString() +"Tipo:"+ Tipo+".";
	}
}
