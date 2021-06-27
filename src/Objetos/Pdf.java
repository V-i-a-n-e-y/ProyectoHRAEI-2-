/*

 */
package Objetos;

/**
 *
 * @author Vianey
 */
public class Pdf {
    
    public int codigopdf;
    public String nombre;
    public String ruta_archivo;
   
               
    
    public Pdf (int codigopdf, String nombre , String ruta_archivo){
        
            
        this.codigopdf = codigopdf;
        this.nombre = nombre;
        this.ruta_archivo = ruta_archivo;
       
}

    /**
     * @return the codigopdf
     */
    public int getCodigopdf() {
        return codigopdf;
    }

    /**
     * @param codigopdf the codigopdf to set
     */
    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ruta_archivo
     */
    public String getRuta_archivo() {
        return ruta_archivo;
    }

    /**
     * @param ruta_archivo the ruta_archivo to set
     */
    public void setRuta_archivo(String ruta_archivo) {
        this.ruta_archivo = ruta_archivo;
    }
}