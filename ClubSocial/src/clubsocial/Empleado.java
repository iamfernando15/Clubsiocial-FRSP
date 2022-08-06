/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubsocial;

/**
 *
 * @author HP
 */
public class Empleado extends Club {
    private int NumeroEmpleado;
    private String FechaIngreso;
    private String puesto;

    public Empleado(String nombre, String FechaNacimiento, int edad, char genero, int NumeroEmpleado, String FechaIngreso, String puesto) {
        super(nombre, FechaNacimiento, edad, genero);
        this.NumeroEmpleado = NumeroEmpleado;
        this.FechaIngreso = FechaIngreso;
        this.puesto = puesto;
    }
    
    public int getNumeroEmpleado(){
        return NumeroEmpleado;
    }
    
    public void setNumeroEmpleado(int NumeroEmpleado){
        this.NumeroEmpleado = NumeroEmpleado;
    }
    
    public String getFechaIngreso(){
        return FechaIngreso;
    }
    
    public void setFechaIngreso(String FechaIngreso){
        this.FechaIngreso = FechaIngreso;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    @Override
    public String toString(){
        String F = super.toString();
        return F + ",\nNumeroEmpleado: " + this.NumeroEmpleado + ",\nFechaIngreso: " + this.FechaIngreso + ",\npuesto: " + this.puesto + "\n------------------\n";    }     
}
