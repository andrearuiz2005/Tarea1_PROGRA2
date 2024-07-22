/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;

/**
 *
 * @author ar466
 */
public class EmpleadoPorHora {
    //Atributos
    public int codigo;
    public String nombre; // el private solo funciona aqui en esta seccion
    private double horas;
    
    public EmpleadoPorHora(int codigo,String name){
        this.codigo=codigo; // Usa 'this' para referirte al atributo de la clase
        nombre=name;
        horas=0;
    }
            
    /*
    Identificador tipo de datos nombre_funcion(parametros (opcional)){
    Bloqueo codigo.
    return resultado del mismo tipo de datos.
    }
    Funciones SET & GET
    Set: Editar o reemplazar
    Get: Extraer u obtener
    */
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String name) {
        nombre = name;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public double pagar(){
        if(horas>40)
            return (40*100)+((horas-40)*200);
        return horas*100;
    }
    public void print(){
        System.out.println("Code: "+codigo+"\nName: "+nombre);
    }
    
}
