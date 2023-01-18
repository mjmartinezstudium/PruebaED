package es.studium.pooEjercicio1;

public class Principal
{

	public static void main(String[] args)
	{

		Raza raza1 = new Raza("Pastor belga");
		Raza raza2 = new Raza("Fox terrier");
		Raza raza3 = new Raza("Braco alemán");
		Raza raza4 = new Raza("Bichón maltés");
		Raza raza5 = new Raza("Dálmata");
		
		Perro perro1 = new Perro(raza1, 1.2, 10, "marrón");
		Perro perro2 = new Perro(raza2, 0.5, 2, "blanco");
		Perro perro3 = new Perro(raza3, 0.9, 5, "marrón loscuro");
		Perro perro4 = new Perro(raza4, 0.5, 3, "blanco");
		Perro perro5 = new Perro(raza5, 1.2, 8, "blanco y negro");
		
		System.out.println("La raza del perro1 es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es " + perro1.getTamanio()
							+ ", su edad es: " + perro1.getEdad() + " y su color es: " + perro1.getColor());
		System.out.println("La raza del perro1 es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es " + perro2.getTamanio()
							+ ", su edad es: " + perro2.getEdad() + " y su color es: " + perro2.getColor());
		System.out.println("La raza del perro1 es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es " + perro3.getTamanio()
							+ ", su edad es: " + perro3.getEdad() + " y su color es: " + perro3.getColor());
		System.out.println("La raza del perro1 es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es " + perro4.getTamanio()
							+ ", su edad es: " + perro4.getEdad() + " y su color es: " + perro4.getColor());
		System.out.println("La raza del perro1 es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es " + perro5.getTamanio()
							+ ", su edad es: " + perro5.getEdad() + " y su color es: " + perro5.getColor());
		
	}

}
