package es.studium.banco;

public class TestBanco {
	public static void main(String[] args) {
		
		/*Creamos dos objetos de tipo Cliente usando el constructor por parámetros.*/
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		/*Creamos dos objetos de tipo Cuenta usando el constructor por parámetros.*/
		Cuenta cA = new Cuenta(48151, 100, antonio);
		Cuenta cB = new Cuenta(62342, 200, beatriz);

		/*Imprimimos por pantalla el nombre del cliente y su saldo,
		 * usando el objeto de tipo Cuenta.*/
		System.out.println("La cuenta de " + cA.getCliente().getNombre() + " tiene " + cA.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cB.getCliente().getNombre() + " tiene " + cB.getSaldo() + " euros.");

		cB.setSaldo(cB.getSaldo() - 50);
		cA.setSaldo(cA.getSaldo() + 50);

		System.out.println("La cuenta de " + cA.getCliente().getNombre() + " tiene " + cA.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cB.getCliente().getNombre() + " tiene " + cB.getSaldo() + " euros.");
	}



}
