package tarea_profenino;

import java.util.Scanner;


/**
 *
 * @author ferna
 */
public class Persona {
    //01 crear metodos de la clase
    private String rut;
    private String nombre;
    private int edad;

    //02 crear getter y setter de la clase 
    // Getter: obtengo informacion    Setter: modifico informacion
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //03 constructor sin parametros

    public Persona() {
    }
    //03.1 constructor con parametros
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    //04 creamos metodos customer, retorna un dato entero y no recibe  argumentos
    public int validarEdad() {
        String edadValidada = "edad no existe";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese edad: ");
        int valorEdad = scanner.nextInt();

        
        if (valorEdad >= 18) {
            edadValidada = "persona mayor de edad";
            System.out.println(edadValidada);
            //le entrego el valor de la variable valorEdad al atributo de la clase edad
            this.edad = valorEdad;
        } else if (valorEdad >= 0 && valorEdad < 18) {
            edadValidada = "persona menor de edad";
            System.out.println(edadValidada);
            this.edad = 0;
        } else {
            System.out.println(edadValidada);
        }
        return valorEdad;

    }

    //05 creamos un toString para mostrar los datos de un objeto instanciado
    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
