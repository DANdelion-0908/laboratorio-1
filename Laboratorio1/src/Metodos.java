//Librerías y clase

import java.util.Random;
public class Metodos {
    Random rand = new Random();
    public void acariciar(float a, float c, Perro d, Persona p){

        //Acciones entre la persona y el perro

        //Acariciar

        if (p.getConfianza() > 0){
            System.out.println(p.getNombre() + " ha acariciada a " + d.getNombre());
            System.out.println(d.getNombre() + " Se siente muy feliz. Su confianza aumenta.");
            d.cola();
            p.setConfianza(c + rand.nextFloat(2)+1); 
            d.setanimo(a + (1.0f/p.getConfianza()) * ((rand.nextFloat(2)+1)));
            System.out.println("El ánimo de " + d.getNombre() + " ha cambiado a " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " ha cambiado a " + p.getConfianza());  
        }

        //Fracaso

        if (p.getConfianza() == 0){
            System.out.println(p.getNombre() + " ha intentado acariciar a " + d.getNombre() + ". Pero no lo logró.");
            d.ladrido();
            p.ladridoreact(d);
            d.setanimo(a - rand.nextFloat(1));
            p.setConfianza(c - rand.nextFloat(1));
            System.out.println("El ánimo de " + d.getNombre() + " ha cambiado a " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " ha cambiado a " + p.getConfianza());  
        }
        if (p.getConfianza() < 0){
            System.out.println(p.getNombre() + " ha intentado acariciar a " + d.getNombre() + ". Pero no pudo hacerlo.");
            d.mordida();
            p.mordidareact(d);
            d.setanimo(a - rand.nextFloat(2));
            p.setConfianza(c - rand.nextFloat(2));
            System.out.println("El ánimo de " + d.getNombre() + " ha cambiado a " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " ha cambiado a " + p.getConfianza());  
        }
    }

    //Galleta
    public void darGalleta(float a, Persona p, Perro d, float c){
        if(p.getGalleta() == 1){
            System.out.println(p.getNombre() + " ha dado una galleta a " + d.getNombre());
            System.out.println(d.getNombre() + " se siente contento.");
            d.cola();
            p.setGalleta(p.getGalleta()-1); 
            d.setanimo(a + (1.0f/p.getConfianza()) * ((rand.nextFloat(2))+1));
            p.setConfianza(c + rand.nextFloat(2)+1);
            System.out.println("El ánimmo de "+d.getNombre() + " ha cambiado a " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " ha cambiado a " + p.getConfianza());
        }

        // No galleta
        else{
            System.out.println(p.getNombre() + " No tiene ninguna galleta.");
        }
    }

    //Mostrar galleta
    public void sacargalleta(Perro d, Persona p, float a, float c){
        if(p.getGalleta() == 1){
            System.out.println(p.getNombre() + " ha mostrado una galleta a " + d.getNombre());
            System.out.println(p.getNombre() + " ha sacado una galleta de su bolsillo para mostrarla a " + d.getNombre());
            System.out.println(d.getNombre()+ " ha empezado a sentirse contento.");
            p.setConfianza(c + rand.nextFloat(1));
            d.setanimo(a + (1.0f/p.getConfianza()) * ((rand.nextFloat(2)+1)));
            System.out.println("El ánimo de " + d.getNombre() + " es de " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " es de " + p.getConfianza());
        }

        //Mostrar galleta sin tenerla
        if (p.getGalleta() == 0){
            System.out.println(p.getNombre() + " ha tratado de engañar a " + d.getNombre() + " con una galleta invisible.");
            System.out.println("Pero " + d.getNombre()+ " no ha caído en el engaño de " + p.getNombre());
            d.setanimo(a - rand.nextFloat(1));
            p.setConfianza(c - rand.nextFloat(1));
            System.out.println("El ánimo de " + d.getNombre() + " es de " + d.getanimo());
            System.out.println("La confianza en " + p.getNombre() + " es de " + p.getConfianza());

        }
    }

    //Jugar
    public void play(Perro d, Persona p, float a, float c) {
        System.out.println(p.getNombre() + " ha lanzado una pelota a " + d.getNombre());
        System.out.println(d.getNombre() + " corre feliz para atraparla.");
        d.setanimo(a + (1.0f/p.getConfianza()) * ((rand.nextFloat(2))));
        p.setConfianza(c + rand.nextFloat(1));
        System.out.println("El ánimo de " + d.getNombre() + " es de " + d.getanimo());
        System.out.println("La confianza en " + p.getNombre() + " es de " + p.getConfianza());
    }

    //Final

    //Good Ending
    public void finalReact(Perro d, Persona p){
        if (d.getanimo() > 0){
            System.out.println("EL ánimo final de " + d.getNombre() + " es de " + d.getanimo());
            System.out.println("La confianza en "+ p.getNombre() + " terminó siendo de " + p.getConfianza());
            d.cola();
            p.colareact(d);
            System.out.println("");
            System.out.println("Has alcanzado una confianza alta con el perro. Buen trabajo.");
        }

        //Regular Ending
        if (d.getanimo() == 0){
            System.out.println("EL ánimo final de " + d.getNombre() + " fue de " + d.getanimo());
            System.out.println("La confianza en "+ p.getNombre() + " terminó siendo de " + p.getConfianza());
            d.ladrido();
            p.ladridoreact(d);
            System.out.println("");
            System.out.println("Has alcanzado una buena confianza con el perro. Sigue mejorando.");
        }

        //Bad Ending
        if (d.getanimo() <0){
            System.out.println("EL ánimo final de " + d.getNombre() + " fue de " + d.getanimo());
            System.out.println("La confianza en "+ p.getNombre() + " terminó siendo de " + p.getConfianza());
            d.mordida();
            p.mordidareact(d);
            System.out.println("");
            System.out.println("No has alcanzado una buena confianza con el perro. Vuelve a intentarlo.");
        }

    }


}

   




