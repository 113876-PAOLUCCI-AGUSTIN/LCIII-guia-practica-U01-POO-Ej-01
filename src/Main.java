/*
 * 1. Programar una clase Persona con atributos suficientes para almacenar nombre,
 * apellido y edad de una persona.
 * Crear un programa que permita ingresar los datos de algunas personas por teclado y
 * con esos datos cree instancias y muestre por pantalla el estado de las mismas.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persona p01 = new Persona();

        System.out.println("Ingrese el nombre de la persona...");
        p01.setNombre(input.nextLine());

        System.out.println("Ingrese el apellido de " + p01.getNombre());
        p01.setApellido(input.nextLine());

        System.out.println("Ingrese la edad de " + p01.getNombre() +" "+ p01.getApellido());
        p01.setEdad(input.nextInt());

        System.out.println("Los datos de la persona ingresada son:"+ p01.toString());
    }
}