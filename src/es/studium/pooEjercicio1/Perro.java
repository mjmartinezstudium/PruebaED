package es.studium.pooEjercicio1;

public class Perro
{
	private Raza raza;
	private double tamanio;
	private int edad;
	private String color;
	
	public Perro() {
		raza = new Raza();
		tamanio = 0.0;
		edad = 0;
		color = "";
	}
	
	public Perro(Raza raza, double tamanio, int edad, String color) {
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}
	
	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
