/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

/**
 *
 * @author erika
 */
public class PaisServicio implements IPaisServicio{

    private static List<Pais> paisList = new ArrayList<>();
    
    @Override
    public Pais crear(Pais pais) {
        this.paisList.add(pais);
        return pais;
    }

    @Override
    public List<Pais> listar() {
        return this.paisList;
    }
    
    
}
