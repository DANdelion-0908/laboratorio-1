//Librerías y clases

import java.util.Random;
public class Persona {
        private float confianza;
        private String nombre;
        private int galleta;
        Random rand = new Random();

        //Confianza en la persona

        public Persona(){
            confianza = rand.nextFloat(11);

        }

        //Reacción a recibir un ladrido

        public void ladridoreact(Perro d){
            System.out.print(nombre + " se ha asustado por los ladridos de " + d.getNombre());
        
        }

        //Reacción a ser mordido

        public void mordidareact(Perro d){
            System.out.print(nombre + " trata de escapar de la feroz mordida de " + d.getNombre());
        }

        //Reacción al movimiento de cola

        public void colareact(Perro d){
            System.out.print(nombre + " se ha alegrado porque " + d.getNombre() + " ha empezado a mover su cola");
        }

        //Getter de confianza

        public float getConfianza(){
            return confianza;
        }

        //Setter de confianza

        public void setConfianza(float confianza){
            this.confianza = confianza;

        }

        //Getter de nombre

        public String getNombre(){
            return nombre;

        }

        //Setter de nombre

        public void setNombre(String nombre){
            this.nombre = nombre;

        }

        //Getter de galleta

        public int getGalleta(){
            return galleta;

        }

        //Setter de galleta
        
        public void setGalleta(int cookie){
            this.galleta = cookie;
        }
}
