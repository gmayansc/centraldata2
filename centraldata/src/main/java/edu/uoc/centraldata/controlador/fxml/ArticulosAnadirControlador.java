package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import edu.uoc.centraldata.controlador.ArticuloControlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ArticulosAnadirControlador implements Initializable {

	@FXML
	private TextField txtArticuloDesc;
	@FXML
	private TextField txtArticuloPrecio;
	@FXML
	private TextField txtArticuloGastos;
	@FXML
	private TextField txtArticuloTiempo;
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
	private void anadirArticulo(ActionEvent event) {

		try {
			ArticuloControlador.anadirArticulo(this.txtArticuloDesc.getText(),
					Float.parseFloat(this.txtArticuloPrecio.getText()),
					Float.parseFloat(this.txtArticuloGastos.getText()),
					Integer.parseInt(this.txtArticuloTiempo.getText())
					);
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Articulos.fxml"));
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
	private void volverArticulos(ActionEvent event) {
		System.out.println("Se abre la ventana Articulos");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Articulos.fxml"));
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
