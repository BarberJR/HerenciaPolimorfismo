/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal{
    private int alturaVuelo;

    public Pajaro(String nombre) {
        super(nombre); 
        this.alturaVuelo = 0;
    }
    public void volar() {
        this.alturaVuelo += 10; // Aumenta la altura
        System.out.println(getNombre() + " está volando a una altura de " + alturaVuelo + " metros.");
    }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Pio pio!");
    }

    public int getAlturaVuelo() {
        return alturaVuelo;
    }
}
