package edu.uoc.centraldata.controlador.fxml;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import edu.uoc.centraldata.controlador.ArticuloControlador;
import edu.uoc.centraldata.controlador.ClienteControlador;
import edu.uoc.centraldata.controlador.PedidoControlador;
import edu.uoc.centraldata.modelo.Articulo;
import edu.uoc.centraldata.modelo.Cliente;
import edu.uoc.centraldata.vista.VentanaClientes;
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

public class PedidosAnadirControlador implements Initializable {

	@FXML
	private TextField txtPedidoIDCliente;
	@FXML
	private TextField txtPedidoIDArticulo;
	@FXML
	private TextField txtPedidoUnidades;
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
	private void anadirPedido(ActionEvent event) {

		try {
			System.out.println("Hace la lógica de introducir el pedido en la base de datos");
			

	        int unidades;
	        LocalDate fecha;
	        LocalTime hora;
	        double precioFinal;
	        boolean envio = false;
	        Cliente cli;
	        Articulo art;

	        cli = ClienteControlador.buscar(this.txtPedidoIDCliente.getText());

	        if (cli == null) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("El cliente no existe selecciona otro o crea uno nuevo");
				alert.showAndWait();
	        }

	        art = ArticuloControlador.getArticulo(Integer.parseInt(this.txtPedidoIDArticulo.getText()));

	        if (art == null) {
	        	Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("El articulo no existe y debes crearlo primero");
				alert.showAndWait();
	        } else {
	            unidades = Integer.parseInt(this.txtPedidoUnidades.getText());
	            fecha = LocalDate.now();
	            hora = LocalTime.now();
	            PedidoControlador.anadirPedido(cli, art, unidades, fecha, hora);
	            
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/uoc/centraldata/vista/fxml/Pedidos.fxml"));
	            Parent root;
	            
	            root = loader.load();
	            
	            Scene scene = new Scene(root);
	            Stage stage = new Stage();
	            
	            stage.setScene(scene);
	            stage.show();
	            
	            Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
	            myStage.close();
	            
	        }
	        
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private void volverPedidos(ActionEvent event) {
		System.out.println("Se abre la ventana Pedidos");
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
