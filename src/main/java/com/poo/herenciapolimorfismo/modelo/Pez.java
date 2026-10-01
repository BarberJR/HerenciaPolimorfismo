/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author juan_
 */
public class Pez extends Animal{
    public Pez(String nombre) {
        super(nombre);
    }
     public Pez() {
        super("Dory");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(getNombre()+"¡Hace Glu glu!");
        
    }
    
    
    
}
