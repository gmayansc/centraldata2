package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import edu.uoc.centraldata.controlador.ClienteControlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClientesAnadirControlador implements Initializable {

	@FXML
	private TextField txtClienteNIF;
	@FXML
	private TextField txtClienteNombre;
	@FXML
	private TextField txtClienteDomicilio;
	@FXML
	private TextField txtClienteEmail;
	@FXML
	private TextField txtClienteTipo;
	@FXML
	private Button btnAnadir;
	@FXML
	private Button btnVolver;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void anadirCliente(ActionEvent event) {

		try {
			System.out.println("Hace la lógica de introducir el cliente en la base de datos");

			System.out.println("Los datos introducidos:");
			System.out.println("NIF : " + this.txtClienteNIF.getText());
			System.out.println("Nombre : " + this.txtClienteNombre.getText());
			System.out.println("Domicilio : " + this.txtClienteDomicilio.getText());
			System.out.println("Email : " + this.txtClienteEmail.getText());
			System.out.println("Tipo : " + this.txtClienteTipo.getText());

			while (!(this.txtClienteTipo.getText().equals("ESTANDARD")
					|| this.txtClienteTipo.getText().equals("PREMIUM"))) {
				this.txtClienteTipo.setText(null);
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("Debes introducir como tipo 'ESTANDARD' o 'PREMIUM' sin comillas");
				alert.showAndWait();

			}

			ClienteControlador.anadirCliente(this.txtClienteNIF.getText(), this.txtClienteNombre.getText(),
					this.txtClienteDomicilio.getText(), this.txtClienteEmail.getText(), this.txtClienteTipo.getText());

			// UNA VEZ INSERTADO REGRESA A LA PANTALLA ANTERIOR
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Clientes.fxml"));
			Parent root;

			root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
			myStage.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void volverClientes(ActionEvent event) {
		System.out.println("Se abre la ventana Clientes");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Clientes.fxml"));
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
