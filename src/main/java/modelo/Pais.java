/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erika
 */
public class Pais {
    
    private String nombre;
    private String nombrePresidente;
    private int numeroHabitantes;
    private int numProvincias;

    public Pais(String nombre, String nombrePresidente, int numeroHabitantes, int numProvincias) {
        this.nombre = nombre;
        this.nombrePresidente = nombrePresidente;
        this.numeroHabitantes = numeroHabitantes;
        this.numProvincias = numProvincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getNumProvincias() {
        return numProvincias;
    }

    public void setNumProvincias(int numProvincias) {
        this.numProvincias = numProvincias;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", nombrePresidente=" 
                + nombrePresidente + ", numeroHabitantes=" + numeroHabitantes 
                + ", numProvincias=" + numProvincias + '}';
    }
    
    
    
    
}
