/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;



public class Pez extends Animal {

    private int profundidad;

    public Pez(String nombre) {
        super(nombre);
        this.profundidad = 0;
    }

    public void nadar() {
        this.profundidad += 5; 
        System.out.println(getNombre() + " está nadando a una profundidad de " + profundidad + " metros.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Glub glub!");
    }

    
    public void comer(String comida, boolean esComidaMarina) {
        if (esComidaMarina) {
            System.out.println(getNombre() + " come " + comida + " de origen marino.");
        } else {
            System.out.println(getNombre() + " come " + comida + " de alimento común.");
        }
    }

    public int getProfundidad() {
        return profundidad;
    }
}