/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author ivan
 */
public class Producto {
    public String nombre;
    public int precio;
    public int cantidad;
    public String proveedor;
    public String disponibilidad;
    
    public Producto(String nombre, int precio, int cantidad, String proveedor, String disponibilidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.disponibilidad=disponibilidad;
        this.precio=precio;
        this.proveedor=proveedor;
    }
    
    public void SetPrecio (int d){
        this.precio=d;
    }
    
    public void SetCantidad(int d){
        this.cantidad=d;
    }
    public void SetProveedor(String d){
        this.proveedor=d;
    }
    public void SetDisponibilidad(String d){
        this.disponibilidad=d;
    }
}
