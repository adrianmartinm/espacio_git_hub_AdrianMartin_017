package tienda;

public class Vendedores {
	String id_Vendedor;
	String nombreVendedor;
	String apellidosVendedor;
	
	// CONSTRUCTOR POR DEFECTO
	public Vendedores(){
	}
	
	// CONSTRUCTOR POR PAR�METROS
	public Vendedores(String id_Vendedor, String nombreVendedor, String apellidosVendedor){
		this.id_Vendedor=id_Vendedor;
		this.nombreVendedor=nombreVendedor;
		this.apellidosVendedor=apellidosVendedor;
	}
	
}
