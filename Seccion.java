/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jennifer Ramirez
 */
public class Seccion {
    private int nro_seccion;
    private int cant_estudiantes=36;
    private int cont_aprobados;
    private int cont_aplazados;
    private float promedio_S;
    private Estudiante[] estudiantes = new Estudiante[cant_estudiantes];

    public Seccion(int nro_seccion, int cont_aprobados, int cont_aplazados, float promedio_S, Estudiante estudiantes) {
        this.nro_seccion = nro_seccion;
        this.cont_aprobados = cont_aprobados;
        this.cont_aplazados = cont_aplazados;
        this.promedio_S = promedio_S;
        this.estudiantes[cant_estudiantes] = estudiantes.legth;

    }
    
    public CalcularPromedioSeccion(){
        
        
        promedio_S = acumNotas /cant_estudiantes;
        return promedio_S;
    
    }
    
    
    
    
}
