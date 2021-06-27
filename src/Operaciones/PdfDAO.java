package Operaciones;

import VO.PdfVO;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PdfDAO extends Conexion {

    /*Metodo listar*/
    public ArrayList<PdfVO> Listar_PdfVO() {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        
        String sql = "SELECT * FROM pdf;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setFolio(rs.getInt(2));
                vo.setNombrepdf(rs.getString(3));
                vo.setArchivopdf(rs.getBytes(4));
                
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //ps.close();
                //rs.close();
                conexion.close(); 
            } catch (Exception ex) {
            }
        }
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_PdfVO(PdfVO vo) {
        
        String sql = "INSERT INTO pdf (codigopdf, folio, nombrepdf, archivopdf) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            conectar();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.setInt(2, vo.getFolio());
            ps.setString(3, vo.getNombrepdf());
            ps.setBytes(4, vo.getArchivopdf());
            
            //ps.setString(5, vo.getInstitucion());
            //ps.setString(6, vo.getFechainicio());
            //ps.setString(7, vo.getFechatermino());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conexion.close();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_PdfVO(PdfVO vo) {
        
        String sql = "UPDATE pdf SET nombrepdf = ?, archivopdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            conectar();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.setInt(2, vo.getFolio());
            ps.setString(3, vo.getNombrepdf());
            ps.setBytes(4, vo.getArchivopdf());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //ps.close();
                conexion.close();
            } catch (Exception ex) {
            }
        }
    }

    public void Modificar_PdfVO2(PdfVO vo) {
        
        String sql = "UPDATE pdf SET nombrepdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //ps.close();
                conexion.close();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_PdfVO(PdfVO vo) {
       
        String sql = "DELETE FROM pdf WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            conectar();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //ps.close();
               conexion.close();
            } catch (Exception ex) {
            }
        }
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutar_archivoPDF(int id) {

        
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            conectar();
            ps = conexion.prepareStatement("SELECT archivopdf FROM pdf WHERE codigopdf = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            conexion.close();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

}
