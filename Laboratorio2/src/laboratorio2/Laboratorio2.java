/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int a,m=1;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        ArrayList<Producto> productos= new ArrayList<Producto>();
        
        if(x==6478){
            while(m==1){
                System.out.println("que quieres hacer?");
                
                System.out.println("1.agregar");
                System.out.println("2.eliminar");
                System.out.println("3.modificar");
                System.out.println("4.salir");
                
                a= input.nextInt();
                
                switch(a){
                    case 1:
                        String z="s";
                        String nombre,disponibilidad,proveedor;
                        int cantidad,precio;
                        
                        while(z=="s"){
                            System.out.println("ingrese el nombre del producto:");
                            nombre=input.nextLine();
                            System.out.println("especifique la disponivilidad:");
                            disponibilidad=input.nextLine();
                            System.out.println("escriba el proveedor:");
                            proveedor=input.nextLine();
                            System.out.println("escriba la cantidad:");
                            cantidad=input.nextInt();
                            System.out.println("escriba el precio:");
                            precio=input.nextInt();
                            
                            Producto p=new Producto(nombre,precio,cantidad,proveedor,disponibilidad);
                            
                            productos.add(p);
                            
                            System.out.println("quieres seguir agregando productos?s/n");
                            z=input.nextLine();
                        }
                        break;
                    case 2:
                        int y;
                        System.out.println("que elemento quiere eliminar?");
                        y=input.nextInt();
                        productos.remove(y);
                        break;
                    case 3:
                        int b,c;
                        System.out.println("que quiere modificar:");
                        System.out.println("1.precio");
                        System.out.println("2.cantidad");
                        System.out.println("3.proveedor");
                        System.out.println("4.disponibilidad");
                        b=input.nextInt();
                        System.out.println("en que posicion de la lista esta el producto que quiere?");
                        c=input.nextInt();
                        switch(b){
                            case 1:
                                int nprecio;
                                nprecio=input.nextInt();
                                productos.get(c).SetPrecio(nprecio);
                                break;
                            case 2:
                                int ncantidad;
                                ncantidad=input.nextInt();
                                productos.get(c).SetCantidad(ncantidad);
                                break;
                            case 3:
                                String nproveedor;
                                nproveedor=input.nextLine();
                                productos.get(c).SetProveedor(nproveedor);
                                break;
                            case 4:
                                String ndisponibilidad;
                                ndisponibilidad=input.nextLine();
                                productos.get(c).SetDisponibilidad(ndisponibilidad);
                                break;
                        }
                        break;
                        
                    case 4:
                        break;
                        
                }
            System.out.println("quiere continuar, escriba un numero distinto de 1");
            m=input.nextInt();    
            }
        }
    }
    
}
