/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.herenciapolimorfismo;

import com.poo.herenciapolimorfismo.modelo.Animal;
import com.poo.herenciapolimorfismo.modelo.Gato;
import com.poo.herenciapolimorfismo.modelo.Perro;
import com.poo.herenciapolimorfismo.modelo.Pez;
import com.poo.herenciapolimorfismo.modelo.Pajaro;
import com.poo.herenciapolimorfismo.modelo.PerroGrande;
/**
 *
 * @author Juan
 */

public class HerenciaPolimorfismo {

    public static void main(String[] args) {


        Animal mascota1 = new Perro();
        Animal mascota2 = new Gato();
        Animal mascota3 = new Pez("Nemo");
        Animal mascota4 = new Pajaro("Piolin");
        Animal mascota5 = new PerroGrande(
                "Thor",
                5,
                "Gran Danes",
                40
        );

        mascota1.hacerSonido();
        mascota2.hacerSonido();
        mascota3.hacerSonido();
        mascota4.hacerSonido();
        mascota5.hacerSonido();

        // Pajaro
        Pajaro pajaro = new Pajaro("Paco");

        pajaro.volar();
        pajaro.volar();

        // Pez
        Pez pez = new Pez("Dory");

        pez.nadar();
        pez.nadar();

        pez.comer("algas", true);

        // PerroGrande
        PerroGrande perroGrande = new PerroGrande(
                "Max",
                4,
                "Pastor Aleman",
                35
        );

        perroGrande.hacerSonido();

        System.out.println("Edad: "
                + perroGrande.getEdad());

        System.out.println("Raza: "
                + perroGrande.getRaza());

        System.out.println("Peso: "
                + perroGrande.getPesoKg() + " kg");

   
        Animal[] animales = {
            new Perro("Rex"),
            new Pez("Nemo"),
            new Gato("Silvestre"),
            new Pajaro("Piolin"),
            new PerroGrande(
                    "Rocky",
                    6,
                    "Rottweiler",
                    45
            )
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}