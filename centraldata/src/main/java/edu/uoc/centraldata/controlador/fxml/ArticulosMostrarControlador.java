package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import edu.uoc.centraldata.dao.hibernate.HibernateArticuloDAO;
import edu.uoc.centraldata.dao.hibernate.HibernateClienteDAO;
import edu.uoc.centraldata.modelo.Articulo;
import edu.uoc.centraldata.modelo.Cliente;
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

public class ArticulosMostrarControlador implements Initializable {

	@FXML
	private TextArea txtArticuloMostrar;
	@FXML
	private Button btnVolver;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		try {

			System.out.println("Hace la lógica de mostrar los articulos de la base de datos");
			String cadena = "";
			List<Articulo> articulos = HibernateArticuloDAO.getAllArticulos();

			for (Articulo art : articulos) {
				cadena += art.toString() + "\n";
			}
			this.txtArticuloMostrar.setText(cadena==null?"No hay articulos":cadena);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void volverArticulos(ActionEvent event) {
		System.out.println("Se abre la ventana Articulos");
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/edu/uoc/centraldata/vista/fxml/Articulos.fxml"));
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
