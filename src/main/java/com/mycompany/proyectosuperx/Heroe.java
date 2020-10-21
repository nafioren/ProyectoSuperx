/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosuperx;

/**
 *
 * @author Administrador
 */
public class Heroe extends Pelea{
    private int indice_bondad;

    public Heroe() {
    }
    public Heroe(String nombre, String pais_origen, String habilidad_ppal, int indice_bondad){
        super(nombre, pais_origen, habilidad_ppal);
        this.indice_bondad = indice_bondad;
    }
    public int getIndice_bondad(){
        return indice_bondad;
    }
    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }

    public int ataqueHeroe1(){
        System.out.println(super.getNombre()+" uso ataque 1 y saco 10 puntos");
        int saca_energia=10;
        if (this.indice_bondad>8){
           saca_energia++;
           System.out.println("Por indice de bondad resta 1 punto mas");
        }
        return saca_energia;
    }
    
    public int ataqueHeroe2(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia=10;
        return saca_energia;
    }
    
    public int ataqueHeroe3(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia = 10;
        return saca_energia;
    }
    
    public int ataqueHeroe4(){
        System.out.println(super.getNombre() + " uso ataque 4 y saco 10 puntos");
        int saca_energia=10;
        return saca_energia;
    }

    int ataqueheroe3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int ataqueheroe1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int ataqueheroe2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

}