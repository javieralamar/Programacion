package Ejercicio4;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 4 Tema 7- Herencia
 * 
 */
public class Main {

	public static void main(String[] args) {
		Electrodomestico ListaElect[]=new Electrodomestico[10];
		ListaElect[0]=new Electrodomestico(3000, "Rojo",'A',10);
		ListaElect[1]=new Lavadora(150, 30);
		ListaElect[2]=new Television(3000,"Rojo",'A',10, 42, false);
		ListaElect[3]=new Electrodomestico(3000, "Rojo",'A',10);
		ListaElect[4]=new Electrodomestico(3000, "Rojo",'A',10);
		ListaElect[5]=new Lavadora(3000,"Rojo",'A',10,50);
		ListaElect[6]=new Television(250, 70);
		ListaElect[7]=new Lavadora(3000, "Rojo",'A',10, 15);
		ListaElect[8]=new Television(3000, "Rojo",'A',10, 20, false);
		ListaElect[9]=new Electrodomestico(3000, "Rojo",'A',10);
		
		 double sumaElectrodomes=0;
	        double sumaTv=0;
	        double sumaLavad=0;
	        /**
	         * 
	         * Con el comando instanceof vamos a saber si el hueco ocupado en la Array es del tipo que nosotros le definimos.
	         * Así con los siguientes condicionales podemos saber el precio final de cada tipo, teniendo en cuenta que electrodomestico
	         * también tendrá presentes las clases lavadora y television dentro. 
	         */
	        
	        for(int i=0;i<ListaElect.length;i++){
	        if(ListaElect[i] instanceof Electrodomestico){
	        	sumaElectrodomes=sumaElectrodomes+ListaElect[i].precioFinal();
            }
            if(ListaElect[i] instanceof Lavadora){
            	sumaLavad=sumaLavad+ListaElect[i].precioFinal();
            }
            if(ListaElect[i] instanceof Television){
            	sumaTv=sumaTv+ListaElect[i].precioFinal();
            }
        }
	}

}
