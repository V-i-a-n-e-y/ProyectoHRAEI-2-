/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Vianey Hernandez Miramontes
 */
public class Conexion{

    public static void prepareStatement(String sql) {
        
    }
	Connection conexion;
	Statement consulta;
	//File Path;
        String ruta;

    /**
     * Constructor for objects of class Conexion
     */
    public Conexion()
    {
  // final String registroold.db = "registroold.db";
  // Path rutaRelativa = Paths.get(registroold.db);
    
    ruta = ("C:\\ProyectoHRAEI (2)\\Sqliteman-1.2.2\\registro.db");
    
         
    //   a = ruta.getAbsolutePath();
      //  JOptionPane.showMessageDialog(null, rutaRelativa);
    }
    public void conectar(){
		try {
	            Class.forName("org.sqlite.JDBC");
	        }
	        catch (ClassNotFoundException e) {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }	 
			try {
                            
                            conexion = DriverManager.getConnection("jdbc:sqlite:"+ruta);
                            consulta = conexion.createStatement();
                            System.out.println("conexion establecida");
                            
                            
			} catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
	}
    
    
    
    
}
