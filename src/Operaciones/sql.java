/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Operaciones.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Vianey
 */
public class sql extends Conexion {

public int auto_incrementablepdf() {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        conectar();
        try {
            ps = conexion.prepareStatement("select MAX(codigopdf) FROM pdf;");
                  //  getConnection().String(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo " + ex.getMessage());
            id = 1;
        } finally {
           try{
               ps.close();
               rs.close();
               conexion.close();
               
           }
           catch(Exception ex){
               
           }
        }
        return id;
    }

    
}