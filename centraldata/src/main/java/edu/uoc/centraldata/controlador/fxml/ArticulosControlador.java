package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ArticulosControlador implements Initializable {

	@FXML
	private Button btnAnadir;
	@FXML
	private Button btnEliminar;
	@FXML
	private Button btnMostrar;
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
			System.out.println("Se abre la ventana ArticulosAñadir");
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/edu/uoc/centraldata/vista/fxml/ArticulosAñadir.fxml"));
			Parent root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnAnadir.getScene().getWindow();
			myStage.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void eliminarArticulo(ActionEvent event) {
		System.out.println("Se abre la ventana Pedidos");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/ArticulosEliminar.fxml"));
			Parent root;

			root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnEliminar.getScene().getWindow();
			myStage.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void mostrarArticulos(ActionEvent event) {
		System.out.println("Se abre la ventana ArticulsMostrar");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/ArticulosMostrar.fxml"));
			Parent root;

			root = loader.load();

			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnMostrar.getScene().getWindow();
			myStage.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void volverMenu(ActionEvent event) {
		System.out.println("Se abre la ventana ArticulsMostrar");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Menu.fxml"));
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
