package centraldata.modelo;

public class Articulo {

	
	private String codigoArticulo;
	private String descArticulo;
	private String precioArt;
	
	public Articulo(String codigoArticulo, String descArticulo, String precioArt) {
		this.codigoArticulo = codigoArticulo;
		this.descArticulo = descArticulo;
		this.precioArt = precioArt;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getDescArticulo() {
		return descArticulo;
	}

	public void setDescArticulo(String descArticulo) {
		this.descArticulo = descArticulo;
	}

	public String getPrecioArt() {
		return precioArt;
	}

	public void setPrecioArt(String precioArt) {
		this.precioArt = precioArt;
	}
	
}
