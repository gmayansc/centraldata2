/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uoc.centraldata.dao.implement;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.log4j.logger;

/**
 *
 * @author maide
 */
public class Base {
    
    Connection connection;
    final static Logger log = Logger.getLogger (edu.uoc.centraldata.dao.DAO.class);
    
    public void connectionDb() throws SQLException, ClassNotFoundException {
        
        String uri = Context.getInstance().getDataSouceUri();
        String username = Context.getInstance().getDataSouceUsername();
        String password = Context.getInstance().getDataSoucePassword();
        String classDriver = Context.getInstance().getDataClassDriver();
        
        if(log.isDebugEnabled()) {
            log.debug(String.format("Connection DB uri:%s username:%s classDriver:%s", uri, username, classDriver));
        }
        
        this.connection = Helper.getconnection(classDriver, uri, username, password); 
    }
    
    public void dissconectionDb() throws SQLException {
        if(log.isDebugEnabled()) {
            log.debug("Disconnect DB");
        }
    }
    
}
