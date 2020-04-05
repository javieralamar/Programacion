package Ejercicio4;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 4 Tema 7- Herencia
 * 
 */
public class Lavadora extends Electrodomestico {

	private int Carga;

	
	public int getCarga() {
		return Carga;
	}

	public void setCarga(int carga) {
		Carga = carga;
	}
	public Lavadora () {
		
	}
	public Lavadora (int precio,int peso) {
		this.PrecioBase=precio;
		this.Peso=peso;
	}
	public Lavadora (int precio,String color,char consumoEnergetico,int peso,int Carga) {
		this.PrecioBase=precio;
		this.Peso=peso;
		this.Carga=5;
		this.Color=color;
		this.ConsumoEnergetico=consumoEnergetico;
	}
	/**
	 * Con este metodo sobreescrito le sumaremos el coste adicional de 50 si la carga pasa los 30 kilos
	 */
@Override
	public double precioFinal() {

        double Preciofinal =super.precioFinal();
        if (Carga>30){
        	Preciofinal=Preciofinal+50;
        }
  
        return Preciofinal;
    }
}
	
	

