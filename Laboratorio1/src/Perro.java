//Librerías y nombre de la clase

import java.util.Random;
public class Perro{

    //Ánimo del perro y acciones que dependen de este

    Random rand = new Random();
    public float animo;
    private String nombre;
    public Perro(){
        animo = rand.nextFloat(11) - 5;

    }

    //Getter de ánimo

    public float getanimo(){
        return animo;
        
    }

    //Setter de Ánimo

    public void setanimo(float animo){
        this.animo = animo;

    }

    //Mordida del perro

    public void mordida(){
        System.out.println(nombre + " te ha mordido.");

    }

    //Ladrido del perro

    public void ladrido(){
        System.out.println(nombre + " ha soltado un ladrido.");

    }

    //Movimiento de cola
    
    public void cola(){
        System.out.println(nombre + " está moviendo su cola de un lado a otro.");

    }

    //Nombre del perro

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
