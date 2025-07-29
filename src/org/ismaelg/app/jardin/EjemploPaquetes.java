package org.ismaelg.app.jardin;

import org.ismaelg.app.hogar.ColorPelo;
import org.ismaelg.app.hogar.Persona;


import static org.ismaelg.app.hogar.ColorPelo.*;
import static org.ismaelg.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Andres");
        p.setApellido("Vido");
        p.setColorPelo(NEGRO);
        System.out.println("p = " + p.getNombre());


        Perro perro = new Perro();
        perro.nombre = "Koby";
        perro.raza = "Vira";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
