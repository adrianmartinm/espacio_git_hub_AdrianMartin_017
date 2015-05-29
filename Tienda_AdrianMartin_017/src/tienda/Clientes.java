package tienda;

public class Clientes {
	String id_Cliente;
	String nombreCliente;
	String apellidosClientes;
	
	// CONSTRUCTOR POR DEFECTO
	public Clientes(){
	}
	
	// CONSTRUCTOR POR PARÁMETROS
	public Clientes(String id_Cliente, String nombreCliente, String apellidosClientes){
		this.id_Cliente=id_Cliente;
		this.nombreCliente=nombreCliente;
		this.apellidosClientes=apellidosClientes;
	}
	
}
