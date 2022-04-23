
package edu.uoc.centraldata.implement;

import java.sql.Connection;

public class PruebaConector {

    public static void main(String[] args) {
        Conector conecta = new Conector();
        if(conecta.getConexion() !=null)
            System.out.println("Conexión Establecida");
        else
            System.out.println("Conexión No Establecida");
    }
    
}
