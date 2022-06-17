/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pais;
import servicio.PaisServicio;

/**
 *
 * @author erika
 */
public class PaisControl {
    private final PaisServicio paisServicio = new PaisServicio();
    
    public Pais crear(String [] args) {
        var pais = new Pais(args[0],args[1],Integer.valueOf(args[2]),
                Integer.valueOf(args[3]));
        this.paisServicio.crear(pais);
        return pais;
    }
    
    public List<Pais> listar() {
        return this.paisServicio.listar();
    }
    
    
}
