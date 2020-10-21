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
public class Malvado extends Pelea {
    private int indice_perversidad;

    public Malvado(int indice_perversidad) {
        this.indice_perversidad = indice_perversidad;
    }

    public Malvado(int indice_perversidad, String nombre, String pais_origen, String habilidad_ppal, int energia) {
        super(nombre, pais_origen, habilidad_ppal, energia);
        this.indice_perversidad = indice_perversidad;
    }

    public Malvado() {
    }

    public int getIndice_perversidad() {
        return indice_perversidad;
    }

    public void setIndice_perversidad(int indice_perversidad) {
        this.indice_perversidad = indice_perversidad;
    }

    public int ataqueMalvado1(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia = 10;
        if (this.indice_perversidad > 7){
           saca_energia++;
           System.out.println("Por indice de perversidad resta 1 punto mas");
        }
        return saca_energia;
    }

    public int ataqueMalvado2(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia = 10;
        if (this.indice_perversidad > 7){
           saca_energia++;
           System.out.println("Por indice de perversidad resta 1 punto mas");
        }
        return saca_energia;
    }
 
    public int ataqueMalvado3(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia = 10;
        if (this.indice_perversidad > 7){
           saca_energia++;
           System.out.println("Por indice de perversidad resta 1 punto mas");
        }
        return saca_energia;
    }
    public int ataqueMalvado4(){
        System.out.println(super.getNombre() + " uso ataque 1 y saco 10 puntos");
        int saca_energia = 10;
        if (this.indice_perversidad > 7){
           saca_energia++;
           System.out.println("Por indice de perversidad resta 1 punto mas");
        }
        return saca_energia;
    }
}