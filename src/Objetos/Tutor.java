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
public class Tutor {

        public int id_tutor;
        public String nom_tutor;
        public String apellidoPaterno;
        public String apellidoMaterno;
        public String correo;
        public int lada;
        public int tel;


public Tutor ( int id_tutor, String nom_tutor, String apellidoPaterno, String apellidoMaterno,String correo ,int lada,int tel ){

        this.id_tutor = id_tutor;
        this.nom_tutor = nom_tutor;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.lada = lada;
        this.tel = tel;


}

       

    /**
     * @return the id_tutor
     */
     public int getId_tutor(){
         
         return id_tutor;
         
         
     }
      
        public void setId_tutor(int id_tutor){
            this.id_tutor = id_tutor;
        }
    /**
     * @return the nom_tutor
     */
    public String getNom_tutor() {
        return nom_tutor;
    }

    /**
     * @param nom_tutor the nom_tutor to set
     */
    public void setNom_tutor(String nom_tutor) {
        this.nom_tutor = nom_tutor;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the lada
     */
    public int getLada() {
        return lada;
    }

    /**
     * @param lada the lada to set
     */
    public void setLada(int lada) {
        this.lada = lada;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

   
}