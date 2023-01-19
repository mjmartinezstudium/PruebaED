package es.studium.banco;

public class Cliente {

	//Atributos
	private String dni;
	private String nombre;
	private String direccion;

	//Constructor vac�o o por defecto
	public Cliente() {
		setDni("");
		setNombre("");
		setDireccion("");
	}

	//Constructor por par�metros
	public Cliente(String dni, String nombre, String direccion) {
		setDni(dni);
		setNombre(nombre);
		setDireccion(direccion);
	}

	//M�tdos get y set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
