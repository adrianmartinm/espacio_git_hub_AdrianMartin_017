package tienda;

public class Ventas {
	String id_venta;
	String fecha_hora;
	String precioVenta;
	
	// CONSTRUCTOR POR DEFECTO
	public Ventas(){
	}
	
	// CONSTRUCTOR POR PARÁMETROS
	public Ventas(String id_venta, String fecha_hora, String precioVenta){
		this.id_venta=id_venta;
		this.fecha_hora=fecha_hora;
		this.precioVenta=precioVenta;
	}
	
}
