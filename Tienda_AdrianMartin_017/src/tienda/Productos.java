package tienda;

public class Productos {
	String id_Producto;
	String nombreProducto;
	String descripcionProducto;
	
	// CONSTRUCTOR POR DEFECTO
	public Productos(){
	}
	
	// CONSTRUCTOR POR PARÁMETROS
	public Productos(String id_Producto, String nombreProducto, String descripcionProducto){
		this.id_Producto=id_Producto;
		this.nombreProducto=nombreProducto;
		this.descripcionProducto=descripcionProducto;
	}
	
}
