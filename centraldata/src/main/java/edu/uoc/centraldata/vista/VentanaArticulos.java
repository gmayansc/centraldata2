package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.ArticuloControlador;

import java.util.Scanner;

public class VentanaArticulos extends VentanaMenu {

    static Scanner entrada = new Scanner(System.in);
    

    public static void pintarMenu() {

        boolean salir = false;
        while (!salir) {
            System.out.println("\n =========== GESTION DE ARTÍCULOS ===========\n");
            System.out.println(" 1. Añadir un artículo");
            System.out.println(" 2. Eliminar un artículo");
            System.out.println(" 3. Mostrar los artículos");
            System.out.println(" 4. Volver");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    menuAnadirArticulo();
                    break;
                case 2:
                    menuEliminarArticulo();
                    break;
                case 3:
                    ArticuloControlador.leerLista();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }

    public static void menuAnadirArticulo() {
        int codigo;
        String descripcion;
        float precio;
        float gastosEnvio;
        int tiempo;

        System.out.println("\n =========== NUEVO ARTÍCULO ===========\n");
        System.out.println(" Introduce el código del artículo:");
        codigo = Integer.parseInt(entrada.nextLine());
        System.out.println(" Introduce la descripción del artículo:");
        descripcion = entrada.nextLine();
        System.out.println(" Introduce el precio:");
        precio = Float.parseFloat(entrada.nextLine());
        System.out.println(" Introduce los gastos de envío:");
        gastosEnvio = Float.parseFloat(entrada.nextLine());
        System.out.println(" Introduce el tiempo de preparación:");
        tiempo = Integer.parseInt(entrada.nextLine());

        ArticuloControlador.anadirArticulo(codigo, descripcion, precio, gastosEnvio, tiempo);

    }
;
    public static void menuEliminarArticulo() {
        int codigo;

        System.out.println("\n =========== ELIMINAR ARTÍCULO ===========\n");
        System.out.println(" Introduce el código del artículo:");
        codigo = Integer.parseInt(entrada.nextLine());

        ArticuloControlador.eliminarArticulo(codigo);

    }
}
