/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author lucas
 */
public class Auto extends Vehiculo implements Interfaz
{
    private int puerta ;
    
    public Auto(String marca,String modelo,int puertas,double precio)
    {
        super(marca, modelo, precio);
        this.puerta=puertas;
        
    }
    public double getPrecio()
    {
        return super.getPrecio();
    }
    
    @Override
    public String toString() 
    {
        return "Marca: "+getMarca()+" // "+"Modelo: "+super.getModelo()+" // "+"Puertas: "+puerta+" // "+"Precio: $"+super.getPrecio();
    }

    @Override
    public String getMarca() { //este metodo llama al otro metodo para poder acceder al private Marca de forma inderecta
        return super.Marca(); 
    }


}
