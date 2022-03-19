package centraldata.modelo;


public class Pedido {
	
	private Cliente cliente;
	private Articulo articulo;
	private int numPedido;
	private String fechaHora;
	//descripcion articulo
	private int cantidad;
	//precio articulo
	private float costeEnvio;
	private float precioTotal;
	private boolean enviado;
	
	public Pedido(Cliente cli, Articulo art) {
		this.articulo = art;
		this.cliente = cli;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	public boolean pedidoEnviado() {
		return false;
	}
	
	public float precioEnvio() {
		return 0;
	}
	
	@Override
	public String toString() {
		String cadena = "Pedido número: " + numPedido;
		cadena += "\nFecha y hora: " + fechaHora;
		cadena += "\nNIF cliente: " + this.cliente.getNIF();
		cadena += "\nNombre cliente: " + this.cliente.getNombreCliente();
		cadena += "\nCódigo Artículo: " + this.articulo.getCodigoArticulo();
		cadena += "\nDescripción artículo: " + this.articulo.getDescArticulo();
		cadena += "\nCantidad de artículos: " + cantidad;
		cadena += "\nPrecio del artículo: " + this.articulo.getPrecioArt();
		cadena += "\nCoste del envío: " + costeEnvio;
		cadena += "\nPrecio total: " + precioTotal;
		cadena += "\nEnviado: " + (enviado == true ? "SI" : "NO");
		return cadena;
	}

}
