package es.studium.banco;

public class Cuenta {
	private int numCuenta;
	private double saldo;
	private Cliente cliente;

	public Cuenta() {
		setNumCuenta(0);
		saldo = 0.0;
		//setSaldo(0.0);
		setCliente(new Cliente());
	}

	public Cuenta(int numCuenta, double saldo, Cliente cliente) {
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setCliente(cliente);
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
