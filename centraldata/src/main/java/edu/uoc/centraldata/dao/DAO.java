/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.uoc.centraldata.dao;

import edu.uoc.centraldata.modelo.Cliente;
import java.util.List;

/**
 *
 * @author gerardmayans
 */
public interface DAO <T, K> {
    void insertar(T c) throws DAOException;
    void modificar(T c) throws DAOException;
    void eliminar(T c) throws DAOException;
    List<T> obtenerTodos() throws DAOException;
    T obtener(K id) throws DAOException;
}
