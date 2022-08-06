/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubsocial;

/**
 *
 * @author HP
 */
public class Club {
    private String nombre; 
    private String FechaNacimiento;
    private int edad; 
    private char genero; 

    public Club(String nombre, String FechaNacimiento, int edad, char genero) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    @Override
     public String toString(){
        return "\n------------------\n"+"nombre: " + this.nombre + ",\nFechaNacimiento: " + this.FechaNacimiento + ",\nedad: " + this.edad + "\ngenero: " + this.genero;
    }

}