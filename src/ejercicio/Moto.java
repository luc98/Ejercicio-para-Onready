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
public class Moto extends Vehiculo implements Interfaz
{
    private String cilindros;
    
    public Moto(String marca,String modelo,String cilindros,double precio)
    {
        super(marca, modelo, precio);
        this.cilindros=cilindros;
    }
    public double getPrecio()
    {
        return super.getPrecio();
    }
    @Override
    public String toString() 
    {
        return "Marca: "+getMarca()+" // "+"Modelo: "+super.getModelo()+" // "+"Cilindrada: "+cilindros+" // "+"Precios: $"+super.getPrecio() ;
    }

    @Override
    public String getMarca() {
        return super.Marca();
    }
    
}
