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
public class Institucion {
    
    
    public int id_institucion;
    public String nom_inst;
    
    
   
    
    
    public Institucion ( int id_institucion, String nom_inst){
        
        this.id_institucion = id_institucion;
        this.nom_inst = nom_inst;
        
    }

   //public Institucion(String text) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

    /**
     * @return the id_institucion
     */
    public int getId_institucion(){
      return id_institucion;
    }
    
    public void setId_institucion(int id_institucion){
        this.id_institucion = id_institucion;
    
    }
    /**
     * @return the nom_inst
     */
    public String getNom_inst() {
        return nom_inst;
    }

    /**
     * @param nom_inst the nom_inst to set
     */
    public void setNom_inst(String nom_inst) {
        this.nom_inst = nom_inst;
    }

  /*
    }*/
}
