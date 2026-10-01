/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.herenciapolimorfismo;

import com.poo.herenciapolimorfismo.modelo.Animal;
import com.poo.herenciapolimorfismo.modelo.Gato;
import com.poo.herenciapolimorfismo.modelo.Perro;
import com.poo.herenciapolimorfismo.modelo.Pez;

/**
 *
 * @author taidy
 */
public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Variable de tipo Animal (padre)
// Pero objeto real de tipo Perro (hijo)
Animal mascota1 = new Perro();
Animal mascota2 = new Gato();
Animal mascota3 = new Pez();

// El método ejecutado depende del 
// tipo REAL del objeto, no de Animal
mascota1.hacerSonido(); 
  //Imprime: ¡Guau guau! (es Perro)
mascota2.hacerSonido();
  //Imprime: ¡Miau miau! (es Gato)
// Mismo mensaje, DIFERENTES resultados
mascota2.hacerSonido();
 //Imprime: ¡Glu glu! (es Pez)

Animal[] animales = {
  new Perro("Rex"),
  new Pez ("Dory"),
  new Gato("Silvestre"),
  new Animal("Piolin")
};

for (Animal animal : animales) {
  animal.hacerSonido(); // Polimorfismo
}

    }
}
