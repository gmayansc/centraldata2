/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uoc.centraldata.implement;

import java.sql.*;
/**
 *
 * @author maide
 */
public class Helper {
    
    public static Connection getConnection(String classDriver, String uri, String username, String password) throws SQLException, ClassNotFoundException {
           Class.forName(classDriver);
           return Driver.Manager.getConnection(uri, username, password);
    }
    
}
