package Ejercicio4;
/**
 * 
 *@author Javier Alamar Esparza
 *
 *	Ejercicio 4 Tema 7- Herencia
 * 
 */
public class Electrodomestico {
protected int PrecioBase;
protected String Color;
protected char ConsumoEnergetico;
protected int Peso;


public Electrodomestico () {
	
}

public Electrodomestico (int PrecioBase,int Peso ) {
	this.PrecioBase= 100;
	this.Peso= 5;
}


public Electrodomestico (int PrecioBase,String Color,char ConsumoEnergetico, int Peso) {
	this.PrecioBase=100;
	this.Color="blanco";
	this.ConsumoEnergetico='F';
	this.Peso=5;
	
}

public int getPrecioBase() {
	return PrecioBase;
}

public void setPrecioBase(int precioBase) {
	PrecioBase = precioBase;
}

public String getColor() {
	return Color;
}
/**
 * Con el comando toLowercase pasaremos todo el string que hay a letras minusculas para no tener confusión en el codigo
 */

public void setColor(String color) {
	String auxiliar=color;
	Color=auxiliar.toLowerCase();
}

public char getConsumoEnergetico() {
	return ConsumoEnergetico;
}

public void setConsumoEnergetico(char consumoEnergetico) {
	ConsumoEnergetico = consumoEnergetico;
}

public int getPeso() {
	return Peso;
}

public void setPeso(int peso) {
	Peso = peso;
}
/**
 * Mediante la condicion del if comparamos todas las cajas del array con la letra del consumo para saber si esta entre
 * ellas o si tiene que cambiarla por la letra defecto F
 */

private void comprobarConsumo (char Letra) {
	char Array[]= {'A','B','C','D','E','F'};

	if(Letra == Array[0] || Letra == Array[1]
			|| Letra == Array[2] || Letra == Array[3]
				|| Letra == Array[4] || Letra == Array[5]) {
			this.ConsumoEnergetico = Letra;
		} else {
			this.ConsumoEnergetico = 'F';
		}	
	
}
/**
 * En el siguiente metodo analizamos la palabra que nos pasan con las opciones posbiles si no se pondra
 * el color por defecto Blanco
 */
private void comprobarColor(String color) {
	
	if(color == "negro" || color == "azul"
		|| color == "gris" || color == "rojo") {
		this.Color = color;
	} else {
		this.Color = "Blanco";
	}
}
/**
 * Con este switch y el condicional que le precede sumaremos dependiendo del tipo que sean el cargo 
 * correspondiente.
 */
public double precioFinal(){
    double plus=0;
    switch(ConsumoEnergetico){
        case 'A':
            plus=plus+100;
            break;
        case 'B':
            plus=plus+80;
            break;
        case 'C':
            plus=plus+60;
            break;
        case 'D':
            plus=plus+50;
            break;
        case 'E':
            plus=plus+30;
            break;
        case 'F':
            plus=plus+10;
            break;
    }

    if(Peso>=0 && Peso<19){
        plus=plus+10;
    }else if(Peso>=20 && Peso<49){
        plus=plus+50;
    }else if(Peso>=50 && Peso<=79){
        plus=plus+80;
    }else if(Peso>=80){
        plus=plus+100;
    }

    return PrecioBase+plus;
}


}
