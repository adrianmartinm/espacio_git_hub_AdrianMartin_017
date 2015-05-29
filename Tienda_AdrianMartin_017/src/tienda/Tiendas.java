package tienda;

public class Tiendas {
	String id_Tienda;
	String nombreTienda;
	String direccionTienda;
	
	// CONSTRUCTOR POR DEFECTO
	public Tiendas(){
	}
	
	// CONSTRUCTOR POR PARÁMETROS
	public Tiendas(String id_Tienda, String nombreTienda, String direccionTienda){
		this.id_Tienda=id_Tienda;
		this.nombreTienda=nombreTienda;
		this.direccionTienda=direccionTienda;
	}
	
}
