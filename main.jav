/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_profenino;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //06 instancio un objeto persona de tipo Persona vacio  
        Persona persona1 = new Persona(); 
        //07 luego condiciono la edad que logramos obtener anteriormente mediante el metodo customer
        if(persona1.validarEdad() >= 18){
            //08 como la edad que viene sera mayor o igual a 18, solicito el nombre
            //y el rut mediante los metodos setter, finalmente imprimo todo el objeto creado
            System.out.println("ingrese nombre: ");
            persona1.setNombre(sc.nextLine());
            System.out.println("ingrese rut");
            persona1.setRut(sc.nextLine());
            System.out.println(persona1);
        }
        //09 no construi un else, ya que si no es mayor de edad lo estoy controlando desde el
        //metodo validarEdad()

        

    }
}
