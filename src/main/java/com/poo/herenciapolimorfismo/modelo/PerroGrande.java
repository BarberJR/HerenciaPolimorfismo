/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;


public class PerroGrande extends Perro {

    private int pesoKg;

    public PerroGrande(String nombre, int edad, String raza, int pesoKg) {
        super(nombre, edad, raza); // Llama al constructor de Perro
        this.pesoKg = pesoKg;
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡¡GUAU!!");
    }

    public int getPesoKg() {
        return pesoKg;
    }
}