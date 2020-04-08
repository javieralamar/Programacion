package Ejercicio4;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 4 Tema 7- Herencia
 * 
 */
public class Television extends Electrodomestico {

	private double Resolucion;
	private boolean SmartTV;
	
public double getResolucion() {
		return Resolucion;
	}

	public void setResolucion(double resolucion) {
		Resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return SmartTV;
	}

	public void setSmartTV(boolean smartTV) {
		SmartTV = smartTV;
	}

public Television() {
	
}
public Television(int precio, int peso) {
	this.PrecioBase=precio;
	this.Peso=peso;
	
}
public Television(int precio,String color,char consumoEnergetico,int peso,double resolucion, boolean SmartTV) {
	this.PrecioBase=precio;
	this.Color=color;
	this.ConsumoEnergetico=consumoEnergetico;
	this.Peso=peso;
	
	
	resolucion=20;
	SmartTV= false;	
}
/**
 * Con este metodo sobreescrito le sumaremos el coste adicional si sobrepasa el numero de pulgadas y/o si es SmartTV
 */
@Override
	public double precioFinal() {
	
	double Preciofinal=super.precioFinal();
	
	if (this.Resolucion>40){
		Preciofinal=Preciofinal+PrecioBase*0.3;
    }
    if (SmartTV){
    	Preciofinal=Preciofinal+50;
    }

    return Preciofinal;
}


}
