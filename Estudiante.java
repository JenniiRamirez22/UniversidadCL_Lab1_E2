/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jennifer Ramirez
 */
public class Estudiante extends Persona{

    private float nota1;
    private float nota2;
    private float nota3;
    private float notaTotal;
    private float promedio;
    
    public Estudiante(String cedula, String nombre, String apellido, String direccion, String telefono, String correo, float nota1, float nota2, float nota3, float notaTotal, float promedio){
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaTotal = notaTotal;
        this.promedio = promedio;
    
    }
    
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public float getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(float notaTotal) {
        this.notaTotal = notaTotal;
    }
    
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public float CalcularNotaTotal(){
        notaTotal = nota1 + nota2 + nota3;
        return notaTotal;
    }
    
    public float CalcularPromedioEstudiante(){
        promedio = CalcularNotaTotal()/3;
        return promedio;
    }
    
}
