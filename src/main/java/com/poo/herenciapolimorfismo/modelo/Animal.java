/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;


public class Animal {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void hacerSonido() {
    System.out.println(" Sonido genérico");
  }
     
      
  // Versión 1: sin parámetros
  public void comer() {
    System.out.println(nombre + " está comiendo");
  }
  
  // Versión 2: con 1 parámetro (String)
  public void comer(String comida) {
    System.out.println(nombre + " come " + comida);
  }  
  // Versión 3: con 2 parámetros (String, int)
  public void comer(String comida, int cantidad) {
    System.out.println(nombre + " come " + cantidad +
      " porciones de " + comida);
  }
}
