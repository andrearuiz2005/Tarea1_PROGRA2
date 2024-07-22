/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;
import java.util.Scanner;

/**
 *arreglos bidimencionales
 * @author ar466
 */
public class Empresa {
    //Atributo
    private String name;
    private EmpleadoPorHora empleado[];
    
    public Empresa(String name, int cantidad) {
    this.name=name;
    empleado = new EmpleadoPorHora[cantidad];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
    return name;
    }
    
    public EmpleadoPorHora buscar(int code) {
       for(EmpleadoPorHora eph: empleado){
           if (eph!=null && eph.getCodigo()==code){
               return eph;  
           }
       }
       return null;
    }
    //constructor EmpleadoPorHora
    //Agregar empleado
    public boolean agregarEmpleado(int code, String name){
        if (buscar(code)==null){
            for(int pos=0;pos<empleado.length;pos++){
                if(empleado[pos]==null){
                    empleado[pos]=new EmpleadoPorHora(code,name);
                    return true;
                }
            }
        }
        return false;
    }
    
    //Montrar todos los empleados
    public void mostrarEmpleados() {
        for(int contar=0; contar<empleado.length;contar++){
         if (empleado[contar]!=null)
             empleado[contar].print();
     }
    }
     //Pagar a los empleados 
     public double pagarEmpleado(int code){
        EmpleadoPorHora eph=buscar(code);
        if(eph!=null)
            return eph.pagar();
        return-1;   
     }
     //Asignar las horas empleados 

}

    