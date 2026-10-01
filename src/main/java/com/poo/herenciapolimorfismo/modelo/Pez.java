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
    private int profundidad;
    public Pez(String nombre) {
        super(nombre);
        this.profundidad=0;
    }
    public void nadar() {
        this.profundidad += 5; // Aumenta la profundidad
        System.out.println(getNombre() + " está nadando a una profundidad de " + profundidad + " metros.");
    }
     public Pez() {
        super("Dory");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(getNombre()+"¡Hace Glu glu!");
     
        public void comer(String comida, boolean esComidaMarina){
            if(esComidaMarina){
                System.out.println(getNombre()+ "come"+ comida +"de origen marino.");
            }else{
                System.out.println(getNombre()+"come"+ comida + "Alimento comun.");
            }
        }
        
        
     public int getProfundidad() {
        return profundidad;
        }      
    }
}
