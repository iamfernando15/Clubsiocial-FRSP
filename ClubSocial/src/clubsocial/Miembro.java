/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubsocial;

/**
 *
 * @author HP
 */
public class Miembro extends Club {

    private int NumeroMembresia;
    private String FechaEmision;
    private String FechaVencimiento; 

    public Miembro(String nombre, String FechaNacimiento, int edad, char genero, int NumeroMembresia, String FechaEmision, String FechaVencimiento) {
        super(nombre, FechaNacimiento, edad, genero);
        this.NumeroMembresia = NumeroMembresia;
        this.FechaEmision = FechaEmision;
        this.FechaVencimiento = FechaVencimiento;
    }
    
    public int getNumeroMembresia(){
        return NumeroMembresia;
    }
    
    public void setNumeroMembresia(int NumeroMembresia){
        this.NumeroMembresia = NumeroMembresia;
    }
    
    public String getFechaEmision(){
        return FechaEmision;
    }
    
    public void setFechaEmision(String FechaEmision){
        this.FechaEmision = FechaEmision;
    }
    
    public String getFechaVencimiento(){
        return FechaVencimiento;
    }
    
    public void setFechaVencimiento(){
        this.FechaVencimiento = FechaVencimiento;
    }
    
    
    @Override
    public String toString(){
        String F = super.toString();
        return F + "\nNumeroMembresia: " + this.NumeroMembresia + ",\nFechaEmision: " + this.FechaEmision + ",\nFechaVencimiento: " + this.FechaVencimiento + "\n------------------\n"; 
    }
}
    