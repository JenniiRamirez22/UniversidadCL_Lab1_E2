/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jennifer Ramirez
 */
public class Profesor extends Persona{
    private String[] asignaturas = new String[3];
    
    public Profesor(String cedula, String nombre, String apellido, String direccion, String telefono, String correo, String asig1, String asig2, String asig3){
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.asignaturas[0] = asig1;
        this.asignaturas[1] = asig2;
        this.asignaturas[2] = asig3;
    
    }
    
    public void RegistrarProf(){
    
    }
    
}
