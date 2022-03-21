package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.ArticuloControlador;
import edu.uoc.centraldata.modelo.Articulo;
import java.util.ArrayList;
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
        System.out.println("El artículo se ha creado.");

    }
;

}
    
    /* public static Articulo Articulo;
    public static ArrayList listaArticulo;
    
    static Scanner teclado = new Scanner(System.in);
    
    @SuppressWarnings({"empty-statement", "null"})
   
    static int opcion = teclado.nextInt();
            
        char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción (1,2,3,4): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
        }


    /*public static void pintarMenu(){
            boolean salir = false;
            char opcio;
            do {
        System.out.println("\n =========== GESTION DE ARTÍCULOS ===========\n");
        System.out.println(" 1. Añadir un artículo");
        System.out.println(" 2. Eliminar un artículo");
        System.out.println(" 3. Mostrar los artículos");
        System.out.println(" 4. Volver");
     
         switch (opcion) {
            case '1':
                        String Codigo;
                        String Descripcion;
                        double Precio;
                        double GastosEnvio;
                        int Tiempo;
                        
                    System.out.println("Código");
                        Codigo = teclado.nextLine();
                    System.out.println("Descripción");
                        Descripcion=teclado.nextLine();
                    System.out.println("Precio");
                        Precio=teclado.nextInt();
                    System.out.println("Gastos de Envío");
                        GastosEnvio=teclado.nextInt();
                    System.out.println("Tiempo");
                        Tiempo=teclado.nextInt();   
                for (int i = 0; i < listaArticulo.size(); i++) {
                    if (Codigo.equals(Articulo.getCodigo())) {
                    System.out.println("Este Articulo ya existe");
                            break;          
                        }else{
                            listaArticulo.add(new Articulo(Codigo, Descripcion, Precio, GastosEnvio, Tiempo));
                            break;
                        }
                    }
                    break;
                
            case '2':
                    System.out.println("Codigo");
                        Codigo=teclado.nextLine();
                for (int i = 0; i < listaArticulo.size(); i++) {
                    if (Codigo.equals(Articulo.getCodigo())) {    
                            listaArticulo.remove(Articulo);
                        }else{
                    System.out.println("No existe el Articulo");
                        }   
                    }
                break;
                
            case '3':
                    System.out.println("Codigo");
                        Codigo=teclado.nextLine();
                for (int i = 0; i < listaArticulo.size(); i++) {
                    if (Codigo.equals(Articulo.getCodigo())) {    
                    System.out.println("Listado de Articulos (" + VentanaArticulos.Articulo.getCodigo() + "):");                                      
                        }else{
                    System.out.println("No hay Artículos");
                        }   
                    }
                break;
                      
            case '4':
                }
                    } while (!salir);
                }
    }*/
