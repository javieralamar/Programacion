package Ejercicio5;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 5 Tema 7- Herencia
 * 
 */
public class Main {

	public static void main(String[] args) {
		double PrecioTotal=0;
		/**
		 * Creación de la Array sin necesidad de pedir al usuario los datos
		 */
		Producto[] Productos = new Producto[3];
		
		Productos[0] = new Producto("Hamburguesas", 5);
		Productos[1] = new NoPerecedero("Platanos","Fruta",15);
		Productos[2] = new Perecedero (3,"Pasta",9);
		
		/**
		 * Mediante este condicional lo que conseguimos es que se pueda recorrer la array y su contenido almacenado mientras que con el 
		 * Productos[i].calcular(5) le decimos que recorra la array y por cada instancia que tiene se utiliza la funcion calcular
		 * de su clase. 
		 */
	for (int i=0;i<Productos.length;i++) {
		PrecioTotal= PrecioTotal + Productos[i].calcular(5);
	}
	
		System.out.print("El total es el siguiente:" +PrecioTotal);
		
	}

}
