package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import edu.uoc.centraldata.dao.hibernate.HibernatePedidoDAO;
import edu.uoc.centraldata.modelo.Pedido;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PedidosMostrarPendientesControlador implements Initializable {

	@FXML
	private TextArea txtPedidosPendientesMostrar;
	@FXML
	private Button btnVolver;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		try {

			System.out.println("Hace la lógica de mostrar los pedidos de la base de datos");
			String cadena = "";
			List<Pedido> pedidos = HibernatePedidoDAO.getPedidosPendientes();

			for (Pedido ped : pedidos) {
				cadena += ped.toString() + "\n";
			}
			this.txtPedidosPendientesMostrar.setText(cadena);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void volverPedidos(ActionEvent event) {
		System.out.println("Se abre la ventana ped");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Pedidos.fxml"));
			Parent root;

			root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
			myStage.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
