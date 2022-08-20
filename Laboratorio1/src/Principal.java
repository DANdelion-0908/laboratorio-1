// Laboratorio 1
// Programación Orientada a Objetos

// Librerías y clases
import java.util.Scanner;
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static Persona Persona = new Persona();
    static Perro Perro = new Perro();
    static float animo = Perro.getanimo();
    static float confianza = (float) Persona.getConfianza();
    static Metodos metodo1 = new Metodos();
   

// Datos del perro y dueño
    public static void main(String[] args){
        System.out.println("*********************************************************");
        System.out.println("*Bienvenido al programa de entrenamiento para la perrera*");
        System.out.println("*********************************************************");
        System.out.println("Escribe los datos que se te piden a continuación");
        System.out.println("Escribe el nombre del perro: ");
        String NombreP = entrada.nextLine();
        Perro.setNombre(NombreP);
        System.out.println("Escribe el nombre del dueño del perro: ");
        String NombreD = entrada.nextLine();
        Persona.setNombre(NombreD);
        System.out.println("¿" + Persona.getNombre() + " tiene una galleta? ");
        System.out.println("Escribe un 1 para indicar que la tiene o un 0 para indicar que no la tiene.");
        int cookie = entrada.nextInt();
        while (cookie != 1 && cookie != 0){
            System.out.println("Error. Ingresa solamente 1 o 0.");
            cookie = entrada.nextInt();
        }
        Persona.setGalleta(cookie);
        System.out.println("El ánimo inicial de " + Perro.getNombre() + " es de: " + Perro.getanimo());
        System.out.println("La confiabilidad inicial de " + Persona.getNombre() + " es de " + Persona.getConfianza());
        Principal.driverProgram();
    }

  // Menú Principal
    public static void driverProgram(){
        Boolean condicion1 = true;
        while (condicion1){
            System.out.println("Bienvenido al entrenamiento con perros callejeros");
            System.out.println("Ingresa el número de la opción que desees ejecutar");
            System.out.println("1. Acariciar");
            System.out.println("2. Dar galleta");
            System.out.println("3. Jugar");
            System.out.println("4. Mostrar galleta");
            System.out.println("5.Salir");
            int op = entrada.nextInt();
            while (op < 1 || op > 7  ){
                System.out.println("Error. Ingresa un número de opción válido.");
            }

            if (op == 1){
                metodo1.acariciar(animo, confianza, Perro, Persona);   
            }
            if (op == 2){
                metodo1.darGalleta(animo, Persona, Perro, confianza);    
            }
            if (op == 3){
                metodo1.play(Perro, Persona, animo, confianza);
            }
            if (op == 4){
                metodo1.sacargalleta(Perro, Persona, animo, confianza);;
            }
            if (op == 5){
                metodo1.finalReact(Perro, Persona);
                condicion1 = false;
                
            }

        }
    }
}
    
    
