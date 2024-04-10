/*
 * 1. Programar una clase Persona con atributos suficientes para almacenar nombre,
 * apellido y edad de una persona.
 * Crear un programa que permita ingresar los datos de algunas personas por teclado y
 * con esos datos cree instancias y muestre por pantalla el estado de las mismas.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p01 = obtenerPersona();

        System.out.println("Los datos de las personas ingresadas son: ");
        System.out.println(p01); // IMP: NO HACE FALTA LLAMAR A .TOSTRING.

    }

    public static Persona obtenerPersona() {
        Scanner input = new Scanner(System.in);
        Persona objPersona = new Persona();
        System.out.println("Ingrese el nombre de la persona...");
        objPersona.setNombre(input.nextLine());
        System.out.println("Ingrese el apellido de " + objPersona.getNombre());
        objPersona.setApellido(input.nextLine());
        System.out.println("Ingrese la edad de " + objPersona.getNombre() +" "+ objPersona.getApellido());
        objPersona.setEdad(input.nextInt());
        System.out.println("Ingrese el peso de " + objPersona.getNombre() +" "+ objPersona.getApellido());
        objPersona.setPeso(input.nextDouble());
        System.out.println("Ingrese la altura de " + objPersona.getNombre() +" "+ objPersona.getApellido());
        objPersona.setAltura(input.nextDouble());
        return objPersona;
    }
}