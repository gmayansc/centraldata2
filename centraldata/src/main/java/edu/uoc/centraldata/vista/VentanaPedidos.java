
package edu.uoc.centraldata.vista;

import edu.uoc.centraldata.controlador.PedidoControlador;
import edu.uoc.centraldata.modelo.Pedido;
import java.util.ArrayList;
import java.util.Scanner;

public class VentanaPedidos extends VentanaMenu{
    
    public static Pedido Pedido;
    public static ArrayList listaPedido;
    
     static Scanner teclado = new Scanner(System.in);
    
    @SuppressWarnings({"empty-statement", "null"})
   
    static int opcion = teclado.nextInt();
            
char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción (1,2,3,4,5,6): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

public static void pintarMenu(){
            boolean salir = false;
            char opcio;
            do {
        System.out.println("\n =========== GESTION DE ARTÍCULOS ===========\n");
        System.out.println(" 1. Añadir un pedido");
        System.out.println(" 2. Eliminar un pedido");
        System.out.println(" 3. Mostrar los pedidos");
        System.out.println(" 4. Mostrar los pedidos pendientes");
        System.out.println(" 5. Mostrar los pedidos enviados");
        System.out.println(" 6. Volver");

        switch (opcion) {
            case '1':
                        String Numero;
                        String Cliente;
                        String Articulo;
                        int Unidades;
                        String Fecha;
                        String Hora;
                        double PrecioFinal;
                        boolean Envio = false;
                    System.out.println("Número");
                        Numero= teclado.nextLine();
                    System.out.println("Cliente");
                        Cliente=teclado.nextLine();
                    System.out.println("Artículo");
                        Articulo=teclado.nextLine();
                    System.out.println("Unidades");
                        Unidades=teclado.nextInt();
                    System.out.println("Fecha");
                        Fecha=teclado.nextLine();   
                    System.out.println("Hora");
                        Hora=teclado.nextLine();
                    System.out.println("Precio Final");
                        PrecioFinal=teclado.nextInt();
                    System.out.println("Envío");
                        Envio=teclado.nextBoolean();
                for (int i = 0; i < listaPedido.size(); i++) {
                    if (Numero.equals(Pedido.getNumero())) {
                    System.out.println("Este Pedido ya existe");
                            break;          
                        }else{
                            listaPedido.add(new Pedido(Numero, Cliente, Articulo, Unidades, Fecha, Hora, PrecioFinal, Envio));
                            break;
                        }
                    }
                    break;
                
            case '2':
                    System.out.println("Numero");
                        Numero=teclado.nextLine();
                for (int i = 0; i < listaPedido.size(); i++) {
                    if (Numero.equals(Pedido.getNumero())) {    
                            listaPedido.remove(Pedido);
                        }else{
                    System.out.println("No existe el Pedido");
                        }   
                    }
                break;
                
            case '3':
                    System.out.println("Numero");
                        Numero=teclado.nextLine();
                for (int i = 0; i < listaPedido.size(); i++) {
                    if (Numero.equals(Pedido.getNumero())) {    
                    System.out.println("Listado de Pedidos (" + VentanaPedidos.Pedido.getNumero() + "):");                                      
                        }else{
                    System.out.println("No hay Pedidos");
                        }   
                    }
                break;
            
            case '4':
                    System.out.println("Numero");
                        Numero=teclado.nextLine();
                for (int i = 0; i < listaPedido.size(); i++) {
                    if(Pedido.Envio == false) {
                    System.out.println("Listado de Pedidos Pendientes (" + VentanaPedidos.Pedido.getNumero() + "):");                                      
                        }else{
                    System.out.println("No hay Pedidos Pendientes");
                        }   
                    }
                break;
                
            case '5':
                    System.out.println("Numero");
                        Numero=teclado.nextLine();
                for (int i = 0; i < listaPedido.size(); i++) {
                    if(Pedido.Envio == true) {
                    System.out.println("Listado de Pedidos Enviados (" + VentanaPedidos.Pedido.getNumero() + "):");                                      
                        }else{
                    System.out.println("No hay Pedidos Enviados");
                        }   
                    }
                break;
                      
            case '6':
                }
                    } while (!salir);
                }
    }
   
