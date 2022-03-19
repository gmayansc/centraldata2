package centraldata.modelo;

public class ClientePremium extends Cliente{
	public  String tipoCliente() {
		return null;
	}

	public  float calcAnual() {
		return 0;
	}

	public  float descuentoEnv() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "hola";
	}

}
