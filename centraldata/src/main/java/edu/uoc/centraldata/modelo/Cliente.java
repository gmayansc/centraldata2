package centraldata.modelo;

public abstract class Cliente {
	
	private String NIF;
	private String nombreCliente;
	
	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}
        
        //CAMBIO PARA PRUEBAS
        
        //NOS VA A SALIR UN PROYECTO ESPECTACULAR ;)

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public abstract String tipoCliente();

	public abstract float calcAnual();

	public abstract float descuentoEnv();
	

}
