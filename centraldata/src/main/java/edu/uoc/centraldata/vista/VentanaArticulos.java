
package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.ArticuloControlador;
import java.util.Scanner;

public class VentanaArticulos extends VentanaMenu{
    
    static Scanner entrada = new Scanner(System.in);
            

    public static void pintarMenu(){
        System.out.println("\n =========== GESTION DE ARTÍCULOS ===========\n");
        System.out.println(" 1. Añadir un artículo");
        System.out.println(" 2. Mostrar los artículos");
        System.out.println(" 3. Volver");
    
        
        
        int opcionMenu = Integer.parseInt(entrada.nextLine());
        
        
         switch (opcionMenu) {
            case 1:
                crearArticulo();
                break;
            case 2: 
                mostrarArticulos();
                break;
            case 3:
                
                break;
            case 4:
                break;
            default:
                break;
        };
        

    
    
    }
    
    public static void crearArticulo(){
        
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
    
public static void mostrarArticulos(){
        
     int codigo;
     String descripcion;
     float precio;
     float gastosEnvio;
     int tiempo;
}
    
}

//añadirArticulo(): void
//mostrarArticulos(): void
//salir(): void