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
public abstract class Vehiculo 
{
   private String Marca;
   private String Modelo;
   private double Precio;

    public Vehiculo(String Marca, String Modelo, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String Marca(){ //tuve que crear otro metodo para poder llamar al String Marca ya que como es private no se puede acceder de forma directa
        return Marca;
    }
    public abstract String getMarca();

    public String getModelo() {
        return Modelo;
    }

    public double getPrecio() {
        return Precio;
    }
   

   
   
    
    

}
