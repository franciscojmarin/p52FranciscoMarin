/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ejemploweb;

/**
 *
 * @author fmarin
 */
public class Cliente {
    
    private String nombre;
    
    private String email;
    
    private String edad;
    
    public Cliente(String nombre, String email, String edad){
        this.nombre=nombre;
        this.email=email;
        this.edad=edad;
    }
    
    private String ejemplo;
    
    public String getEjemplo()
    {
        return this.ejemplo;
    }
    
    public void setEjemplo(String value)
    {
        this.ejemplo = value;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", ejemplo=" + ejemplo + '}';
    }
    
    
}
