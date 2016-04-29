/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.valleycargo.controladores;

import edu.valleycargo.entity.Sucursales;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author JoseLuis
 */
@Named(value = "sucursalesControlador")
@SessionScoped
public class sucursalesControlador implements Serializable {

    
    @EJB
    private edu.valleycargo.facade.SucursalesFacade sucursalesFacade;
    
    
    /**
     * Creates a new instance of sucursalesControlador
     */
    public sucursalesControlador() {
    }
    
    public List <Sucursales> todaslasSucursales () {
        return sucursalesFacade.sucursalesOrdenadas();
        
        
    }
    
   
}
