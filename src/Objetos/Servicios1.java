/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *  * 
 @author Vianey
 */
public class Servicios1 {
    
       
        public int folio;
        public String nombre_servicio;
        public int num_alumno;
        public String fecha_de_inicio;
        public String fecha_de_termino;
         
    
public Servicios1 (int folio, String nombre_servicio, int num_alumno, String fecha_de_inicio, String fecha_de_termino ){

 
        this.folio = folio;
        this.nombre_servicio = nombre_servicio;
        this.num_alumno = num_alumno;
        this.fecha_de_inicio = fecha_de_inicio;
        this.fecha_de_termino = fecha_de_termino;

}

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the nombre_servicio
     */
    public String getNombre_servicio() {
        return nombre_servicio;
    }

    /**
     * @param nombre_servicio the nombre_servicio to set
     */
    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    /**
     * @return the num_alumno
     */
    public int getNum_alumno() {
        return num_alumno;
    }

    /**
     * @param num_alumno the num_alumno to set
     */
    public void setNum_alumno(int num_alumno) {
        this.num_alumno = num_alumno;
    }

    /**
     * @return the fecha_de_inicio
     */
    public String getFecha_de_inicio() {
        return fecha_de_inicio;
    }

    /**
     * @param fecha_de_inicio the fecha_de_inicio to set
     */
    public void setFecha_de_inicio(String fecha_de_inicio) {
        this.fecha_de_inicio = fecha_de_inicio;
    }

    /**
     * @return the fecha_de_termino
     */
    public String getFecha_de_termino() {
        return fecha_de_termino;
    }

    /**
     * @param fecha_de_termino the fecha_de_termino to set
     */
    public void setFecha_de_termino(String fecha_de_termino) {
        this.fecha_de_termino = fecha_de_termino;
    }
}