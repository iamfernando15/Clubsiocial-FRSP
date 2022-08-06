/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubsocial;

/**
 *
 * @author 50587
 */
import java.util.ArrayList;
import java.util.Scanner;



public class AppCS {
    
    
    public static String nombre="";
    public static String fechaNac="";
    public static int edad =0;
    public static char genero =' ';
    
    public static Club empleado;
    public static ArrayList<Club>listaEmpleado = new ArrayList<Club>();
    
    public static Club miembro;
    public static ArrayList<Club>listaMiembro = new ArrayList<Club>();
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        MenuPrincipal(lectura);
        
    }
    
     
    public static void MenuPrincipal(Scanner lectura){
        int opcionP;
        System.out.println("\nSean Bienvenidos al menu Social Club\n"); 
        System.out.println("1. Empleados");
        System.out.println("2. Miembros");
        System.out.println("3. Salir");
        System.out.print("Elige una opcion: ");
        opcionP = lectura.nextInt();
        
        switch(opcionP){
            case 1: 
                MenuEmpleados(lectura);
                break;
                
            case 2:
                MenuMiembros(lectura);
                break;
                
            case 3:
                System.out.close();
                break;
        }
    }
    public static void MenuEmpleados(Scanner lectura){
        
        int numEmpleado = 0;
        String fechaIng ="";
        String puesto ="";
        int opcionE;
        
        
        System.out.println("\nMenu Empleados\n"); 
        System.out.println("1. Agregar empleados");
        System.out.println("2. Lista de empleados");
        System.out.println("3. Volver");
        System.out.print("Elige una opcion: ");
        opcionE = lectura.nextInt();
        lectura.nextLine();//limpiamos buffer
        switch (opcionE){
            
            case 1: 

                System.out.println("Agregar nuevos Empleados");
                System.out.println("Ingrese sus datos: \n");
                System.out.println("Nombre: ");
                nombre = lectura.next();
                System.out.println("fechaNac: ");
                fechaNac = lectura.next();
                System.out.println("edad: ");
                edad = lectura.nextInt();
                System.out.println("genero: ");
                genero = lectura.next().charAt(0);
                System.out.println("numEmpleado: ");
                numEmpleado = lectura.nextInt();
                System.out.println("fechaIng: ");
                fechaIng = lectura.next();
                System.out.println("puesto: ");
                puesto = lectura.next();
                
                empleado = new Empleado (nombre,fechaNac,edad,genero,numEmpleado,fechaIng, puesto);
                listaEmpleado.add(empleado);
                
                //System.out.println(listaEmpleado);
                System.out.println("**Se agrego el nuevo empleado.**");
                MenuEmpleados(lectura);
                break;
                
            case 2:
                System.out.println("Lista de Empleados: \n");
                System.out.println(listaEmpleado);
                MenuEmpleados(lectura);
                break;
                
            case 3:
                MenuPrincipal(lectura);
                break;
        }
    }
    
    public static void MenuMiembros(Scanner lectura){
        
        int numeroMembresia = 0;
        String fechaEmision = "";
        String fechaVencimiento = ""; 
        int opcionM;
        
        System.out.println("\nMenu Miembros\n"); 
        System.out.println("1. Agregar miembros");
        System.out.println("2. Lista de miembros");
        System.out.println("3. Volver");
        System.out.print("Elige una opcion: ");
        opcionM = lectura.nextInt();
        
       switch (opcionM){
            
            case 1:
                System.out.println("Agregar nuevos Miembros");
                System.out.println("Ingrese sus datos: \n");
                System.out.println("Nombre: ");
                nombre = lectura.next();
                System.out.println("fechaNac: ");
                fechaNac = lectura.next();
                System.out.println("edad: ");
                edad = lectura.nextInt();
                System.out.println("genero: ");
                genero = lectura.next().charAt(0);
                System.out.println("Numero Membresía: ");
                numeroMembresia = lectura.nextInt();
                System.out.println("Fecha emisión de membresía: ");
                fechaEmision = lectura.next();
                System.out.println("Fecha de vencimiento de membresía: ");
                fechaVencimiento = lectura.next();
                
                miembro = new Miembro(nombre,fechaNac,edad,genero,numeroMembresia,fechaEmision, fechaVencimiento);
                listaMiembro.add(miembro);
                
                //System.out.println(listaEmpleado);
                System.out.println("**Se agrego el nuevo miembro.**");
                MenuMiembros(lectura);
                break;
                
            case 2:
                System.out.println("Lista de Miembros: \n");
                System.out.println(listaMiembro);
                MenuMiembros(lectura);
                break;
                
            case 3:
                MenuPrincipal(lectura);
                break;
        }
    }
}
