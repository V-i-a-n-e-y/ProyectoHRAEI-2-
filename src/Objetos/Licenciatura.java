/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Vianey
 */
public class Licenciatura {

    public int folio;
    public String grado;
    public String practica;
    public String fecha_inicio;
    public String fecha_termino;
    public int no_alumnos;
    public int semestre;
    public String turno;
    public String hora_entrada;
    public String hora_salida;
    public int id_institucion;
    public int id_tutor;
    public int id_usuario;
            
  
 
    
   

    

        public Licenciatura( int folio, String grado, String practica, String fecha_inicio, String fecha_termino, int no_alumnos, int semestre, String turno, String hora_entrada, String hora_salida, int id_institucion, int id_tutor, int id_usuario) {
        
            this.folio = folio;
            this.grado = grado;
            this.practica = practica;
            this.fecha_inicio = fecha_inicio;
            this.fecha_termino = fecha_termino;
            this.no_alumnos = no_alumnos;
            this.semestre = semestre;
            this.turno = turno;
            this.hora_entrada = hora_entrada;
            this.hora_salida = hora_salida;
            this.id_institucion = id_institucion;
            this.id_tutor = id_tutor;
            this.id_usuario = id_usuario;
         
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
     * @return the grado
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    /**
     * @return the practica
     */
    public String getPractica() {
        return practica;
    }

    /**
     * @param practica the practica to set
     */
    public void setPractica(String practica) {
        this.practica = practica;
    }

    /**
     * @return the fecha_inicio
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the fecha_termino
     */
    public String getFecha_termino() {
        return fecha_termino;
    }

    /**
     * @param fecha_termino the fecha_termino to set
     */
    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    /**
     * @return the no_alumnos
     */
    public int getNo_alumnos() {
        return no_alumnos;
    }

    /**
     * @param no_alumnos the no_alumnos to set
     */
    public void setNo_alumnos(int no_alumnos) {
        this.no_alumnos = no_alumnos;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the hora_entrada
     */
    public String getHora_entrada() {
        return hora_entrada;
    }

    /**
     * @param hora_entrada the hora_entrada to set
     */
    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    /**
     * @return the hora_salida
     */
    public String getHora_salida() {
        return hora_salida;
    }

    /**
     * @param hora_salida the hora_salida to set
     */
    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    /**
     * @return the id_institucion
     */
    public int getId_institucion() {
        return id_institucion;
    }

    /**
     * @param id_institucion the id_institucion to set
     */
    public void setId_institucion(int id_institucion) {
        this.id_institucion = id_institucion;
    }

    /**
     * @return the id_tutor
     */
    public int getId_tutor() {
        return id_tutor;
    }

    /**
     * @param id_tutor the id_tutor to set
     */
    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    

 
    }
