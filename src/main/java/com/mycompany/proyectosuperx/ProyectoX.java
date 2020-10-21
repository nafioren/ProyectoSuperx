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
        Malvado malvado = new Malvado(8,"...", "...","...");
        Heroe heroe = new Heroe("...", "...","...", 8);
        System.out.print("Pelea: "+ malvado.getNombre()+" ("+malvado.getEnergia()+" energia)" + " vs. " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia)");
        int poder_malvado;
        int poder_heroe;
        while (malvado.getEnergia() > 0 && heroe.getEnergia() > 0){
                poder_malvado = (int) Math.floor(Math.random() * (4 - 1 + 1)+(1));
                switch (poder_malvado) {
                    case 1:
                        heroe.debilitar(malvado.ataqueMalvado1());
                        break;
                    case 2:
                        heroe.debilitar(malvado.ataqueMalvado2());
                        break;
                    case 3:
                        heroe.debilitar(malvado.ataqueMalvado3());
                        break;
                    case 4:
                        heroe.debilitar(malvado.ataqueMalvado4());
                        break;
                }
                poder_heroe = (int) Math.floor(Math.random() * (4 -1 +1)+(1));
                switch(poder_heroe){
                    case 1:
                        malvado.debilitar(heroe.ataqueheroe1());
                        break;
                    case 2:
                         malvado.debilitar(heroe.ataqueheroe2());
                        break;
                    case 3:
                         malvado.debilitar(heroe.ataqueheroe3());
                        break;
                    case 4:
                        heroe.debilitar(malvado.ataqueMalvado4());
                        break;
        }
        }
    }
}
