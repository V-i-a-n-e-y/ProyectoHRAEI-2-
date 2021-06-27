/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 * @author Vianey Hernandez Miramontes
 */

import Objetos.Persona;
import Objetos.Licenciatura;
import Objetos.Tutor;
import Objetos.Servicios1;
import Objetos.Institucion;
import Objetos.Pdf;
import Ventanas.RegistroUser;
import Ventanas.InicioSesion;
import Ventanas.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


 
public class Operaciones extends Conexion{
    static ResultSetMetaData resultadometa;
    static ResultSet resultado; 
    

    public static void guardarLicenciatura(Licenciatura licenciatura) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Constructor for objects of class Operaciones
     */
    public Operaciones()
    {
        // initialise instance variables
    }
    
    public boolean insertar(String sql){
        boolean valor = true;
        conectar();
        try {
            consulta.executeUpdate(sql);
        } catch (SQLException e) {
                valor = false;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }      
        finally{  
            try{    
                 consulta.close();  
                 conexion.close();  
             }catch (Exception e){                 
                 e.printStackTrace();  
             }  
        }
        return valor;
    }
    public ResultSet consultar(String sql){
        conectar();
        resultado = null;
        try {
            resultado = consulta.executeQuery(sql);

        } catch (SQLException e) {
                System.out.println("Mensaje:"+e.getMessage());
                System.out.println("Estado:"+e.getSQLState());
                System.out.println("Codigo del error:"+e.getErrorCode());
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
        return resultado;
    }

    public void guardarUsuario(Persona persona){
        insertar("insert into Persona values("+persona.getId_usuario()
                    +",'"+persona.getNombres()
                    +"','"+persona.getPrimer_apellido()
                    +"','"+persona.getSegundo_apellido()
                    +"','"+persona.getUsuario()
                    +"','"+persona.getPass()+"')");
    }
    
     public void guardarLicenciaturas(Licenciatura licenciatura){
      //  int folio = auto_lic();
        insertar("insert into Licenciatura values('"+licenciatura.getFolio()
                    +"', '"+licenciatura.getGrado()
                    +"','"+licenciatura.getPractica()
                    +"','"+licenciatura.getFecha_inicio()
                    +"', "+licenciatura.getFecha_termino()
                    +","+licenciatura.getNo_alumnos()
                    +",'"+licenciatura.getSemestre()
                    +"','"+licenciatura.getTurno()
                    +"','"+licenciatura.getHora_entrada()
                    +"','"+licenciatura.getHora_salida()
                    //+"',"+auto_lic()
                    +",'"+licenciatura.getId_institucion()
                    +"',"+licenciatura.getId_tutor()+","+licenciatura.getId_usuario()+")");
                    
   
    }
     
  
     
      public void guardartutor(Tutor tutor){
        insertar("insert into Servicios values('"+tutor.getId_tutor()
                    +"',.'"+tutor.getNom_tutor()
                    +"','"+tutor.getApellidoPaterno()
                    +"','"+tutor.getApellidoMaterno()
                    +"','"+tutor.getCorreo()
                    +"','"+tutor.getLada()
                    +"','"+tutor.getTel()+"')");
     
      } 
      
      public void guardarServicios1(Servicios1 servicios1){
        insertar("insert into Servicios1 values('"+servicios1
                    +"', '"+servicios1.getFolio()
                    +"','"+servicios1.getNombre_servicio()
                    +"','"+servicios1.getNum_alumno()
                    +"','"+servicios1.getFecha_de_inicio()
                    +"','"+servicios1.getFecha_de_termino()+"')");
      
      } 
      
      public void guardarinstitucion(Institucion institucion){
        insertar("insert into institución values('"+institucion.getId_institucion()
        +"','"+institucion.getNom_inst()+"')");
        
     
      }
      
      
      public ResultSet totalLicenciaturas(DefaultTableModel tableModel, String lic){
      ResultSet resultado = null;
       
        PreparedStatement pst;
        pst=null;
        
        try {
            conectar();
            //"select * from licenciatura where institucion=?"
            pst = conexion.prepareStatement("select  nom_inst, practica, no_alumnos,  fecha_inicio, fecha_termino, nom_tutor, apellidoPaterno, apellidoMaterno from licenciatura inner join institucion on  institucion.id_institucion = licenciatura.id_institucion inner join  tutor  on tutor.id_tutor = licenciatura.folio where institucion.nom_inst = ? ");
            
            pst.setString(1, lic);
        resultado = pst.executeQuery();
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
          
     }return resultado;
    }
      public ResultSet totalDocumentos(DefaultTableModel tableModel, String doc){
      ResultSet resultado = null;
       
        PreparedStatement pst;
        pst=null;
        
        try {
            conectar();
            pst = conexion.prepareStatement("select ruta_docum as ruta_cartasol, ruta_cartacep, ruta_docum, ruta_docum as nom_inst, fecha_inicio, fecha_termino,turno from licenciatura inner join institucion on institucion.id_institucion = licenciatura.id_institucion inner join pdf on pdf.folio = licenciatura.folio where institucion.nom_inst = ?");
            
            pst.setString(1, doc);
        resultado = pst.executeQuery();
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
          
     }return resultado;
    }
      
      
    public void totalPersonas(DefaultTableModel tableModel){
      ResultSet resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sql = "select nombres, primer_apellido, segundo_apellido, usuario from persona";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
    }
     
        
        
        
    
      /*ResultSet resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      // String sql = "select * from Persona"; 
        resultado = null;        
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sql;
        String ins;
        ins = "\"uaem\"";
      // sql = "select id, primer_nombre, primer_apellido, segundo_apellido, user from Persona";
         sql = "select  T1.Institucion, T2.Servicio, T2.Alumnos, T2.fecha_de_inicio  from licenciatura T1 inner Join servicios T2 on T1.Institucion = T2.Institucion where T1.Institucion = "+ ins +"";
         JOptionPane.showMessageDialog(null, sql);
//"select id, primer_nombre, primer_apellido, segundo_apellido, user from Persona";
      try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
       }
     }*/
    

    
    
    
    
    public void consultaLicenciatura(DefaultTableModel tableModel, String lic){
        resultado = null;        
        String licenciatura;
        licenciatura = lic;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sql;
        sql = "select  T1.Institucion, T2.Servicio, T2.Alumnos, T2.fecha_de_inicio  from licenciatura T1 inner Join servicios T2 on T1.Institucion = T2.Institucion where T1.Institucion = '"+licenciatura+"';";
        JOptionPane.showMessageDialog(null, sql);
        try {
            resultado = consultar(sql);
            JOptionPane.showMessageDialog(null, resultado);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (SQLException e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
    }
   
    public boolean login(Persona usr){
        
        try{
            
        PreparedStatement ps = null;
        ResultSet rs = null;
        String usuario = usr.getUsuario();
        String sql;
        sql = "select id_usuario, nombres, pass, usuario from Persona where usuario= '"+ usuario +"';";
        
        conectar();
            ps = conexion.prepareStatement(sql);
//            ps.setString(1,usr.getUsuario());
            rs = ps.executeQuery();
            //JOptionPane.showMessageDialog(null, rs.next());
            if(rs.next()){
                
                                
                if(usr.getPass().equals(rs.getString(3))){
                    usr.setId_usuario(rs.getInt(1));
                    usr.setNombres(rs.getString(2));
                    return true;
                    
                }else{
                    return false;
                    
                }
            }
            return false;
                
        }catch(SQLException e){
                return false;
                }
       
    }
    
    /*public  ResultSet consultalic(String ins){
          /*PreparedStatement pst;
        
        resultado = null;
        try{
            conectar();
        pst = conexion.prepareStatement("select * from servicios1 where institucion =?");
        pst.setString(1, ins);
        resultado = pst.executeQuery();
        }catch(Exception e) {
            System.out.println("No Correcto");
        }
        //ArrayList<Object[]> datos;
        //datos = new ArrayList<>();
        /*DefaultTableModel dtm = null;
         String institucion;
         String servicios;
         String nalumnos;
        try{1
         resultado = null;
        String sql;
        sql = "select T1.institucion, T2.Servicio, T2.Alumnos from posgrado AS T1"
                 + " inner Join servicios AS T2 on T1.institucion = T2.institucion";
          resultado = consultar(sql);
          
          while(resultado.next()){
                   
                    institucion = resultado.getString("institucion");
                    servicios = resultado.getString("Servicio");
                    nalumnos = resultado.getString("Alumnos");
                    dtm.addRow(new String[]{institucion, servicios, nalumnos});
          } 
        }catch (Exception e) {
            System.out.println("No Correcto");
        }
        //String ins;
        //ins = "\"uaem\"";
       //sql = "select id, primer_nombre, primer_apellido, segundo_apellido, user from Persona";
        // sql = "select T1.institucion, T2.Servicio, T2.Alumnos from posgrado AS T1"
                 //+ " inner Join servicios AS T2 on T1.institucion = T2.institucion"; //T1 INNER JOIN servicios AS T2 on T1.institucion = T2.Institucion";// "where T1.Institucion = "+ ins +"";
        //sql = "SELECT * FROM posgrado";
        //JOptionPane.showMessageDialog(null, sql);
//"select id, primer_nombre, primer_apellido, segundo_apellido, user from Persona";
        
            //resultadometa = resultado.getMetaData();
            //if(resultado != null){
               // int numeroColumna = resultado.getMetaData().getColumnCount();
                //System.out.println("Correcto"+resultado);
                //for(int j = 1;j <= numeroColumna;j++){
                  //  tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                
       
                
                    
                   /* Object[]objetos = new Object[resultadometa.getColumnCount()];
                    for(int i = 0;i <= resultadometa.getColumnCount();i++){
                        objetos[i] = resultado.getObject(i+1);
                    }
                    datos.add(objetos);
                }
            
        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
         }
     }
        return resultado;
       return resultado;
    }
    public  ResultSet consultalic(String ins){
    ResultSet resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sql = "select * from Licenciatura";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
    }*/
      
    public ResultSet totalServicios(DefaultTableModel tableModel, String ins){
      ResultSet resultado = null;
       
        PreparedStatement pst;
        pst=null;
        
        try {
            conectar();
            pst = conexion.prepareStatement("select nom_inst, nombre_servicio, no_alumnos,  fecha_inicio, fecha_termino from licenciatura inner join institucion on  institucion.id_institucion = licenciatura.id_institucion inner join  servicios1 on servicios1.folio = licenciatura.folio  where institucion.nom_inst =?");
            pst.setString(1, ins);
        resultado = pst.executeQuery();
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
          
     }return resultado;
    }


    //public void consultaLicenciatura(DefaultTableModel defaultTableModel) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   //}
public int auto_lic() {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conectar();
        try {
            ps = conexion.prepareStatement("select Max(folio) from licenciatura;");
                  //  getConnection().String(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo" + ex.getMessage());
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

public int auto_tutor() {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conectar();
        try {
            ps = conexion.prepareStatement("select Max(id_tutor) from tutor;");
                  //  getConnection().String(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo" + ex.getMessage());
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

public int auto_institucion() {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conectar();
        try {
            ps = conexion.prepareStatement("select Max(id_institucion) from institucion;");
                  //  getConnection().String(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo" + ex.getMessage());
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




public int auto_incrementablepersona() {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conectar();
        try {
            ps = conexion.prepareStatement("select Max(id_usuario) from persona;");
                  //  getConnection().String(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmaximo" + ex.getMessage());
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
    
