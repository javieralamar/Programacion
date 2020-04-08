package Ejercicio5;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 5 Tema 7- Herencia
 * 
 */
public class Perecedero extends Producto {

	private int DiaCaduca;

	public int getDiaCaduca() {
		return DiaCaduca;
	}

	public void setDiaCaduca(int diaCaduca) {
		DiaCaduca = diaCaduca;
	}
	
	
	/**
	 * Con el siguiente constructor guardamos los parametros nombre y precio en los atributos heredados super y cambiamos  
	 * el contenido de DiaCaduca.
	 */
	public Perecedero (int DiaCaduca, String nombre, double precio) {
		super(nombre,precio);
		this.DiaCaduca=DiaCaduca;
	}
	/**
	 * Al hacerlo de esta manera sobreescribira el método original añadiendole los atributos de esta clase a lo que 
	 * ya tiene almacenado el método.
	 */
	@Override
	public String toString() {
		return super.toString() +"Dias para que caduque:"+ DiaCaduca+".";
	}
	
	/**
	 * Mediante este metodo podemos obtener el precio final del producto después de aplicar el descuento necesario,
	 * para este caso lo más facil era utilizar un switch en mi opinion, dado que el numero de dias que caduca 
	 * es un atributo en si por lo tanto podemos utilizarlo para crear los diferentes tipos de caso y asi 
	 * calcular su precio final.
	 * 
	 */
	
	
	@Override
	public double calcular (int cantidad) {
		
		double PrecioFinal = super.calcular(cantidad);
		
		switch (DiaCaduca) {
		case 1:
			PrecioFinal= PrecioFinal/4;
			break;
		case 2:
			PrecioFinal=PrecioFinal/3;
			break;
		case 3:
			PrecioFinal=PrecioFinal/2;
			break;
			
		}
		return PrecioFinal;
		
		
	}
	
}
