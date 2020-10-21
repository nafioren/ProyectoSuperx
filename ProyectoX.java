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
public class ProyectoX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Malvado malvado = new Malvado();
        Heroe heroe = new Heroe();
        
        System.out.print("Pelea: "+ malvado.getNombre()+" ("+malvado.getEnergia()+" energia)" + " vs. " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia)");
        int poder_malvado;
        int poder_heroe;
        while (malvado.getEnergia() > 0 && heroe.getEnergia() > 0){
                poder_malvado = (int) Math.floor(Math.random()*(4 - 1 + 1)+(1));
                switch (poder_malvado) {
                        
                }
    }
    
    }
}
